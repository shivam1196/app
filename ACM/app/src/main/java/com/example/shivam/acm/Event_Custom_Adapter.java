package com.example.shivam.acm;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;

/**
 * Created by shivam on 26/06/17.
 */

public class Event_Custom_Adapter extends BaseAdapter {
    String [] title,team,venue,date,time,description;
    Context context;
    LayoutInflater layoutInflater;
     int lastposition=-1;
    Event_Custom_Adapter(Context context ,String [] title,String[] team,String[] venue,String[] date,String[] time,String[] description)
    {
        this.context=context;
        this.title=title;
        this.team=team;
        this.venue=venue;
        this.date=date;
        this.time=time;
        this.description=description;
        layoutInflater=(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getCount() {
        try {
            return title.length;
        }catch (NullPointerException e)
        {
            Toast.makeText(context, "Downloading...", Toast.LENGTH_SHORT).show();
        }
       return 0;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View view =layoutInflater.inflate(R.layout.events,null);

       final ViewFlipper events_vf=(ViewFlipper)view.findViewById(R.id.event_vf);
      final   TextView title_txtView=(TextView)view.findViewById(R.id.title_txtView);
       final TextView team_txtView=(TextView)view.findViewById(R.id.team_txtView);
       final TextView venue_txtView=(TextView)view.findViewById(R.id.venue_txtView);
        final ObjectAnimator animator= (ObjectAnimator) AnimatorInflater.loadAnimator(context,R.animator.flipping);
        TextView date_txtView=(TextView)view.findViewById(R.id.date_txtView);
        TextView time_txtView=(TextView)view.findViewById(R.id.time_txtView);
        TextView description_txtView=(TextView)view.findViewById(R.id.description_txtView);
        title_txtView.setText(title[position]);
        team_txtView.setText(team[position]);
        venue_txtView.setText(venue[position]);
        date_txtView.setText(date[position]);
        time_txtView.setText(time[position]);
        description_txtView.setText(description[position]);
        final View result=view;
        Animation animation= AnimationUtils.loadAnimation(context,(position > lastposition)?R.anim.load_down_anim:R.anim.load_up_anim);
        result.startAnimation(animation);
        lastposition=position;
        title_txtView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                events_vf.setInAnimation(context,R.anim.in_from_right);
                events_vf.setOutAnimation(context,R.anim.out_to_left);
                animator.setTarget(events_vf);
                animator.setDuration(1000);
                animator.start();
                events_vf.showNext();
            }
        });
        team_txtView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                events_vf.setInAnimation(context,R.anim.in_from_right);
                events_vf.setOutAnimation(context,R.anim.out_to_left);
                animator.setTarget(events_vf);
                animator.setDuration(1000);
                animator.start();
                events_vf.showNext();
            }
        });
        venue_txtView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                events_vf.setInAnimation(context,R.anim.in_from_right);
                events_vf.setOutAnimation(context,R.anim.out_to_left);
                animator.setTarget(events_vf);
                animator.setDuration(1000);
                animator.start();
                events_vf.showNext();
            }
        });
        date_txtView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                events_vf.setInAnimation(context,R.anim.in_from_right);
                events_vf.setOutAnimation(context,R.anim.out_to_left);
                animator.setTarget(events_vf);
                animator.setDuration(1000);
                animator.start();
                events_vf.showNext();
            }
        });
        time_txtView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                events_vf.setInAnimation(context,R.anim.in_from_right);
                events_vf.setOutAnimation(context,R.anim.out_to_left);
                animator.setTarget(events_vf);
                animator.setDuration(1000);
                animator.start();
                events_vf.showNext();
            }
        });
        description_txtView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                events_vf.setInAnimation(context,R.anim.in_from_left);
                events_vf.setOutAnimation(context,R.anim.out_to_right);
                animator.setTarget(events_vf);
                animator.setDuration(1000);
                animator.start();
                events_vf.showPrevious();
            }
        });
        return  view;
    }
}
