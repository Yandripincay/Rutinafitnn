package com.example.rutinafitnn.Tabbetespalda.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


import com.example.rutinafitnn.tabbet.BlankFragment26;
import com.example.rutinafitnn.tabbet.BlankFragment27;
import com.example.rutinafitnn.tabbet.BlankFragment28;
import com.example.rutinafitnn.tabbet.BlankFragment29;
import com.example.rutinafitnn.tabbet.BlankFragment30;
import com.example.rutinafitnn.R;


/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.espalda1,R.string.espalda2,R.string.espalda3,R.string.espalda4,R.string.espalda5};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                BlankFragment26 blankFragment26=new BlankFragment26();
                return blankFragment26;

            case 1:
                BlankFragment27 blankFragment27=new BlankFragment27();
                return blankFragment27;

            case 2:
                BlankFragment28 blankFragment28=new BlankFragment28();
                return blankFragment28;

            case 3:
                BlankFragment29 blankFragment29=new BlankFragment29();
                return blankFragment29;

            case 4:
                BlankFragment30 blankFragment30=new BlankFragment30();
                return blankFragment30;

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