package com.example.shivam.acm;

import android.content.ContentResolver;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.io.File;
import java.net.URI;

public class project_elaundry extends AppCompatActivity {
    ImageView el_imgView1,el_imgView2;
    TextView el_txtView1,el_txtView2,el_txtView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_elaundry);
        el_imgView1=(ImageView)findViewById(R.id.el_imgView1);
        Uri uri = Uri.parse(ContentResolver.SCHEME_ANDROID_RESOURCE +
                "://" + getResources().getResourcePackageName(R.drawable.acmwcp)
                + '/' + getResources().getResourceTypeName(R.drawable.acmwcp) + '/' + getResources().getResourceEntryName(R.drawable.acmwcp) );
        Picasso.with(getApplicationContext()).load(uri).fit().into(el_imgView1);

      //  el_imgView1.setImageResource(R.drawable.acmwcp);
        el_imgView2=(ImageView)findViewById(R.id.el_imgView2);
        Uri uri2 = Uri.parse(ContentResolver.SCHEME_ANDROID_RESOURCE +
                "://" + getResources().getResourcePackageName(R.drawable.utkarsh_sandeep_singh)
                + '/' + getResources().getResourceTypeName(R.drawable.utkarsh_sandeep_singh) + '/' + getResources().getResourceEntryName(R.drawable.utkarsh_sandeep_singh) );
      //  el_imgView2.setImageResource(R.drawable.utkarsh_sandeep_singh);
        Picasso.with(getApplicationContext()).load(uri2).fit().into(el_imgView2);
        el_txtView1=(TextView)findViewById(R.id.el_txtView1);
        el_txtView2=(TextView)findViewById(R.id.el_txtView2);
        el_txtView3=(TextView)findViewById(R.id.el_txtView3);
        el_txtView3.setMovementMethod(new ScrollingMovementMethod());
        el_txtView3.setText(" Description/Key Feature :\n" +
                "\n" +
                "E-LOCS, or electronic Laundry of Clothes System, is a simple and effective system for hostellers and paying guests. The main objective for the e-LOCS is to reduce the load of daily need and to focus on better things. A very straightforward solution who can’t wash and iron clothes themselves. ");
    }
}
