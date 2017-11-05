package com.example.shivam.acm;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.concurrent.ExecutionException;

/**
 * Created by shivam on 10/06/17.
 */

public class Fragment_four  extends Fragment{
    String output,output2,output3,output4,output5,output6;
   private ProgressBar progressBar;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        String [] title,team,venue,date,time,description;
        String url_title="https://sumancrown101.000webhostapp.com/project_acm/events/title.php";
        String url_team="https://sumancrown101.000webhostapp.com/project_acm/events/team.php";
        String url_venue="https://sumancrown101.000webhostapp.com/project_acm/events/venue.php";
        String url_date="https://sumancrown101.000webhostapp.com/project_acm/events/date.php";
        String url_time="https://sumancrown101.000webhostapp.com/project_acm/events/time.php";
        String url_description="https://sumancrown101.000webhostapp.com/project_acm/events/description.php";
        String [] final_url={url_title, url_team,url_venue,url_date,url_time,url_description};
        View view =inflater.inflate(R.layout.fragment_four,container,false);
        progressBar =(ProgressBar)view.findViewById(R.id.progressBar);
        TextView f4txt1=(TextView)view.findViewById(R.id.f4txt1);
        ListView event_lstView=(ListView)view.findViewById(R.id.event_lstView);
        Event_Async_Task eat1 = new Event_Async_Task(getContext(),event_lstView,view,progressBar);

            eat1.execute(final_url);


        return view;
    }
}
