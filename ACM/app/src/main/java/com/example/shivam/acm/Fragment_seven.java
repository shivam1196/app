package com.example.shivam.acm;

import android.icu.util.ValueIterator;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

/**
 * Created by shivam on 10/06/17.
 */

public class Fragment_seven extends Fragment {
    ProgressBar progressBar;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_seven,container,false);
        progressBar=(ProgressBar)view.findViewById(R.id.progressBar);
        TextView f7txt1=(TextView)view.findViewById(R.id.f7txt1);
        GridView grdView=(GridView)view.findViewById(R.id.grdView);
      //  ImageView expandedImage=(ImageView)view.findViewById(R.id.expandedImage);
        String url_gallery="https://sumancrown101.000webhostapp.com/project_acm/showgallery.php";
        String output=null;
        String [] gal;
        int mShortDuration= getResources().getInteger(android.R.integer.config_shortAnimTime);
        UrlAsyncTask uat = new UrlAsyncTask(getContext(),view,grdView,progressBar);
        try {
            uat.execute(url_gallery);
        }
        catch ( Exception e)
        {
            e.printStackTrace();
        }

        return view;
    }
}
