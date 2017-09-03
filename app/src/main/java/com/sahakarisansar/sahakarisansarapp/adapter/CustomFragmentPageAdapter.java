package com.sahakarisansar.sahakarisansarapp.adapter;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.sahakarisansar.sahakarisansarapp.fragment.Interview;
import com.sahakarisansar.sahakarisansarapp.fragment.CurrentNews;

public class CustomFragmentPageAdapter extends FragmentPagerAdapter{

    private static final String TAG = CustomFragmentPageAdapter.class.getSimpleName();

    private static final int FRAGMENT_COUNT = 4;

    public CustomFragmentPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new CurrentNews();
            case 1:
                return new Interview();
            case 2:
                return new CurrentNews();
            case 3:
                return new CurrentNews();
        }
        return null;
    }

    @Override
    public int getCount() {
        return FRAGMENT_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "ताजा समाचार";
            case 1:
                return "अन्तर्वार्ता";
            case 2:
                return "महिला";
            case 3:
                return "विचार";
        }
        return null;
    }
}
