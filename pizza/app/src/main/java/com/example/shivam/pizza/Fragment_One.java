package com.example.shivam.pizza;


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
 * Created by shivam on 26/04/17.
 */

public class Fragment_One extends Fragment {
    String names[]={"Veg Cloud 9","Veg Dish","Veg Paradise"};
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_one,container,false);
        final ListView lstVeg=(ListView)view.findViewById(R.id.lstVeg);
        int pic[]={R.drawable.vegcloud9,R.drawable.vegdish6,R.drawable.vegparadise};
        Custom_Adapter_Veg cav = new Custom_Adapter_Veg(getContext(),pic,names);
        lstVeg.setAdapter(cav);
        lstVeg.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                  int order = (int)lstVeg.getItemAtPosition(position);
                  Toast.makeText(getContext(), names[order]+"", Toast.LENGTH_SHORT).show();

            }
        });
        return view;
    }
}
