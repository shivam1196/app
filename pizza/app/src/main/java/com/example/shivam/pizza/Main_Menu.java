package com.example.shivam.pizza;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.*;

public class Main_Menu extends AppCompatActivity {
ViewPager vPager;
    CustomPageAdaptor cpa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__menu);
        vPager=(ViewPager)findViewById(R.id.vPager);
        cpa= new CustomPageAdaptor(getSupportFragmentManager());
        vPager.setAdapter(cpa);
        vPager.setCurrentItem(0);
    }

    public static class CustomPageAdaptor extends FragmentPagerAdapter
    {
        public static int NUM=2;
        CustomPageAdaptor(FragmentManager fm)
        {
            super(fm);

        }
        @Override
        public android.support.v4.app.Fragment getItem(int position) {
           switch (position)
           {
               case 0: return new Fragment_One();
               case 1: return new Fragment_Two();
                default:
                    return null;
           }

        }

        @Override
        public int getCount() {
            return NUM;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position)
            {
                case 0: return "VEG";
                case 1: return "NON-VEG";
                default:
                    return null;
            }

        }

    }
}
