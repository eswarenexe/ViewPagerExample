package com.example.viewpagerexample;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerAdapter extends FragmentStateAdapter {
    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment;
        switch (position) {
            case 1:
                fragment = new BFragment();
                break;
            case 2:
                fragment = new CFragment();
                break;
            default:
                fragment = new AFragment();
        }
        return fragment;
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
