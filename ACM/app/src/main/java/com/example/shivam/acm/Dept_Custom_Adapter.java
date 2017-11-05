package com.example.shivam.acm;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by shivam on 27/06/17.
 */

public class Dept_Custom_Adapter extends BaseAdapter {
    Context context;
    String [] names;
    LayoutInflater layoutInflater;
    String [] dept={"DESIGN","EDITORIAL","EVENTS","PR/Mem/Sponsership","TECHNICAL"};
    Dept_Custom_Adapter(Context context,String [] names)
    {
        this.context=context;
        this.names=names;
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
        return names.length;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = layoutInflater.inflate(R.layout.department,null);
        TextView dept_txtView=(TextView)view.findViewById(R.id.dept_txtView);
        dept_txtView.setText(names[position]);
        return view;
    }
}
