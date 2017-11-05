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
import android.widget.Toast;

import com.squareup.picasso.NetworkPolicy;
import com.squareup.picasso.Picasso;

/**
 * Created by shivam on 20/06/17.
 */

public class Team_Custom_Adapter extends BaseAdapter {
    String [] images,names,post,details;
    Context context;
    LayoutInflater layoutInflater;
    int lastposition=-1;
    Team_Custom_Adapter(Context context,String [] images,String [] names,String [] post,String[] details)
    {
        this.images=images;
        this.context=context;
        this.names=names;
        this.post=post;
        this.details=details;
        layoutInflater=(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        try {
            return images.length;
        }catch (NullPointerException e)
        {
            Toast.makeText(context, "Downloading...", Toast.LENGTH_SHORT).show();
        }
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = layoutInflater.inflate(R.layout.teams,null);
        System.out.println(images.length);
        ImageView team_imgVIew1=(ImageView)view.findViewById(R.id.team_imgVIew1);
        Picasso.with(context).load("https://sumancrown101.000webhostapp.com/"+images[position]).fit().into(team_imgVIew1);
        Picasso.with(context).setLoggingEnabled(true);
        TextView team_txtView0=(TextView)view.findViewById(R.id.team_txtView0);
        team_txtView0.setText(names[position]);
        TextView team_txtView2=(TextView)view.findViewById(R.id.team_txtView2);
        team_txtView2.setText(post[position]);
        TextView team_txtView1=(TextView)view.findViewById(R.id.team_txtView1);
        team_txtView1.setText(details[position]);
        final View result=view;
        Animation animation= AnimationUtils.loadAnimation(context,(position > lastposition)?R.anim.load_down_anim:R.anim.load_up_anim);
        result.startAnimation(animation);
        lastposition=position;
        return view;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }
}
