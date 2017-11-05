package com.example.shivam.picasso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    ListView p1lstView1;
    Custom_Adapter ca;
    TextView txtView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    p1lstView1=(ListView)findViewById(R.id.p1lstVIew1);
        try {


            ca= new Custom_Adapter(MainActivity.this);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        p1lstView1.setAdapter(ca);
    }
}
