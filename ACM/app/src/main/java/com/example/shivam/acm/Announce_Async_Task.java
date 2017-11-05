package com.example.shivam.acm;

import android.content.Context;
import android.os.AsyncTask;
import android.view.View;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by shivam on 07/07/17.
 */

public class Announce_Async_Task extends AsyncTask<String[],Void,String[]> {
    Context context;
    ListView listView;
    View view;
    ProgressBar progressBar;
    String url1="https://sumancrown101.000webhostapp.com/project_acm/Announcements/title.php";
    String url2="https://sumancrown101.000webhostapp.com/project_acm/Announcements/description.php";
    String url3="https://sumancrown101.000webhostapp.com/project_acm/show_announce_img.php";
    Announce_Async_Task(Context context,ListView listView,View view,ProgressBar progressBar)
    {
        this.context=context;
        this.listView=listView;
        this.view=view;
        this.progressBar=progressBar;
    }

    @Override
    protected void onPreExecute() {
        progressBar.setVisibility(view.VISIBLE);
    }

    @Override
    protected String[] doInBackground(String[]... strings) {
         String result=null;
        String result2 = null;
        String result3=null;

        OkHttpClient client = new OkHttpClient();
        Request request1 = new Request.Builder().url(url1).build();
        Request request2= new Request.Builder().url(url2).build();
        Request request3 = new Request.Builder().url(url3).build();

        try {
            Response response1= client.newCall(request1).execute();
            result=response1.body().string();
            Response response2= client.newCall(request2).execute();
            result2= response2.body().string();
            Response response3= client.newCall(request3).execute();
            result3=response3.body().string();

        } catch (IOException e) {
            e.printStackTrace();
        }
        String[]  output={result,result2,result3};
        return output;
    }

    @Override
    protected void onPostExecute(String[] strings) {
        progressBar.setVisibility(view.GONE);
        String [] title=null;
        String [] description=null;
        String [] images=null;
        try {
             title=strings[0].split("#123#") ;
             description=strings[1].split("#123#");
             images=strings[2].split("#123#");
        }catch (NullPointerException e)
        {
            Toast.makeText(context, "Slow Internet...", Toast.LENGTH_SHORT).show();
        }

        Announce_Custom_Adapter aca = new Announce_Custom_Adapter(context,title,description,images);
        listView.setAdapter(aca);
    }
}
