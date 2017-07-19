package com.example.shivam.acm;

import android.content.Context;
import android.os.AsyncTask;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by shivam on 20/06/17.
 */

public class UrlAsyncTask extends AsyncTask<String,Void,String> {
    View view;
    GridView grd_View;
    Context context;
    String [] gal;
    ProgressBar progressbar;
    ImageView imageView;
    int mShort;
    UrlAsyncTask(Context context,View view,GridView grd_View,ProgressBar progressbar)
    {
        this.view=view;
        this.grd_View=grd_View;
        this.context=context;
        this.progressbar=progressbar;
        this.imageView=imageView;
        this.mShort=mShort;
    }
    @Override
    protected String doInBackground(String... strings) {
        String output = null;
        String url = strings[0];
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(url).build();
        try {
            Response response = client.newCall(request).execute();
            output=response.body().string();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return output;
    }

    @Override
    protected void onPreExecute() {
        progressbar.setVisibility(view.VISIBLE);
    }

    @Override
    protected void onPostExecute(String s) {
        final int mShortDur=0;
        try {
            gal=s.split("#123#");
        }catch (NullPointerException e)
        {
            Toast.makeText(context, "Downloading...", Toast.LENGTH_SHORT).show();
        }

        progressbar.setVisibility(view.GONE);
        Gallery_Custom_Adapter gca= new Gallery_Custom_Adapter(context,gal);

        grd_View.setAdapter(gca);
//        grd_View.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                ZoomImageThumb zit = new ZoomImageThumb(view,gal[position],context,imageView,mShortDur,grd_View,position,gal);
//                zit.zoomImage();
//            }
//        });

    }
}
