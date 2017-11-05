package com.example.shivam.gridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lstView=(ListView)findViewById(R.id.lstView);
        int [] pic ={R.drawable.eh,R.drawable.editorial1,R.drawable.gallery4,R.drawable.gallery3};
        Grid_View_Adaptor gva = new Grid_View_Adaptor(getApplicationContext(),pic);
        lstView.setAdapter(gva);
    }
}
