package com.wangtao.firstapp.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

/**
 * HomePagerFragment的ViewPager适配器
 * Created by lanouhn on 16/8/24.
 */
public class HomeVPAdapter extends FragmentStatePagerAdapter {

    private List<String> homeNames;
    private List<Fragment> homefragments;

    public HomeVPAdapter(FragmentManager fm, List<String> homeNames, List<Fragment> homefragments) {
        super(fm);
        this.homeNames = homeNames;
        this.homefragments = homefragments;
    }

    @Override
    public Fragment getItem(int position) {
        return homefragments.get(position);
    }

    @Override
    public int getCount() {
        return homefragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return homeNames.get(position);
    }
}
