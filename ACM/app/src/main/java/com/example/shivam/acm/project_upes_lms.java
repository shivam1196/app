package com.example.shivam.acm;

import android.content.ContentResolver;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class project_upes_lms extends AppCompatActivity {
    ImageView project_lms_imgView1,project_lms_imgView2;
    TextView project_lms_txtView1,project_lms_txtView2,project_lms_txtView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_upes_lms);
        Uri uri = Uri.parse(ContentResolver.SCHEME_ANDROID_RESOURCE +
                "://" + getResources().getResourcePackageName(R.drawable.nikhil)
                + '/' + getResources().getResourceTypeName(R.drawable.nikhil) + '/' + getResources().getResourceEntryName(R.drawable.nikhil) );
        Uri uri2 = Uri.parse(ContentResolver.SCHEME_ANDROID_RESOURCE +
                "://" + getResources().getResourcePackageName(R.drawable.durva)
                + '/' + getResources().getResourceTypeName(R.drawable.durva) + '/' + getResources().getResourceEntryName(R.drawable.durva) );
        project_lms_imgView1=(ImageView)findViewById(R.id.project_lms_imgVIew1);
        Picasso.with(getApplicationContext()).load(uri).fit().into(project_lms_imgView1);
//        project_lms_imgView1.setImageResource(R.drawable.nikhil);
        project_lms_imgView2=(ImageView)findViewById(R.id.project_lms_imgView2);
        Picasso.with(getApplicationContext()).load(uri2).fit().into(project_lms_imgView2);
//        project_lms_imgView2.setImageResource(R.drawable.durva);
        project_lms_txtView1=(TextView)findViewById(R.id.project_lms_txtView1);
        project_lms_txtView2=(TextView)findViewById(R.id.project_lms_txtView2);
        project_lms_txtView3=(TextView)findViewById(R.id.project_lms_txtView3);
        project_lms_txtView3.setMovementMethod(new ScrollingMovementMethod());
        project_lms_txtView3.setText(" Description/Key Feature :\n" +
                "\n" +
                "Our university has an online library management system " +
                "where we can view the list of books we've borrowed. " +
                "I would like to design an application, " +
                "where not only can we view the books we've borrowed, " +
                "but also all the books available in library, " +
                "the books which need to returned back soon. " +
                "Also, I would like to introduce various utilities like" +
                " starting to notify the user 2 or 3 days before the return date of the book. " +
                "Until and unless the user has returned the book, the app would notify them. " +
                "Even then, if they fail to do so, they can pay the late fee charges from our app. " +
                "They can also re-issue the books from the app. ");

    }
}
