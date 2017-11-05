package com.example.shivam.acm;

import android.content.Context;
import android.os.AsyncTask;
import android.view.View;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by shivam on 28/06/17.
 */

public class Team_Async_Task extends AsyncTask<String ,Void,String> {
    ListView listView;
    View view;
    ProgressBar progressbar;
    Context context;
    Team_Custom_Adapter team_custom_adapter;
    String [] names,images,positions,details;
    Team_Async_Task(Context context, ListView listView,String[] names, String[] positions,View view,ProgressBar progressbar,String[] details)
    {
        this.listView=listView;
        this.names=names;
        this.images=images;
        this.positions=positions;
        this.context=context;
        this.progressbar=progressbar;
        this.view=view;
        this.details=details;

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
        String[] output=null;
        try {
      output = s.split("#123#");
    }catch (NullPointerException e)
        {
            Toast.makeText(context, "Slow Internet...", Toast.LENGTH_SHORT).show();
        }

        progressbar.setVisibility(view.GONE);
        Team_Custom_Adapter tca = new Team_Custom_Adapter(context,output,names,positions,details);

        listView.setAdapter(tca);

    }
}
