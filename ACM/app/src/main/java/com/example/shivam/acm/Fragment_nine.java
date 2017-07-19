package com.example.shivam.acm;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

/**
 * Created by shivam on 07/07/17.
 */

public class Fragment_nine extends android.support.v4.app.Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_nine,container,false);
        TextView nine_txtView1=(TextView)view.findViewById(R.id.nine_txtVIew1);
        ListView listView=(ListView)view.findViewById(R.id.nine_lstView);
        ProgressBar progressBar=(ProgressBar)view.findViewById(R.id.progressBar_nine);
        Announce_Async_Task aat= new Announce_Async_Task(getContext(),listView,view,progressBar);
        aat.execute();
        return view;
    }
}
