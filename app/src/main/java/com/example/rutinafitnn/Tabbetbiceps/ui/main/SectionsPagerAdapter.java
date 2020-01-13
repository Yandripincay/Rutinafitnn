package com.example.rutinafitnn.Tabbetbiceps.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


import com.example.rutinafitnn.tabbet.BlankFragment10;
import com.example.rutinafitnn.tabbet.BlankFragment6;
import com.example.rutinafitnn.tabbet.BlankFragment7;
import com.example.rutinafitnn.tabbet.BlankFragment8;
import com.example.rutinafitnn.tabbet.BlankFragment9;
import com.example.rutinafitnn.R;


/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tabtext1, R.string.tabtext2, R.string.tabtext3,R.string.tabtext4,R.string.tabtext5};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                BlankFragment6 blankFragment6 = new BlankFragment6();
                return blankFragment6;

            case 1:
                BlankFragment7 blankFragment7 = new BlankFragment7();
                return blankFragment7;

            case 2:
                BlankFragment8 blankFragment8 = new BlankFragment8();
                return blankFragment8;

            case 3:
                BlankFragment9 blankFragment9 = new BlankFragment9();
                return blankFragment9;

            case 4:
                BlankFragment10 blankFragment10 = new BlankFragment10();
                return blankFragment10;
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