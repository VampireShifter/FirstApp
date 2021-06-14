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
import com.wangtao.firstapp.adapters.HomeVPAdapter;

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
    private HomeVPAdapter homeVPAdapter;


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
        hometabNames.add("精选");
        hometabNames.add("原创精选");
        hometabNames.add("一周最热");
        hometabNames.add("美妆&穿搭");
        hometabNames.add("礼物");
        hometabNames.add("美食");
        hometabNames.add("设计感");
        hometabNames.add("文艺");
        hometabNames.add("学生党");

        homefragments = new ArrayList<>();
        SifeFragment sifeFragment = new SifeFragment();
        OriginalSifeFragment originalSifeFragment = new OriginalSifeFragment();
        WeekHotFragmet weekHotFragmet = new WeekHotFragmet();
        WearFragment wearFragment = new WearFragment();
        GiftFragment giftFragment = new GiftFragment();
        CateFragment cateFragment = new CateFragment();
        DesignFragment designFragment = new DesignFragment();
        ArtFragment artFragment = new ArtFragment();
        StudentFragment studentFragment = new StudentFragment();

        homefragments.add(sifeFragment);
        homefragments.add(originalSifeFragment);
        homefragments.add(weekHotFragmet);
        homefragments.add(wearFragment);
        homefragments.add(giftFragment);
        homefragments.add(cateFragment);
        homefragments.add(designFragment);
        homefragments.add(artFragment);
        homefragments.add(studentFragment);

        homeVPAdapter = new HomeVPAdapter(getFragmentManager(), hometabNames, homefragments);
        viewPager.setAdapter(homeVPAdapter);
        tabLayout.setupWithViewPager(viewPager);

    }

    private void initEvent() {

    }


}
