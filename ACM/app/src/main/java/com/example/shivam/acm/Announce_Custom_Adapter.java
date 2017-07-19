package com.example.shivam.acm;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.provider.ContactsContract;
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

import com.squareup.picasso.Picasso;

/**
 * Created by shivam on 07/07/17.
 */

public class Announce_Custom_Adapter extends BaseAdapter {
    String [] title;
    String [] description;
    String [] images;
    Context context;
    LayoutInflater layoutInflater;
    int lastposition=-1;
    Announce_Custom_Adapter(Context context,String[] title,String[] description,String [] images)
    {
        this.context=context;
        this.title=title;
        this.description=description;
        this.images=images;
        layoutInflater=(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = layoutInflater.inflate(R.layout.announce,null);
        final ViewFlipper viewFlipper=(ViewFlipper)view.findViewById(R.id.home_vf);
        TextView textView =(TextView)view.findViewById(R.id.home_txtView1);
       final TextView textView1=(TextView)view.findViewById(R.id.home_txtView2);
        ImageView imageView=(ImageView)view.findViewById(R.id.home_imgView1);
        TextView textView2=(TextView)view.findViewById(R.id.textView4);
        Picasso.with(context).load("https://sumancrown101.000webhostapp.com/"+images[position]).into(imageView);
        textView.setText(title[position]);
        textView1.setText(description[position]);
        textView1.setMovementMethod(new ScrollingMovementMethod());
        final  View result=view;
        final ObjectAnimator animator= (ObjectAnimator) AnimatorInflater.loadAnimator(context,R.animator.flipping);
        Animation animation= AnimationUtils.loadAnimation(context,(position > lastposition)?R.anim.load_down_anim:R.anim.load_up_anim);
        result.startAnimation(animation);
        lastposition=position;
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewFlipper.setInAnimation(context,R.anim.in_from_right);
                viewFlipper.setOutAnimation(context,R.anim.out_to_left);
                animator.setTarget(viewFlipper);
                animator.setDuration(1000);
                animator.start();
                viewFlipper.showNext();
                textView1.setMovementMethod(new ScrollingMovementMethod());

            }
        });
        textView1.setOnClickListener(new View.OnClickListener() {
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
        return view;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getCount() {
        return images.length;
    }
}
