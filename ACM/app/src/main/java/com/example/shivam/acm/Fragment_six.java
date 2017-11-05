package com.example.shivam.acm;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.concurrent.ExecutionException;

/**
 * Created by shivam on 10/06/17.
 */

public class Fragment_six extends Fragment {
    TextView f6_txtView2,f6_txtView3,f6_txtView4;
    ListView f6_lstView;
    String url="https://sumancrown101.000webhostapp.com/project_acm/showcore.php";
    String name_url="https://sumancrown101.000webhostapp.com/project_acm/acmwshowcore.php";
    String mentor="https://sumancrown101.000webhostapp.com/project_acm/showmentor.php";
    String output,output_name,output_mentor;
    String [] images,acmw_images,mentor_images;
    String [] names={"Mr. Pankaj Badoni",
            "Dr. Hitesh Kumar Sharma","Mr. Shubhankar Nath","Mr. Rachit Singhal"
    ,"Mr. Alok Pandey","Mr. Aayush Shrivastava","Mr. Aditya Srivastava","Mr Ashish Malhotra","Mr. Parv Singhal"
    ,"Mr. Vyom Maitherya","Mr. Ayush Yadav","Mr. Shivam Srivastava","Mr. Ashwin Arora","Mr. Bharat Arya","Mr. Sugandh Agarwal",
    "Ms. Durva Tiwari","Mr. Rajat","Mr. Piyush Sharma","Ms. Shreya Jain"};
    String [] postions={"Faculty Mentor","Faculty Mentor",
    "Chairperson","Vice-Chairperson","Secretary","Joint Secretary","Executive Head",
    "Webmaster","Event Head","Executive Head","VFX & Design Head","App Development Head",
    "PR Head","Membership Head","Sponsorship Head","Sponsorship Head","Treasurer",
    "Editorial Head","Editorial Head"};
    String [] acmw_names={"Dr. Rashmi Sharma","Mr. Akshat Chaturvedi","Ms. Aashna Jain","Mr. Saransh Gahlot",
    "Ms. Preetbala Kaur Bhatia","Ms. Amulya Yadav","Mr. Aditya Srivastava","Mr. Sanyam Jain","Mr. Avnish Gupta",
    "Mr. Abhishek Raj","Ms. Nikita Duhan","Mr. Ankush Sharma"};
    String [] acmw_position={"Faculty Mentor","Chairperson","Vice-Chairperson","Treasurer","Secretary",
    "Joint-Secretary","Executive Head(Tech)","Webmaster","Design Head","Event Head","Editorial Head","PR Head"};
    String [] mentor_name={"Mr.Raushan Ranjan","Ms.Tanupriya Bhasin","Mr.Nikhil Gupta"};
    String [] mentor_position={"PR/Membership/Spns Mentor","Event Mentor","Technical Mentor"};
    String [] acm_det={"Assistant Professor\nSeating: 8103","Assistant Professor\nSeating:8105","Cyber Security\nIV Year",
    "Cloud Computing\nIV Year","Business Analytics\nIII Year","Cyber Security\nIII Year","Cyber Security\nIV Year",
    "Telecom Informatics\nIV Year","Cloud Computing\nIII Year","Open Source \nIII Year","Graphics and Gaming\nII Year",
    "Cyber Security\nIV Year","Open Source\nII Year","Open Source\nII Year","Business Analytics\nII Year","Mainframe Technology\nII Year",
    "Cyber Security\nIII Year","Business Analytics\nII Year","Cloud Computing\nIII Year"};
    String[] acmw_det={"Assistant Professor(SS)\nSeating:10104","Cloud Computing\nIV Year","Cyber Security\nIV Year","Mainframe Technology\nII Year",
    "Cloud Computing\nIV Year","HealthCare \nIII Year","Cyber Security\nIV Year","E-Commerce\nIII Year","Graphics and Gaming\nII Year",
    "Cloud Computing\nIII Year","Open Source\nII Year","Open Source\nIII Year"};
    String mentor_det[]={"Cyber Security\nIV Year","Cyber Security\nIV Year","Cloud Computing\nIV Year"};
    Team_Async_Task tak;
    private ProgressBar progressBar;
    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_six,container,false);
       progressBar=(ProgressBar)view.findViewById(R.id.progressBar);
        TextView f6txt1 =(TextView)view.findViewById(R.id.f6txt1);
        f6_txtView2=(TextView)view.findViewById(R.id.f6_txtView2);
        f6_txtView3=(TextView)view.findViewById(R.id.f6_txtView3);
        f6_txtView4=(TextView)view.findViewById(R.id.f6_txtView4);
        f6_lstView=(ListView) view.findViewById(R.id.f6_lstView);

         tak = new Team_Async_Task(getContext(),f6_lstView,names,postions,view,progressBar,acm_det);

            tak.execute(url);
        f6_txtView2.setBackgroundResource(R.drawable.wall);
        f6_txtView3.setBackgroundResource(R.drawable.spane);
        f6_txtView4.setBackgroundResource(R.drawable.spane);
//        UrlAsyncTask ucat = new UrlAsyncTask();
//       // UrlAsyncTask ucat1=new UrlAsyncTask();
//        //UrlAsyncTask ucat3=new UrlAsyncTask();
//        try {
//             output= ucat.execute(url).get();
//          // output_name=ucat1.execute(name_url).get();
//           // output_mentor= ucat3.execute(mentor).get();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        }
//        images=output.split("#123#");
//        //acmw_images=output_name.split("#123#");
//        //mentor_images=output_mentor.split("#123#");
//        Team_Custom_Adapter tca= new Team_Custom_Adapter(getContext(),images,names,postions);
//        f6_lstView.setAdapter(tca);
        f6_txtView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f6_txtView3.setBackgroundResource(R.drawable.wall);
                f6_txtView2.setBackgroundResource(R.drawable.spane);
                f6_txtView4.setBackgroundResource(R.drawable.spane);
                Team_Async_Task tak1 = new Team_Async_Task(getContext(),f6_lstView,acmw_names,acmw_position,view,progressBar,acmw_det);

                    tak1.execute(name_url);

            }
        });
        f6_txtView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f6_txtView2.setBackgroundResource(R.drawable.wall);
                f6_txtView3.setBackgroundResource(R.drawable.spane);
                f6_txtView4.setBackgroundResource(R.drawable.spane);
                Team_Async_Task tak2=new Team_Async_Task(getContext(),f6_lstView,names,postions,view,progressBar,acm_det);

                    tak2.execute(url);

            }
        });
        f6_txtView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f6_txtView4.setBackgroundResource(R.drawable.wall);
                f6_txtView2.setBackgroundResource(R.drawable.spane);
                f6_txtView3.setBackgroundResource(R.drawable.spane);
                Team_Async_Task tak3= new Team_Async_Task(getContext(),f6_lstView,mentor_name,mentor_position,view,progressBar,mentor_det);

                    tak3.execute(mentor);

            }
        });
        return  view;
    }
}
