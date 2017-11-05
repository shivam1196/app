package com.example.shivam.demo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView Act1txtView1;
    Button Act1btn1,Btn2;
    EditText Act1edtText1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Act1txtView1=(TextView)findViewById(R.id.Act1txtView1);
        Act1txtView1.setText("Welcome to Day 1");
        Act1btn1=(Button)findViewById(R.id.Act1btn1);
        Act1btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "U clicked Me", Toast.LENGTH_SHORT).show();
            }
        });
        Act1edtText1=(EditText)findViewById(R.id.Act1edtText1);
        Btn2=(Button)findViewById(R.id.Btn2);
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String msg= Act1edtText1.getText().toString();
                Toast.makeText(MainActivity.this, msg+"", Toast.LENGTH_SHORT).show();
            }
        });
        Act1txtView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Clicked Me", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
