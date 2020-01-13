package com.example.rutinafitnn.Tabbetabdomen.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.rutinafitnn.tabbet.BlankFragment16;
import com.example.rutinafitnn.tabbet.BlankFragment17;
import com.example.rutinafitnn.tabbet.BlankFragment18;
import com.example.rutinafitnn.tabbet.BlankFragment19;
import com.example.rutinafitnn.tabbet.BlankFragment20;
import com.example.rutinafitnn.R;


/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tababdomen1, R.string.tababdomen2,R.string.tababdomen3,R.string.tababdomen4,R.string.tababdomen5};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                BlankFragment16 blankFragment16 = new BlankFragment16();
                return blankFragment16;

            case 1:
                BlankFragment17 blankFragment17 = new BlankFragment17();
                return blankFragment17;

            case 2:
                BlankFragment18 blankFragment18 = new BlankFragment18();
                return blankFragment18;

            case 3:
                BlankFragment19 blankFragment19 = new BlankFragment19();
                return blankFragment19;

            case 4:
                BlankFragment20 blankFragment20 = new BlankFragment20();
                return blankFragment20;
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