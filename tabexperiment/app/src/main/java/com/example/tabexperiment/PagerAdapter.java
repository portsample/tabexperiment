package com.example.tabexperiment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class PagerAdapter extends FragmentStateAdapter {

    int iNumberOfTabs;
    public PagerAdapter(@NonNull FragmentActivity fragmentActivity, int numberOfTabs) {
        super(fragmentActivity);
        this.iNumberOfTabs = numberOfTabs;
    }

    public static CharSequence getPageTitle(int iPosition) {
        switch (iPosition) {
            case 0:
                return "First";
            case 1:
                return "Second";
            case 2:
                return "Third";
            default:
                return null;
        }
    }

    @NonNull
    @Override
    public Fragment createFragment(int iPosition) {
        switch (iPosition) {
            case 0:
                return new TabFragment1();
            case 1:
                return new TabFragment2();
            case 2:
                return new TabFragment3();
            default:
                return null;
        }
    }

    @Override
    public int getItemCount()  {
        return iNumberOfTabs;
    }

}
