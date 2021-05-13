package com.wangtao.firstapp.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.jude.rollviewpager.adapter.StaticPagerAdapter;
import com.squareup.picasso.Picasso;
import com.wangtao.firstapp.modles.HomePageData;

/**
 * 轮播图的适配器
 * Created by lanouhn on 16/8/24.
 */
public class CustomMapAdapter extends StaticPagerAdapter {
    private Context context;
    private HomePageData homePageData;

    public CustomMapAdapter(Context context, HomePageData homePageData) {
        this.context = context;
        this.homePageData = homePageData;
    }

    @Override
    public View getView(ViewGroup container, int position) {
        ImageView view = new ImageView(container.getContext());
        Picasso.with(context).load(homePageData.getData().getBanner().get(position).getPhoto()).into(view);
        view.setScaleType(ImageView.ScaleType.FIT_XY);
        view.setLayoutParams(new ViewGroup
                .LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.MATCH_PARENT));
        return view;
    }

    @Override
    public int getCount() {
        return homePageData.getData().getBanner().size();
    }
}
