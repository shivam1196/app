package com.example.shivam.acm;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

/**
 * Created by shivam on 14/06/17.
 */

public class Project_Custom_Adapter extends BaseAdapter {
    String [] photos;
    String [] title;
    String [] mentor;
    String [] developer;
    String [] language;
    int lastposition=-1;
    LayoutInflater layoutInflater;
    Context context;
    Project_Custom_Adapter(Context context,String[] photos,String [] title,String [] mentor,String[] developer,String[] language)
    {
        this.context=context;
        this.developer=developer;
        this.photos=photos;
        this.language=language;
        this.mentor=mentor;
        this.title=title;
        layoutInflater=(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view=layoutInflater.inflate(R.layout.projects,null);
        ImageView project_imgView1=(ImageView)view.findViewById(R.id.project_imgView1);
        Picasso.with(context).load(photos[position]).fit().into(project_imgView1);
        TextView project_txtView1=(TextView)view.findViewById(R.id.project_txtView1);
        TextView project_txtView2=(TextView)view.findViewById(R.id.project_txtView2);
        TextView project_txtView3=(TextView)view.findViewById(R.id.project_txtView3);
        TextView project_txtView4=(TextView)view.findViewById(R.id.project_txtView4);
        TextView project_txtView5=(TextView)view.findViewById(R.id.project_txtView5);
        project_txtView2.setText(title[position]);
        project_txtView3.setText(mentor[position]);
        project_txtView4.setText(developer[position]);
        project_txtView5.setText(language[position]);
        final  View result=view;
        Animation animation= AnimationUtils.loadAnimation(context,(position > lastposition)?R.anim.load_down_anim:R.anim.load_up_anim);
        result.startAnimation(animation);
        lastposition=position;
        return  view;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public int getCount() {
        return mentor.length;
    }
}
