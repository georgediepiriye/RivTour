package com.example.rivtour;


import android.content.Context;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PlacesPagerAdapter extends FragmentPagerAdapter {

    /** Context of the app */
    private Context mContext;

/**constructor for places pager adapter*/
    public PlacesPagerAdapter(Context context,FragmentManager fm) {
        super(fm, FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        mContext = context;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.hotel);
        } else if (position == 1) {
            return mContext.getString(R.string.eatery);
        } else if (position == 2) {
            return mContext.getString(R.string.hospital);
        } else {
            return mContext.getString(R.string.random);
        }
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new HotelsFragment();
            case 1:
                return new EateryFragment();
            case 2:
                return new HospitalFragment();
            case 3:
                return new RandomFragment();
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return 4;
    }
}
