package com.example.shivam.acm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ImageView imgViewWelcome,imgView2welcome;
    private TextView txtWelcome;
    private Button btnWelcome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridView gridView=(GridView)findViewById(R.id.lstView1);
        List_Custom_Adapter lca = new List_Custom_Adapter(getBaseContext());
        gridView.setAdapter(lca);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0)
                {
                    Intent intent = new Intent(MainActivity.this,MainScreen.class);
                    Bundle b = new Bundle();
                    b.putInt("id",position);
                    intent.putExtras(b);
                    startActivity(intent);
                   // finish();
                }
                else if(position==1)
                {
                    Intent intent = new Intent(MainActivity.this,MainScreen.class);
                    Bundle b = new Bundle();
                    b.putInt("id",position);
                    intent.putExtras(b);
                    startActivity(intent);
                    //finish();
                }
                else if (position==2)
                {
                    Intent intent = new Intent(MainActivity.this,MainScreen.class);
                    Bundle b = new Bundle();
                    b.putInt("id",position);
                    intent.putExtras(b);
                    startActivity(intent);
                    //finish();
                }
                else if (position==3)
                {
                    Intent intent = new Intent(MainActivity.this,MainScreen.class);
                    Bundle b = new Bundle();
                    b.putInt("id",position);
                    intent.putExtras(b);
                    startActivity(intent);
                    //finish();
                }
                else if (position==4)
                {
                    Intent intent = new Intent(MainActivity.this,MainScreen.class);
                    Bundle b = new Bundle();
                    b.putInt("id",position);
                    intent.putExtras(b);
                    startActivity(intent);
                    //finish();
                }
                else if (position==5)
                {
                    Intent intent = new Intent(MainActivity.this,MainScreen.class);
                    Bundle b = new Bundle();
                    b.putInt("id",position);
                    intent.putExtras(b);
                    startActivity(intent);
                    //finish();
                }
                else if (position==6)
                {
                    Intent intent = new Intent(MainActivity.this,MainScreen.class);
                    Bundle b = new Bundle();
                    b.putInt("id",position);
                    intent.putExtras(b);
                    startActivity(intent);
                    //finish();
                }
                else if (position==7)
                {
                    Intent intent = new Intent(MainActivity.this,MainScreen.class);
                    Bundle b = new Bundle();
                    b.putInt("id",position);
                    intent.putExtras(b);
                    startActivity(intent);
                    //finish();
                }
                else if (position==8)
                {
                    Intent intent = new Intent(MainActivity.this,MainScreen.class);
                    Bundle b = new Bundle();
                    b.putInt("id",position);
                    intent.putExtras(b);
                    startActivity(intent);
                    //finish();
                }
            }
        });




    }
}
