package com.example.rutinafitnn.Tabbethombro.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


import com.example.rutinafitnn.tabbet.BlankFragment21;
import com.example.rutinafitnn.tabbet.BlankFragment22;
import com.example.rutinafitnn.tabbet.BlankFragment23;
import com.example.rutinafitnn.tabbet.BlankFragment24;
import com.example.rutinafitnn.tabbet.BlankFragment25;
import com.example.rutinafitnn.R;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tabhombro1, R.string.tabhombro2,R.string.tabhombro3,R.string.tabhombro4,R.string.tabhombro5};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                BlankFragment21 blankFragment21=new BlankFragment21();
                return blankFragment21;

            case 1:
                BlankFragment22 blankFragment22=new BlankFragment22();
                return blankFragment22;

            case 2:
                BlankFragment23 blankFragment23=new BlankFragment23();
                return blankFragment23;

            case 3:
                BlankFragment24 blankFragment24=new BlankFragment24();
                return blankFragment24;

            case 4:
                BlankFragment25 blankFragment25=new BlankFragment25();
                return blankFragment25;

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