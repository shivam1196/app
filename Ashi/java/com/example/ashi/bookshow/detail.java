package com.example.ashi.bookshow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Intent i2 = getIntent();
        Bundle b = i2.getExtras();
        String cname = b.getString("cname");
        String tname = b.getString("tname");
        String mname = b.getString("mname");
        String stime = b.getString("stime");
        //int[] ID = b.getIntArray("ids");
        TextView textView1, textView2, textView3, textView4, textView5;
        textView1 = (TextView) findViewById(R.id.textView1);
        textView2 = (TextView) findViewById(R.id.textView2);
        textView3 = (TextView) findViewById(R.id.textView3);
        textView4 = (TextView) findViewById(R.id.textView4);
        textView5 = (TextView) findViewById(R.id.textView5);
        textView1.setText("metro city name: " + cname);
        textView2.setText("Theatre:" + tname);
        textView3.setText("movie:" + mname);
        textView4.setText("show time:" + stime);
        textView5.setText("seat numbers: ");
        //textView5.setText("seat numbers: " + ID[0] + " " + ID[1] + " " + ID[2] + " " + ID[3] + " " + ID[4] + " " + ID[5] + " " + ID[6] + " " + ID[7] + " " + ID[8] + " " + ID[9] + " ");
    }
}
