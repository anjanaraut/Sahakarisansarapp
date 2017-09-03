package com.sahakarisansar.sahakarisansarapp.fragment;


import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sahakarisansar.sahakarisansarapp.R;
import com.sahakarisansar.sahakarisansarapp.adapter.CustomFragmentPageAdapter;


public class CreditInformationSystem extends Fragment {

    private static final String TAG = CreditInformationSystem.class.getSimpleName();

    private TabLayout tabLayout;
    private ViewPager viewPager;


    public CreditInformationSystem() {
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cis, container, false);

        tabLayout = (TabLayout)view.findViewById(R.id.tabs);
        viewPager = (ViewPager)view.findViewById(R.id.view_pager);

        viewPager.setAdapter(new CustomFragmentPageAdapter(getChildFragmentManager()));
        tabLayout.setupWithViewPager(viewPager);

        return view;
    }
}
