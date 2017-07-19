package com.example.shivam.acm;

import android.content.Context;
import android.os.AsyncTask;
import android.view.View;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by shivam on 28/06/17.
 */

public class Event_Async_Task extends AsyncTask<String[],Void,String[]> {
    Context context;
    TextView textView;
    ListView listView;
    View view;
    ProgressBar progressBar;
    Event_Async_Task(Context context,ListView listView,View view,ProgressBar progressBar)
    {
        this.context=context;
        this.textView=textView;
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
        String result1=null;
        String result3=null;
        String result4=null;
        String result2=null;
        String result5=null;
        String url1,url2,url3,url4,url5,url6;
        String[] url = strings[0];
        url1=url[0];
        url2=url[1];
        url3=url[2];
        url4=url[3];
        url5=url[4];
        url6=url[5];
        OkHttpClient client = new OkHttpClient();
        Request request1 = new Request.Builder().url(url1).build();
        Request request2 = new Request.Builder().url(url2).build();
        Request request3 = new Request.Builder().url(url3).build();
        Request request4 = new Request.Builder().url(url4).build();
        Request request5 = new Request.Builder().url(url5).build();
        Request request6 = new Request.Builder().url(url6).build();
        try {
            Response response1 = client.newCall(request1).execute();
            result=response1.body().string();
            Response response2 = client.newCall(request2).execute();
            result1=response2.body().string();
            Response response3 = client.newCall(request3).execute();
            result2=response3.body().string();
            Response response4 = client.newCall(request4).execute();
            result3=response4.body().string();
            Response response5 = client.newCall(request5).execute();
            result4=response5.body().string();
            Response response6 = client.newCall(request6).execute();
            result5=response6.body().string();
        } catch (IOException e) {
            e.printStackTrace();
        }
       String[] output = new String[]{result,result1,result2,result3,result4,result5};
        return output;
    }

    @Override
    protected void onPostExecute(String[] s) {
    String [] output1=null;
            String []output2=null;
                    String[] output3=null;
                String []output4=null;
                String []output5=null;
                        String []output6=null;
        try {
             output1 = s[0].split("#123#");
             output2= s[1].split("#123#");
             output3= s[2].split("#123#");
             output4= s[3].split("#123#");
             output5= s[4].split("#123#");
             output6= s[5].split("#123#");
        }catch (NullPointerException e)
        {
            Toast.makeText(context, "Slow Internet", Toast.LENGTH_SHORT).show();
        }


        progressBar.setVisibility(view.GONE);
        Event_Custom_Adapter eca = new Event_Custom_Adapter(context,output1,output2,output3,output4,output5,output6);
        listView.setAdapter(eca);
    }
}
