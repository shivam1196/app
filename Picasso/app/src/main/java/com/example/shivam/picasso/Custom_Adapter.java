package com.example.shivam.picasso;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.concurrent.ExecutionException;

/**
 * Created by shivam on 18/06/17.
 */

public class Custom_Adapter extends BaseAdapter {
    Context context;
    LayoutInflater layoutInflater;
    String url = "http://10.0.2.2/project_acm/show.php";
    String output= new UrlAsynkTask().execute(url).get();
    String names[]=output.split("#123#");

    Custom_Adapter(Context context) throws ExecutionException, InterruptedException {
        this.context=context;
        layoutInflater=(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = layoutInflater.inflate(R.layout.photo,null);
        ImageView photo_imgView1=(ImageView)view.findViewById(R.id.photo_imgView1);
        System.out.println(names[0]);
        Picasso.with(context).load("http://10.0.2.2/"+names[position]).into(photo_imgView1);
        return view;
    }

    @Override
    public int getCount() {
        return names.length;
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
