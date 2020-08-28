package com.example.cvgratis;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ContactusPagerAdapter extends FragmentPagerAdapter {
    private int numOfTabs;
    public ContactusPagerAdapter(FragmentManager fm, int numOfTabs){
        super(fm);
        this.numOfTabs=numOfTabs;
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return new FaqFragment();
            case 1:
                return new HelpFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numOfTabs;
    }
}
