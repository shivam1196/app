package com.example.shivam.acm;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainScreen extends AppCompatActivity {
    private ViewPager vPagerMain;
    CustomPageAdapter cpa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
        Intent i = getIntent();
        Bundle b = i.getExtras();
        int num=b.getInt("id");
        vPagerMain=(ViewPager)findViewById(R.id.vPagerMain);
        cpa=new CustomPageAdapter(getSupportFragmentManager());
        vPagerMain.setAdapter(cpa);
        vPagerMain.setCurrentItem(num);
    }
    public static class CustomPageAdapter extends FragmentPagerAdapter
    {
        public static int NUM = 9;
        CustomPageAdapter(FragmentManager fragmentManager)
        {
            super(fragmentManager);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position)
            {
                case 0: return new Fragment_two();
                case 1: return new Fragment_one();
                case 2: return new Fragment_three();
                case 3: return new Fragment_nine();
                case 4: return new Fragment_four();
                case 5: return new Fragment_six();
                case 6: return new Fragment_five();
                case 7: return new Fragment_seven();
                case 8: return new Fragment_eight();
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
            switch (position) {
                case 0:
                    return "ABOUT";
                case 1:
                    return "HOME";
                case 2 : return "PROJECTS";
                case 3: return "BOARD OF HONOURS";
                case 4: return "EVENTS";
                case 5: return "OFFICE BEARERS";
                case 6:return "DEPARTMENTS";
                case 7: return "GALLERY";
                case 8: return "CONTACT US";
                default: return null;
            }
        }
    }
}
