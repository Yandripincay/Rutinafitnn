package com.example.rutinafitnn.Tabbettriceps.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


import com.example.rutinafitnn.tabbet.BlankFragment11;
import com.example.rutinafitnn.tabbet.BlankFragment12;
import com.example.rutinafitnn.tabbet.BlankFragment13;
import com.example.rutinafitnn.tabbet.BlankFragment14;
import com.example.rutinafitnn.tabbet.BlankFragment15;

import com.example.rutinafitnn.R;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tabtriceps1, R.string.tabtriceps2,R.string.tabtriceps3,R.string.tabtriceps4,R.string.tabtriceps5};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                BlankFragment11 blankFragment11=new BlankFragment11();
                return blankFragment11;

            case 1:
                BlankFragment12 blankFragment12=new BlankFragment12();
                return blankFragment12;

            case 2:
                BlankFragment13 blankFragment13=new BlankFragment13();
                return blankFragment13;

            case 3:
                BlankFragment14 blankFragment14=new BlankFragment14();
                return blankFragment14;

            case 4:
                BlankFragment15 blankFragment15=new BlankFragment15();
                return blankFragment15;

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