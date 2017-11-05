package com.example.shivam.pizza;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by shivam on 26/04/17.
 */

public class Fragment_Two extends android.support.v4.app.Fragment {
    String names[]={"Chicken Peeper","Mexican Chicken","Tandoori Chicken"};
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_two,container,false);
        final ListView lstNonveg=(ListView)view.findViewById(R.id.lstNonveg);

        int pizz[]={R.drawable.nonveg1,R.drawable.nonveg2,R.drawable.nonveg3};
        Custom_Adapter_Veg cav = new Custom_Adapter_Veg(getContext(),pizz,names);
        lstNonveg.setAdapter(cav);
        lstNonveg.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int order= (int)lstNonveg.getItemAtPosition(position);
                Toast.makeText(getContext(), names[order]+"", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
