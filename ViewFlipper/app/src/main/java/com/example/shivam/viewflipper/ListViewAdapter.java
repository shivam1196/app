package com.example.shivam.viewflipper;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.ViewFlipper;

/**
 * Created by shivam on 06/07/17.
 */

public class ListViewAdapter extends BaseAdapter {
    String[] name1={"Shivam","Sachin","Mukul","Sakshi","Tigeress"};
    String[] name2={"Agra","Mumbai","Shimla","Faridabad","Banaras"};
    Context context;
    LayoutInflater layoutInflater;
    ListViewAdapter(Context context)
    {
        this.context=context;
        layoutInflater=(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return name1.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View view = layoutInflater.inflate(R.layout.adapter,null);
        final ViewFlipper viewFlipper=(ViewFlipper)view.findViewById(R.id.vf);
        final TextView txtView1=(TextView)view.findViewById(R.id.txtView1);
        final TextView txtView2=(TextView)view.findViewById(R.id.txtView2);
        txtView1.setText(name1[position]);
        txtView2.setText(name2[position]);
      final  ObjectAnimator animator= (ObjectAnimator) AnimatorInflater.loadAnimator(context,R.animator.flipping);
        animator.setTarget(viewFlipper);
        animator.setDuration(3000);
        animator.start();
//        viewFlipper.setInAnimation(context,R.anim.in_from_left);
//        viewFlipper.setOutAnimation(context,R.anim.out_to_right);
//        viewFlipper.setAutoStart(true);
//        viewFlipper.setFlipInterval(4000);

        txtView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewFlipper.setInAnimation(context,R.anim.in_from_left);
                viewFlipper.setOutAnimation(context,R.anim.out_to_right);
//                viewFlipper.showNext();
                animator.setTarget(viewFlipper);
                animator.setDuration(3000);
                animator.start();
                viewFlipper.showNext();

            }
        });
        txtView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewFlipper.setInAnimation(context,R.anim.in_from_right);
                viewFlipper.setOutAnimation(context,R.anim.out_to_left);
//                viewFlipper.showPrevious();
                animator.setTarget(viewFlipper);
                animator.setDuration(3000);
                animator.start();
                viewFlipper.showPrevious();

            }
        });
        return view;
    }
}
