package com.example.shivam.pizza;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView txtWelcome,txtWelcome2;
    Button btnP1Next;
    ImageView imgViewWelcome1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtWelcome = (TextView)findViewById(R.id.txtWelcome);
        txtWelcome2=(TextView)findViewById(R.id.txtWelcome2);
        btnP1Next=(Button)findViewById(R.id.btnP1Next);
        imgViewWelcome1=(ImageView)findViewById(R.id.imgViewWelcome1);
        btnP1Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Main_Menu.class);
                startActivity(intent);
            }
        });
    }
}
