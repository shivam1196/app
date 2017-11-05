package com.example.shivam.pizza;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by shivam on 26/04/17.
 */


public class Custom_Adapter_Veg extends BaseAdapter {

    int [] veg;
    String [] nam;
    Context context;
    LayoutInflater layoutInflater;

    Custom_Adapter_Veg(Context context,int [] v,String [] n)
    {
        this.context= context;
        this.veg=v;
        this.nam=n;
        layoutInflater=(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return nam.length;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        
       View rview = layoutInflater.inflate(R.layout.veg_pizza,null);
        ImageView imgVeg=(ImageView)rview.findViewById(R.id.imgVeg);
        imgVeg.setImageResource(veg[position]);
        final TextView txtVeg= (TextView)rview.findViewById(R.id.txtVeg);
        txtVeg.setText(nam[position]);
//        txtVeg.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String order =(String) txtVeg.getText().toString();
//            }
//        });
        return rview;
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
