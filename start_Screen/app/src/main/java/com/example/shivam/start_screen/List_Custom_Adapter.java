package com.example.shivam.start_screen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by shivam on 08/07/17.
 */

public class List_Custom_Adapter extends BaseAdapter {
    Context context;
    LayoutInflater layoutInflater;
    String[] text={"ABOUT","HOME","PROJECT","BOARD OF HONOURS","EVENTS","OFFICE BEARERS","DEPARTMENTS","GALLERY","CONTACT US"};
    int [] img={R.drawable.about_us,R.drawable.home_page,R.drawable.projects,R.drawable.achievements,R.drawable.events,R.drawable.officebearers,
    R.drawable.departments,R.drawable.gallery,R.drawable.contactus,R.drawable.about_150,R.drawable.achievements_150,R.drawable.homepage_150};
    List_Custom_Adapter(Context context)
    {
        this.context=context;
        layoutInflater=(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return img.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = layoutInflater.inflate(R.layout.page,null);
        ImageView imageView=(ImageView)view.findViewById(R.id.imageView);
        imageView.setImageResource(img[position]);
        TextView txtView=(TextView)view.findViewById(R.id.txtView);
        txtView.setText(text[position]);
        return view;
    }
}
