package com.example.reversidesoftwaresolutions.fragments;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

/**
 * Created by reversidesoftwaresolutions on 9/29/17.
 */

public class PagerAdapter extends FragmentPagerAdapter {
    private String tabTitle[] = new String[]{
            "Tab 1",
            "Tab 2",
            "Tab 3"
    };

    private Context context;

    public PagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position)
        {
            case 0:
                return new Fragment_RecyclerView();
            case 1:
                return new Fragment_RecyclerView();
            case 2:
                return new Fragment_RecyclerView();
        }
        return null;
    }

    @Override
    public int getCount() {
        return tabTitle.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitle[position];
    }

    public View getTabView(int position){
        View tab = LayoutInflater.from(context).inflate(R.layout.custom_tabs, null);
        TextView textView = (TextView) tab.findViewById(R.id.custom_text);
        textView.setText(tabTitle[position]);
        return tab;
    }
}
