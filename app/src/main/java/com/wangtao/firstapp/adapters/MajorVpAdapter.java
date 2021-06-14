package com.wangtao.firstapp.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

/**
 * MainActivity的ViewPager适配器
 * Created by lanouhn on 16/8/24.
 */
public class MajorVpAdapter extends FragmentStatePagerAdapter {
    private List<Fragment> majorfragments;

    public MajorVpAdapter(FragmentManager fm, List<Fragment> majorfragments) {
        super(fm);
        this.majorfragments = majorfragments;
    }

    @Override
    public Fragment getItem(int position) {
        return majorfragments.get(position);
    }

    @Override
    public int getCount() {
        return majorfragments.size();
    }
}
