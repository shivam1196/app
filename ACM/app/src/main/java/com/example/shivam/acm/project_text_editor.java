package com.example.shivam.acm;

import android.content.ContentResolver;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class project_text_editor extends AppCompatActivity {
   private ImageView project_te_imgView1,project_te_imgView2;
    private TextView project_te_txtView1,project_te_txtView2,project_te_txtView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_text_editor);
        Uri uri = Uri.parse(ContentResolver.SCHEME_ANDROID_RESOURCE +
                "://" + getResources().getResourcePackageName(R.drawable.acmwcp)
                + '/' + getResources().getResourceTypeName(R.drawable.acmwcp) + '/' + getResources().getResourceEntryName(R.drawable.acmwcp) );
        Uri uri2 = Uri.parse(ContentResolver.SCHEME_ANDROID_RESOURCE +
                "://" + getResources().getResourcePackageName(R.drawable.ayushyadav)
                + '/' + getResources().getResourceTypeName(R.drawable.ayushyadav) + '/' + getResources().getResourceEntryName(R.drawable.ayushyadav) );
        project_te_imgView1=(ImageView)findViewById(R.id.project_te_imgView1);
        project_te_imgView2=(ImageView)findViewById(R.id.project_te_imgVIew2);
        Picasso.with(getApplicationContext()).load(uri).fit().into(project_te_imgView1);
        Picasso.with(getApplicationContext()).load(uri2).fit().into(project_te_imgView2);
        project_te_txtView1=(TextView)findViewById(R.id.project_te_txtView1);
        project_te_txtView2=(TextView)findViewById(R.id.project_te_txtView2);
        project_te_txtView3=(TextView)findViewById(R.id.project_te_txtView3);
        project_te_txtView3.setText("Description/Key Features\n" +
                "1. The feature of auto correct and spell check will be included.\n" +
                "2. Top suggestion i.e. autocomplete enable\n" +
                "3. Cursor motion enable\n" +
                "4. Keyboard shortcuts enable\n" +
                "5. Cut, copy and paste feature\n" +
                "6. Text-to-speech feature");
    }
}
