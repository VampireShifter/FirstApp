package com.wangtao.firstapp.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jude.rollviewpager.RollPagerView;
import com.wangtao.firstapp.R;

import java.util.ArrayList;
import java.util.List;

/**
 * 首页主界面
 * Created by lanouhn on 16/8/24.
 */
public class HomePagerFragment extends Fragment {
    private RollPagerView rollPagerView;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private List<String> hometabNames;
    private List<Fragment> homefragments;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home_pager, container, false);
        rollPagerView = (RollPagerView) view.findViewById(R.id.rollPagerView_home_pager_fragment);
        tabLayout = (TabLayout) view.findViewById(R.id.tabLayout_home_pager_fragment);
        viewPager = (ViewPager) view.findViewById(R.id.viewPager_home_pager_fragment);

        initData();
        initEvent();
        return view;
    }


    private void initData() {

        hometabNames = new ArrayList<>();
        hometabNames.add("");

        homefragments = new ArrayList<>();


    }

    private void initEvent() {

    }
}
