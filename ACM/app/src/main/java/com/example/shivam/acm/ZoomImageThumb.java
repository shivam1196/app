package com.example.shivam.acm;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.GridView;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by shivam on 05/07/17.
 */

public class ZoomImageThumb {
    View view;
    String image;
    ImageView imageView;
    Context context;
    Animator mCurrentAnimator;
    int mShortDur;
    GridView gridView;
    static final int SWIPE_MIN_DISTANCE = 120;
    static final int SWIPE_THRESHOLD_VELOCITY = 200;
    int pos;
    String[] img;

    ZoomImageThumb(View view, String image, Context context, ImageView imageView, int mShortDur, GridView gridView, int pos,String[] img) {
        this.context = context;
        this.image = image;
        this.imageView = imageView;
        this.view = view;
        this.mShortDur = mShortDur;
        this.gridView = gridView;
        this.pos = pos;
    }

    void zoomImage() {
     // final   GestureDetector detector = new GestureDetector(context,new SwipeGestureDetector());
        if (mCurrentAnimator != null) {
            mCurrentAnimator.cancel();
        }
       // imageView = (ImageView) view.findViewById(R.id.expandedImage);
//        imageView.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//                if (detector.onTouchEvent(event)) {
//                    return true;
//                } else {
//                    return false;
//                }
//            }
//        });
        Picasso.with(context).load("https://sumancrown101.000webhostapp.com/" + image).into(imageView);
        final Rect startBounds = new Rect();
        final Rect finalBounds = new Rect();
        final Point globalOffSet = new Point();
        view.getGlobalVisibleRect(startBounds);
        view.findViewById(R.id.grdView).getGlobalVisibleRect(finalBounds, globalOffSet);
        startBounds.offset(-globalOffSet.x, -globalOffSet.y);
        finalBounds.offset(-globalOffSet.x, -globalOffSet.y);
        float startScale;
        if ((float) finalBounds.width() / finalBounds.height() > (float) startBounds.width() / startBounds.height()) {
            startScale = (float) startBounds.height() / finalBounds.height();
            float startWidth = startScale * finalBounds.width();
            float deltaWidth = (startWidth - startBounds.width() / 2);
            startBounds.left -= deltaWidth;
            startBounds.right += deltaWidth;
        } else {
            startScale = (float) startBounds.width() / finalBounds.width();
            float startHeight = startScale * finalBounds.height();
            float deltaHeight = (startHeight = startBounds.height()) / 2;
            startBounds.top -= deltaHeight;
            startBounds.bottom += deltaHeight;
        }
        view.setAlpha(0f);
        imageView.setVisibility(view.VISIBLE);
        imageView.setPivotX(0f);
        imageView.setPivotY(0f);

        AnimatorSet set = new AnimatorSet();
        set.play(ObjectAnimator.ofFloat(imageView, view.X, startBounds.left, finalBounds.left)).
                with(ObjectAnimator.ofFloat(imageView, view.Y, startBounds.top, finalBounds.top)).
                with(ObjectAnimator.ofFloat(imageView, view.SCALE_X, startScale, 1f)).
                with(ObjectAnimator.ofFloat(imageView, view.SCALE_Y, startScale, 1f));
        set.setDuration(mShortDur);
        set.setInterpolator(new DecelerateInterpolator());
        set.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationCancel(Animator animation) {
                mCurrentAnimator = null;
            }

            @Override
            public void onAnimationEnd(Animator animation) {
                mCurrentAnimator = null;
            }
        });
        set.start();
        mCurrentAnimator = set;
        final float startScaleFinal = startScale;
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mCurrentAnimator != null) {
                    mCurrentAnimator.cancel();
                }
                AnimatorSet set = new AnimatorSet();
                set.play(ObjectAnimator.ofFloat(imageView, view.X, startBounds.left)).
                        with(ObjectAnimator.ofFloat(imageView, view.Y, startBounds.top)).
                        with(ObjectAnimator.ofFloat(imageView, view.SCALE_X, startScaleFinal)).
                        with(ObjectAnimator.ofFloat(imageView, view.SCALE_Y, startScaleFinal));
                set.setDuration(mShortDur);
                set.setInterpolator(new DecelerateInterpolator());
                set.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationCancel(Animator animation) {
                        view.setAlpha(1f);
                        imageView.setVisibility(view.GONE);
                        mCurrentAnimator = null;
                    }

                    @Override
                    public void onAnimationEnd(Animator animation) {
                        view.setAlpha(1f);
                        imageView.setVisibility(view.GONE);
                        mCurrentAnimator = null;
                    }
                });
                set.start();
                mCurrentAnimator = set;
            }
        });

    }

//    class SwipeGestureDetector extends GestureDetector.SimpleOnGestureListener {
//
//
//
//
//        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
//            try {
//                if (e1.getX() - e2.getY() > 120 && Math.abs(velocityX) > 200) {
//                    if (img.length > pos)
//                    {
//                        pos ++;
//                        if(pos <img.length)
//                        {
//                            Picasso.with(context).load("https://sumancrown101.000webhostapp.com/"+img[pos]).into(imageView);
//                            return  true;
//                        }
//                        else
//                        {
//                            pos=0;
//                            Picasso.with(context).load("https://sumancrown101.000webhostapp.com/"+img[pos]).into(imageView);
//                            return true;
//                        }
//                    }
//                }
//                else if(e2.getX()-e1.getX()>120 && Math.abs(velocityX)>200)
//                {
//                    if (pos > 0)
//                    {
//                        pos --;
//                        Picasso.with(context).load("https://sumancrown101.000webhostapp.com/"+img[pos]).into(imageView);
//                        return true;
//                    }
//                    else{
//                        pos=img.length-1;
//                        Picasso.with(context).load("https://sumancrown101.000webhostapp.com/"+img[pos]).into(imageView);
//                        return true;
//                    }
//                }
//            }catch (Exception e)
//            {
//                e.printStackTrace();
//            }
//            return  false;
//        }
//    }
}