package com.example.shivam.start_screen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridView gridView=(GridView)findViewById(R.id.lstView1);
        List_Custom_Adapter lca = new List_Custom_Adapter(getBaseContext());
        gridView.setAdapter(lca);
    }
}
