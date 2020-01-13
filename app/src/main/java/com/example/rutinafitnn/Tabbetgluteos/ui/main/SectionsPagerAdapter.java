package com.example.rutinafitnn.Tabbetgluteos.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


import com.example.rutinafitnn.tabbet.BlankFragment31;
import com.example.rutinafitnn.tabbet.BlankFragment32;
import com.example.rutinafitnn.tabbet.BlankFragment33;
import com.example.rutinafitnn.tabbet.BlankFragment34;
import com.example.rutinafitnn.tabbet.BlankFragment35;
import com.example.rutinafitnn.R;


/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.gluteos1,R.string.gluteos2,R.string.gluteos3,R.string.gluteos4,R.string.gluteos5};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                BlankFragment31 blankFragment31=new BlankFragment31();
                return blankFragment31;

            case 1:
                BlankFragment32 blankFragment32=new BlankFragment32();
                return blankFragment32;

            case 2:
                BlankFragment33 blankFragment33=new BlankFragment33();
                return blankFragment33;

            case 3:
                BlankFragment34 blankFragment34=new BlankFragment34();
                return blankFragment34;

            case 4:
                BlankFragment35 blankFragment35=new BlankFragment35();
                return blankFragment35;

        }
        return PlaceholderFragment.newInstance(position + 1);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 5;
    }
}