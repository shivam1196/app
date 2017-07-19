package com.example.shivam.acm;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by shivam on 06/07/17.
 */

public class Contact_custom_adaptor extends BaseAdapter {
    Context context;
    String[] text={"Energy Acres, University of Petroleum and Energy Studies, Bidholi via Premnagar,\n" +

            "Dehradun, Uttarakhand- 248007","info.upesacm@gmail.com\nonline support ",
            "8 800 567.890.11\n+91 9557068744\nMon-Fri 9am-6pm "};
    int[] pic={R.drawable.contact1,R.drawable.contact2,R.drawable.contact3};
    LayoutInflater layoutInflater;
    Contact_custom_adaptor (Context context)
    {
        this.context=context;
        layoutInflater=(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return pic.length;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = layoutInflater.inflate(R.layout.contactus,null);
        ImageView imgView=(ImageView)view.findViewById(R.id.c_imgView);
        TextView  txtView=(TextView)view.findViewById(R.id.c_txtView);
        imgView.setImageResource(pic[position]);
        txtView.setText(text[position]);
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
}
