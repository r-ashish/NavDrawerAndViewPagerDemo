package com.example.ashish.bookabry_tinder;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import com.example.ashish.bookabry_tinder.IconPageIndicator;

public class SampleIconsDefault extends BaseSampleActivity {
     void setPager() {
        //super.onCreate(savedInstanceState);
        //setContentView(R.layout.simple_icons);

        mAdapter = new TestFragmentAdapter(getSupportFragmentManager());

        mPager = (ViewPager)findViewById(R.id.pager);
        mPager.setAdapter(mAdapter);

        mIndicator = (IconPageIndicator)findViewById(R.id.indicator);
        mIndicator.setViewPager(mPager);
    }
}
