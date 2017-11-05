package com.example.shivam.acm;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;

/**
 * Created by shivam on 10/06/17.
 */

public class Fragment_one extends android.support.v4.app.Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view= inflater.inflate(R.layout.fragment_one,container,false);


        int [] photo={R.drawable.chairman_acm,R.drawable.acmwcp,R.drawable.outstanding_website,R.drawable.awards,R.drawable.acm_w_award,R.drawable.awards_2,R.drawable.awards_3,R.drawable.aicwic,R.drawable.csr_1,R.drawable.hoc};
        String [] msg={"Chairperson UPES-ACM","Chairperson UPES-ACM-W","Congratulations UPES ACM","Runner Up in Best Student Chapter Award","ACM-W setting new standards","Outstanding Chapter Activities","Outstanding Recruitment Program",
        "All India ACM Women's Conference","Hour of Code","CSR"};
        String [] text={"Technology is nothing. What’s important is that you have a faith in people, that they’re basically good and smart, and if you give them tools, they’ll do wonderful things with them."
                ,"ACM-W believes in growing together by creating and enculcating a healthy" +
                "environment for women in the field of Technology.Being leader is not only about power,it\'s about" +
                "listening and motivating your Team.","UPES ACM Student chapter bagged the Award for Outstanding Website 2017. Hence leaving a mark in Technical Aspect as well.","The Efforts of the students were recognised at the highest level, as UPES" +
                "ACM comes second in the category of BEST STUDENT CHAPTER AWARD.","The ACM-W complimented there male counterpart as UPES ACM" +
                "-W bags second position in the category of BEST STUDENT CHAPTER AWARD.","A serious of activities conducted by the student" +
                " chapter proved a method of embedding technical skills as UPES ACM recieves Outstanding Chapter Activities"
        ,"A thorough recuritment program implemented by the chapter which leads to the invlovement of brilliant " +
                "young minds with the chapter."," UPES ACM-W was elected to host the" +
                "" +
                "ACM-W India Celebration of Women in Computing (AICWiC'16) in" +
                "" +
                "October. The annual conference brought an exclusive spotlight for all" +
                "" +
                "aspiring women to brand their savvy, and celebrate their prowess in the" +
                "" +
                "computing arena through.","As a part of the global movement, UPES ACM parts its share towards " +
                "the cause by spreading computing among the school kids through interactive teaching sessions. " +
                "The event was held at Brightlands School, Dehradun on 14th December 2016. ",
                "UPES - ACM Student Chapter conducted a Corporate Social Responsibility (CSR) " +
                        "activity on 15-04-2017 in Baluni Public School. The agenda of this activity " +
                        "was to inform children about the various aspects of computing that they might" +
                        "not be aware about. "};
        Home_Custom_adapter hca = new Home_Custom_adapter(getContext(),photo,msg,text);
        ListView f1lstView1=(ListView)view.findViewById(R.id.f1lstView1);
        f1lstView1.setAdapter(hca);
        return  view;
    }
}
