package com.example.shivam.acm;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

/**
 * Created by shivam on 11/06/17.
 */

public class Home_Custom_adapter extends BaseAdapter {
    int [] photos;
    String [] text;
    String [] msg;
    Context context;
    int lastposition=-1;
    LayoutInflater layoutInflater;
    Home_Custom_adapter(Context context,int [] photos,String [] text,String [] msg)
    {
        this.photos=photos;
        this.msg=msg;
        this.text=text;
        this.context=context;
        layoutInflater=(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return text.length;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View rview = layoutInflater.inflate(R.layout.home,null);
        final ViewFlipper viewFlipper=(ViewFlipper)rview.findViewById(R.id.home_vf);
       final ImageView home_imgView1=(ImageView)rview.findViewById(R.id.home_imgView1);
         home_imgView1.setImageResource(photos[position]);
       final TextView home_txtView1=(TextView)rview.findViewById(R.id.home_txtView1);
        home_txtView1.setText(text[position]);
        final TextView home_txtView2=(TextView)rview.findViewById(R.id.home_txtView2);
        home_txtView2.setText(msg[position]);
        home_txtView2.setMovementMethod(new ScrollingMovementMethod());
        final View result=rview;
        final ObjectAnimator animator= (ObjectAnimator) AnimatorInflater.loadAnimator(context,R.animator.flipping);
        Animation animation= AnimationUtils.loadAnimation(context,(position > lastposition)?R.anim.load_down_anim:R.anim.load_up_anim);
        result.startAnimation(animation);
        lastposition=position;
        home_imgView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewFlipper.setInAnimation(context,R.anim.in_from_right);
                viewFlipper.setOutAnimation(context,R.anim.out_to_left);
                animator.setTarget(viewFlipper);
                animator.setDuration(1000);
                animator.start();
                viewFlipper.showNext();


            }
        });
        home_txtView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewFlipper.setInAnimation(context,R.anim.in_from_left);
                viewFlipper.setOutAnimation(context,R.anim.out_to_right);
                animator.setTarget(viewFlipper);
                animator.setDuration(1000);
                animator.start();
                viewFlipper.showPrevious();
            }
        });
        return rview;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }
}
