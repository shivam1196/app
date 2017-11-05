package com.example.shivam.acm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

public class Members extends AppCompatActivity {
    String [] design={"Nikita ","Utkarsh ","Jatin"};
    String [] editorial={"Sugandh " ,
            "Shinjana " ,
            "Rituja " ,
            "Smriti  " ,
            "Rahul " ,
            "Vasudha" ,
            "Yuvraj  " ,
            "Utkarsh " ,
            "Sumit "};
    String [] events={"Kritika" , "Arshiya ","Rishab ", "Parth " , "Poorva " , "Astitva " , "Sahil " , "Raksha " , "Manish " , "Paravjot " , "Shruti " ,"Abhishek " , "Yaduraj " , "Rishabh " , "Nikunj "};
    String [] sponsor={"Nupur","Ishita","Saransh","Janhvi","Arpita","Mitali","Arnav",
                        "Amit","Muskan","Rishabh","Shivam","Priyanshu","Smarth","V.Rohit","Nakul","Deepanshu","Poorva"};
    String [] tech={"Abhinandan","Akash","Ayush","Sonali","Kaustabh","Palash","Ashi","Dikshit","Naman","Shrey","Sandeep","Prateek",
    "Gaurav","Utkarsh","Deepanshu","Nikunj","Nakul","Ritvik","Krishna","Jai","Udit"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_members);
        GridView gridView1=(GridView)findViewById(R.id.mem_grdView);
        TextView mem_txtView1=(TextView)findViewById(R.id.mem_txt1);
        Bundle b = getIntent().getExtras();
        int bnum= b.getInt("id");
        String text=b.getString("name");
       // Toast.makeText(this, "out"+bnum, Toast.LENGTH_SHORT).show();
            if(bnum==0) {
                //   Toast.makeText(this, "in", Toast.LENGTH_SHORT).show();
                Dept_Custom_Adapter dca = new Dept_Custom_Adapter(getApplicationContext(), design);
                mem_txtView1.setText("TEAM MEMBERS");
                gridView1.setAdapter(dca);
            }
            if(bnum==1)
            {
                Dept_Custom_Adapter dca = new Dept_Custom_Adapter(getApplicationContext(),editorial);
                mem_txtView1.setText("TEAM MEMBERS");
                gridView1.setAdapter(dca);
            }
            if(bnum==2)
            {
                Dept_Custom_Adapter dca = new Dept_Custom_Adapter(getApplicationContext(),events);
                mem_txtView1.setText("TEAM MEMBERS");
                gridView1.setAdapter(dca);
            }
            if(bnum==3)
            {
                Dept_Custom_Adapter dca = new Dept_Custom_Adapter(getApplicationContext(),sponsor);
                mem_txtView1.setText("TEAM MEMBERS");
                gridView1.setAdapter(dca);
            }
            if(bnum==4)
            {
                Dept_Custom_Adapter dca =new Dept_Custom_Adapter(getApplicationContext(),tech);
                mem_txtView1.setText("TEAM MEMBERS");
                gridView1.setAdapter(dca);
            }

    }
}
