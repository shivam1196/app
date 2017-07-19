package com.example.shivam.picasso;

import android.os.AsyncTask;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Call;
import okhttp3.Callback;
/**
 * Created by shivam on 18/06/17.
 */

public class UrlAsynkTask extends AsyncTask<String,Void,String> {
    String output;
    @Override
    protected String doInBackground(String... strings) {
       try
       {
           String url = strings[0];
           OkHttpClient client= new OkHttpClient();
           Request request = new Request.Builder().url(url).build();
           Response response = client.newCall(request).execute();
           output= response.body().string();
           return output;
       }catch (Exception e)
       {
           e.printStackTrace();
       }
        return null;
    }
}
