package com.example.shivam.acm;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.concurrent.ExecutionException;

/**
 * Created by shivam on 25/06/17.
 */

public class Gallery_Custom_Adapter extends BaseAdapter {
    Context context;
    LayoutInflater layoutInflater;
int lastposition=-1;

    String output ;
    String [] gal;

    Gallery_Custom_Adapter(Context context,String [] gal)
    {
        this.context=context;
        this.gal=gal;
        layoutInflater=(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        try
        {
            return gal.length;
        }catch (NullPointerException e)
        {
            Toast.makeText(context, "Downloading...", Toast.LENGTH_SHORT).show();
        }
       return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = layoutInflater.inflate(R.layout.gallery,null);
    final View result=view;
        ImageView gallery_imgVIew1=(ImageView)view.findViewById(R.id.gallery_imgVIew1);
        Picasso.with(context).load("https://sumancrown101.000webhostapp.com/"+gal[position]).into(gallery_imgVIew1);
        Animation animation= AnimationUtils.loadAnimation(context,(position > lastposition)?R.anim.load_down_anim:R.anim.load_up_anim);
        result.startAnimation(animation);
        lastposition=position;

        return view;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

}
