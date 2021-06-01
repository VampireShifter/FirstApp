package com.wangtao.firstapp.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.wangtao.firstapp.R;
import com.wangtao.firstapp.adapters.MajorVpAdapter;
import com.wangtao.firstapp.fragments.HomePagerFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * 主页面
 */
public class MainActivity extends AppCompatActivity {
    private ViewPager viewPagwe;
    private List<Fragment> majorFragments;
    private MajorVpAdapter majorVpAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    private void initView() {
        viewPagwe = (ViewPager) findViewById(R.id.viewPager_act_main);
    }

    private void initData() {

        majorFragments = new ArrayList<>();
        HomePagerFragment homePagerFragment = new HomePagerFragment();
        majorFragments.add(homePagerFragment);

        majorVpAdapter=new MajorVpAdapter(getSupportFragmentManager(),majorFragments);
        viewPagwe.setAdapter(majorVpAdapter);
    }
}
