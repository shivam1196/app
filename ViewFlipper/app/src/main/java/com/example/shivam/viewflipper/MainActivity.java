package com.example.shivam.viewflipper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lstView1=(ListView)findViewById(R.id.lstView1);
        ListViewAdapter lva = new ListViewAdapter(getApplicationContext());
        lstView1.setAdapter(lva);
    }
}
