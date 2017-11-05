package com.example.shivam.acm;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by shivam on 10/06/17.
 */

public class Fragment_two extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_two,container,false);
       final int [] photos_acm={R.drawable.acm_png_file,R.drawable.acm_about1,R.drawable.acm_about2,R.drawable.acm_about3,
       R.drawable.acm_about4,R.drawable.acm_about5,R.drawable.acm_about6,R.drawable.acm_about7};
        final String [] text_acm={"About Us","Our Piece of Wisodom","A Little Community That' Grown Big",
        "Our Emphasis","Maintaining a balance For Overall Development"
        ,"DUTY OF ACM","Our Reach","Our Vision"};
        final String [] msg_acm={"“Dreams pass into the reality of action. From the actions stems the" +
                "dream again; and this interdependence produces the highest form of living.” " +
                "These golden words by Anais Nin couldn’t have been put better. " +
                "We, at UPES ACM Student Chapter, believe this piece of wisdom and form the " +
                "foundation to thrive and flourish. With every new step taken, we aim to fulfill our ambitions, " +
                "making it a journey of unexplored yet achievable goals. "
        ,"UPES ACM Student Chapter started its voyage from April 2010, by" +
                "organizing a competition on ‘Poster Presentation: IT Applications in the" +

                "Energy Sector.” Along with it, we also conducted a competition on" +

                "‘Paper Presentation: Green Computing,” besides the community" +

                "programs in 2010 and 2011 for ‘Computer Awareness.’ The program," +

                "organized by the university, aimed at advocating computer skills to the" +

                "talented students from nearby villages as a Corporate Social" +

                "Responsibility."
        ,"Because of the hard work and dedication of the UPES ACM family, our" +

                "chapter won the runners up award in “Best Student Chapter 2015”" +

                "category. This was just the beginning as a few months later, we won the" +

                "winners award “Best Student Chapter for Outstanding Chapter Activities" +

                "2015.”"
        ,"Sharing Technological Advancement with Everyone",
        "The chapter also maintains a balance between co-curricular " +
                "events and extra-curricular events as it is well known that “All work and no play make Jack a dull boy.”"
        ,"We understand our responsibilities as a technical chapter- “To educate" +

                "and grow together.” With our main focus on making the family industry-" +
                "ready, perfect blend of academic brilliance and practicality is what we" +

                "always strive for."
        ,"We aren’t limited to just computer science engineers, but have some" +

                "members from distinguished domains of technological fraternity," +

                "including Artificial Neural Networks, Computational Fluid Dynamics, and" +

                "many more."
        ,"With the integrity to honour, follow and set international " +
                "standards through, UPES ACM Student Chapter will always endeavour to follow its motto: " +
                "“A journey set to make histories!”"};
        final String [] text_acmw={"About US","Our Vision","Our Reach"};
        final int [] photos_acmw={R.drawable.acm_w,R.drawable.acm_about7,R.drawable.acm_w_reach};
        final String [] msg_acmw={"The UPES ACM-W Student Chapter was founded in April 2015 with an" +

                "aim to realize the dynamic image of women in the field of computers" +

                "and information technology, and to provide them with a platform to" +

                "showcase their technical skills. We try to follow in these steps, creating" +

                "a community where all men"
                ,"UPES ACM-W Student Chapter made their presence felt at “Grace" +

                "Hopper Celebration of Women in Computing” the largest gathering of" +

                "women technologists from all over India. The event was held on 7th, 8th" +


                "and 9th December 2016 at Bangalore, India.",
        "UPES ACM-W represented and made there presence felt at Grace Hopper. " +
                "The largest gathering of women technologists in India," +
                " Grace Hopper celebration of women in computing was held on 7th, 8th and 9th December 2016, in Bangalore, India."};
//        ImageView f2imgView1=(ImageView)view.findViewById(R.id.f2imgView1);
//        f2imgView1.setImageResource(R.drawable.logocombined);
        final TextView f2txtView2=(TextView)view.findViewById(R.id.f2txtView2);
        final TextView f2txtView3=(TextView)view.findViewById(R.id.f2txtView3);
        final ListView f2lstView1=(ListView)view.findViewById(R.id.f2lstView1);
        About_Custom_Adapter aca = new About_Custom_Adapter(getContext(),photos_acm,text_acm,msg_acm);
       // f2txtView2.setBackgroundColor(Color.parseColor("#55FF000"));
        f2lstView1.setAdapter(aca);
        f2txtView2.setBackgroundResource(R.drawable.wall);
        f2txtView3.setBackgroundResource(R.drawable.spane);
        f2txtView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f2txtView3.setBackgroundResource(R.drawable.wall);
                f2txtView2.setBackgroundResource(R.drawable.spane);
                Home_Custom_adapter aca1= new Home_Custom_adapter(getContext(),photos_acmw,text_acmw,msg_acmw);
                f2lstView1.setAdapter(aca1);
            }
        });
        f2txtView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f2txtView2.setBackgroundResource(R.drawable.wall);
                f2txtView3.setBackgroundResource(R.drawable.spane);
                About_Custom_Adapter aca = new About_Custom_Adapter(getContext(),photos_acm,text_acm,msg_acm);
                f2lstView1.setAdapter(aca);
            }
        });
        return view;

    }
}
