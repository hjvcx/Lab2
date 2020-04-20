package com.example.lab2;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.lab2.fragments.PageFragment;

import java.util.List;

public class SliderPagerAdapter extends FragmentStatePagerAdapter {

    private List<Fragment> fragmentList;

    public SliderPagerAdapter(FragmentManager fm, List<Fragment> fragmentList) {
        super(fm);
        this.fragmentList = fragmentList;
    }

    @Override
    public Fragment getItem(int position) { return PageFragment.newInstance(position); }

    @Override
    public int getCount() {
        return 10;
    }
}
