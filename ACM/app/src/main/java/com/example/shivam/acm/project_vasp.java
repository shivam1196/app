package com.example.shivam.acm;

import android.content.ContentResolver;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class project_vasp extends AppCompatActivity {
    private ImageView project_vasp_imgView1,project_vasp_imgView2,project_vasp_imgView3,project_vasp_imgView4;
    private TextView project_vasp_txtView1,project_vasp_txtView2,project_vasp_txtView3,project_vasp_txtView4,project_vasp_txtView5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_vasp);
        Uri uri = Uri.parse(ContentResolver.SCHEME_ANDROID_RESOURCE +
                "://" + getResources().getResourcePackageName(R.drawable.ashish1)
                + '/' + getResources().getResourceTypeName(R.drawable.ashish1) + '/' + getResources().getResourceEntryName(R.drawable.ashish1) );
        Uri uri2 = Uri.parse(ContentResolver.SCHEME_ANDROID_RESOURCE +
                "://" + getResources().getResourcePackageName(R.drawable.amulya1)
                + '/' + getResources().getResourceTypeName(R.drawable.amulya1) + '/' + getResources().getResourceEntryName(R.drawable.amulya1) );
        Uri uri3 = Uri.parse(ContentResolver.SCHEME_ANDROID_RESOURCE +
                "://" + getResources().getResourcePackageName(R.drawable.parv1)
                + '/' + getResources().getResourceTypeName(R.drawable.parv1) + '/' + getResources().getResourceEntryName(R.drawable.parv1) );
        Uri uri4 = Uri.parse(ContentResolver.SCHEME_ANDROID_RESOURCE +
                "://" + getResources().getResourcePackageName(R.drawable.vyom)
                + '/' + getResources().getResourceTypeName(R.drawable.vyom) + '/' + getResources().getResourceEntryName(R.drawable.vyom) );
        project_vasp_imgView1=(ImageView)findViewById(R.id.project_vasp_imgView1);
        Picasso.with(getApplicationContext()).load(uri).fit().into(project_vasp_imgView1);
//        project_vasp_imgView1.setImageResource(R.drawable.ashish1);
        project_vasp_imgView2=(ImageView)findViewById(R.id.project_vasp_imgView2);
        Picasso.with(getApplicationContext()).load(uri2).fit().into(project_vasp_imgView2);
//        project_vasp_imgView2.setImageResource(R.drawable.amulya1);
        project_vasp_imgView3=(ImageView)findViewById(R.id.project_vasp_imgVIew3);
        Picasso.with(getApplicationContext()).load(uri3).fit().into(project_vasp_imgView3);
//        project_vasp_imgView3.setImageResource(R.drawable.parv1);
        project_vasp_imgView4=(ImageView)findViewById(R.id.project_vasp_imgView4);
        Picasso.with(getApplicationContext()).load(uri4).fit().into(project_vasp_imgView4);
//        project_vasp_imgView4.setImageResource(R.drawable.vyom);
        project_vasp_txtView1=(TextView)findViewById(R.id.project_vasp_txtView1);
        project_vasp_txtView2=(TextView)findViewById(R.id.project_vasp_txtView2);
        project_vasp_txtView3=(TextView)findViewById(R.id.project_vasp_txtView3);
        project_vasp_txtView4=(TextView)findViewById(R.id.project_vasp_txtView4);
        project_vasp_txtView5=(TextView)findViewById(R.id.project_vasp_txtView5);
        project_vasp_txtView5.setText(" Description/Key Feature :\n" +
                "\n" +
                "An android app, for the healthcare sector." +
                " The aim is to bridge up the gap between doctors and patients " +
                "via an app and allow patients to easily get appointments, at favorable time by using application. ");

    }
}
