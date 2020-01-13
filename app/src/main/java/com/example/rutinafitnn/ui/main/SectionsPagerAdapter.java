package com.example.rutinafitnn.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.rutinafitnn.tabbet.BlankFragment;
import com.example.rutinafitnn.tabbet.BlankFragment2;
import com.example.rutinafitnn.tabbet.BlankFragment3;
import com.example.rutinafitnn.tabbet.BlankFragment4;
import com.example.rutinafitnn.tabbet.BlankFragment5;
import com.example.rutinafitnn.R;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tabtext_1, R.string.tabtext_2,R.string.tabtext_3,R.string.tabtext_4,R.string.tabtext_5};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                BlankFragment blankFragment=new BlankFragment();
                return blankFragment;

            case 1:
                BlankFragment2 blankFragment2=new BlankFragment2();
            return blankFragment2;

            case 2:
                BlankFragment3 blankFragment3=new BlankFragment3();
                return blankFragment3;

            case 3:
                BlankFragment4 blankFragment4=new BlankFragment4();
                return blankFragment4;

            case 4:
                BlankFragment5 blankFragment5=new BlankFragment5();
                return blankFragment5;

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