package com.example.shivam.acm;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by shivam on 10/06/17.
 */

public class Fragment_eight extends Fragment {
    ImageView imageView,imageView2,imageView3;
    TextView textView,textView2,textView3;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.frgament_eight,container,false);
        ListView c_lstView=(ListView)view.findViewById(R.id.c_lstView);
        Contact_custom_adaptor cca= new Contact_custom_adaptor(getContext());
        c_lstView.setAdapter(cca);
        return view;
    }
}
