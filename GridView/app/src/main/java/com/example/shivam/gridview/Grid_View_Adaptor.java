package com.example.shivam.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

/**
 * Created by shivam on 25/06/17.
 */

public class Grid_View_Adaptor extends BaseAdapter {
    int [] pic;
    Context context;
    LayoutInflater layoutInflater;
    Grid_View_Adaptor(Context context,int[] pic)
    {
        this.context=context;
        this.pic=pic;
        layoutInflater=(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

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
        return pic.length;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = layoutInflater.inflate(R.layout.gallery,null);
        ImageView picture=(ImageView)view.findViewById(R.id.picture);
        picture.setImageResource(pic[position]);
        return view;
    }
}
