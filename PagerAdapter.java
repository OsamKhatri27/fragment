package com.example.innu.bankdemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Innu on 15-07-2019.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {
    List<Fragment>fragmentList=new ArrayList<>();
    List<String> titlelist=new ArrayList<>();

    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titlelist.get(position);
    }

    public void addFragment(Fragment fragment,String title) {
        fragmentList.add(fragment);
        titlelist.add(title);

    }

}
