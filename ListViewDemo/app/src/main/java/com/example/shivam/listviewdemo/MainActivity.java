package com.example.shivam.listviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView lstView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstView=(ListView)findViewById(R.id.lstView);
        String [] friends={"Tanny","Tigeress","Poo","Shifu"};

        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,friends);
        lstView.setAdapter(arrayAdapter);
        lstView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0)
                {
                    Toast.makeText(MainActivity.this, "1", Toast.LENGTH_SHORT).show();
                }
                if(position == 1)
                {
                    Toast.makeText(MainActivity.this, "2", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
