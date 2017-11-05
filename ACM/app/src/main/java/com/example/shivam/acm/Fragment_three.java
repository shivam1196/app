package com.example.shivam.acm;

import android.content.ContentResolver;
import android.content.Intent;
import android.icu.util.ValueIterator;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by shivam on 10/06/17.
 */

public class Fragment_three extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_three,container,false);
        Uri uri = Uri.parse(ContentResolver.SCHEME_ANDROID_RESOURCE +
                "://" + getResources().getResourcePackageName(R.drawable.project_text_editor)
                + '/' + getResources().getResourceTypeName(R.drawable.project_text_editor) + '/' + getResources().getResourceEntryName(R.drawable.project_text_editor) );
        Uri uri1 = Uri.parse(ContentResolver.SCHEME_ANDROID_RESOURCE +
                "://" + getResources().getResourcePackageName(R.drawable.project_upes_lms)
                + '/' + getResources().getResourceTypeName(R.drawable.project_upes_lms) + '/' + getResources().getResourceEntryName(R.drawable.project_upes_lms) );
        Uri uri2 = Uri.parse(ContentResolver.SCHEME_ANDROID_RESOURCE +
                "://" + getResources().getResourcePackageName(R.drawable.project_elocs)
                + '/' + getResources().getResourceTypeName(R.drawable.project_elocs) + '/' + getResources().getResourceEntryName(R.drawable.project_elocs) );
        Uri uri3 = Uri.parse(ContentResolver.SCHEME_ANDROID_RESOURCE +
                "://" + getResources().getResourcePackageName(R.drawable.project_vasp)
                + '/' + getResources().getResourceTypeName(R.drawable.project_vasp) + '/' + getResources().getResourceEntryName(R.drawable.project_vasp) );
        String [] photos={uri.toString(),uri1.toString(),uri2.toString(),uri3.toString()};
        String [] title={"Text Editor","UPES-LMS","e-LOCS","VASP"};
        String [] developer={"Developer: Ayush Yadav","Developer: Durva Tiwari","Developer: Utkarsh Sandeep Singh","Developer: Vyom Amulya and Parv"};
        String [] mentor={"Mentor: Akshat Chaturvedi","Mentor: Nikil Gupta","Mentor: Akshat Chaturvedi","Mentor: Ashish Malhotra"};
        String [] language={"Language: C/C++","Language: C/C++","Language: Java","Language: Java on Android"};
        TextView f3txt1=(TextView)view.findViewById(R.id.f3txt1);
        ListView f3lstView1=(ListView)view.findViewById(R.id.f3lstView1);
        Project_Custom_Adapter pca = new Project_Custom_Adapter(getContext(),photos,title,mentor,developer,language);
        f3lstView1.setAdapter(pca);
        f3lstView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0)
                {
                    Intent intent = new Intent(getContext(),project_text_editor.class);
                    startActivity(intent);
                }
                if(position == 1)
                {
                    Intent intent = new Intent(getContext(),project_upes_lms.class);
                    startActivity(intent);
                }
                if(position==2)
                {
                    Intent intent = new Intent(getContext(),project_elaundry.class);
                    startActivity(intent);
                }
                if(position==3)
                {
                    Intent intent = new Intent(getContext(),project_vasp.class);
                    startActivity(intent);
                }
            }
        });
        return view;
    }
}
