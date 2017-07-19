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
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.ViewFlipper;

/**
 * Created by shivam on 13/06/17.
 */

public class About_Custom_Adapter extends BaseAdapter {
    Context context;
    int lastposition=-1;
  final   int [] photos;
    final String [] name;
    final String [] msg;
    LayoutInflater layoutInflater;
    About_Custom_Adapter(Context context,int[] photos,String [] name,String [] msg)
    {
        this.context=context;
        this.name=name;
        this.photos=photos;
        this.msg=msg;
        layoutInflater=(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return name.length;
    }
    @Override
    public long getItemId(final int position) {
        return position;
    }

    @Override
    public Object getItem(final int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View rview = layoutInflater.inflate(R.layout.home,null);
        final ViewFlipper viewFlipper=(ViewFlipper)rview.findViewById(R.id.home_vf);
       final  ImageView about_imgView=(ImageView)rview.findViewById(R.id.home_imgView1);
        final TextView about_txtView1=(TextView)rview.findViewById(R.id.home_txtView1);
        final TextView about_txtView2=(TextView)rview.findViewById(R.id.home_txtView2);
        final View result=rview;
        final ObjectAnimator animator= (ObjectAnimator) AnimatorInflater.loadAnimator(context,R.animator.flipping);
        about_imgView.setImageResource(photos[position]);
        about_txtView1.setText(name[position]);
        about_txtView2.setMovementMethod(new ScrollingMovementMethod());
        Animation animation= AnimationUtils.loadAnimation(context,(position > lastposition)?R.anim.load_down_anim:R.anim.load_up_anim);
        result.startAnimation(animation);
        lastposition=position;

        about_imgView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewFlipper.setInAnimation(context,R.anim.in_from_right);
                viewFlipper.setOutAnimation(context,R.anim.out_to_left);
                animator.setTarget(viewFlipper);
                animator.setDuration(1000);
                animator.start();
                viewFlipper.showNext();
                about_txtView2.setText(msg[position]);

            }
        });
        about_txtView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewFlipper.setInAnimation(context,R.anim.in_from_left);
                viewFlipper.setOutAnimation(context,R.anim.out_to_right);
                animator.setTarget(viewFlipper);
                animator.setDuration(1000);
                animator.start();
                viewFlipper.showPrevious();
                about_imgView.setImageResource(photos[position]);
                about_txtView1.setText(name[position]);
            }
        });

        return rview;
    }


}
