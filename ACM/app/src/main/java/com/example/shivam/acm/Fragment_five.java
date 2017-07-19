package com.example.shivam.acm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by shivam on 10/06/17.
 */

public class Fragment_five extends Fragment {

    String [] dept={"DESIGN","EDITORIAL","EVENTS","PR/Mem/Sponsership","TECHNICAL"};
    LayoutInflater layoutinflater;
    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_five,container,false);
        TextView f5txt1=(TextView)view.findViewById(R.id.f5txt1);
        ListView dept_lstView=(ListView)view.findViewById(R.id.dept_lstView);
        Dept_Custom_Adapter dca = new Dept_Custom_Adapter(getContext(),dept);
        dept_lstView.setAdapter(dca);
        dept_lstView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0)
                {
                   // Toast.makeText(getContext(), "Editorial", Toast.LENGTH_SHORT).show();
                    Intent intent= new Intent(getContext(),Members.class);
                    Bundle b = new Bundle();
                    b.putInt("id",0);
                    b.putString("name","DESIGN");
                    intent.putExtras(b);
                    startActivity(intent);

                }
                if(position==1)
                {
                    Intent intent = new Intent(getContext(),Members.class);
                    Bundle b =new Bundle();
                    b.putInt("id",1);
                    b.putString("name","EDITORIAL");
                    intent.putExtras(b);
                    startActivity(intent);
                }
                if (position==2)
                {
                    Intent intent = new Intent(getContext(),Members.class);
                    Bundle b = new Bundle();
                    b.putInt("id",2);
                    b.putString("name","EVENTS");
                    intent.putExtras(b);
                    startActivity(intent);
                }
                if(position==3)
                {
                    Intent intent = new Intent(getContext(),Members.class);
                    Bundle b = new Bundle();
                    b.putInt("id",3);
                    b.putString("name","PR/MEM/SPONSERSHIP");
                    intent.putExtras(b);
                    startActivity(intent);
                }
                if(position==4)
                {
                    Intent intent = new Intent(getContext(),Members.class);
                    Bundle b = new Bundle();
                    b.putInt("id",4);
                    b.putString("name","TECHNICAL");
                    intent.putExtras(b);
                    startActivity(intent);
                }

            }
        });
        return view;
    }
}
