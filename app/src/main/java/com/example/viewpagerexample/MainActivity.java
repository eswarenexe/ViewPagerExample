package com.example.viewpagerexample;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {
    ViewPager2 vpgMain;
    TabLayout tblMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vpgMain = findViewById(R.id.vpgMain);
        tblMain = findViewById(R.id.tblMain);
        vpgMain.setAdapter(new ViewPagerAdapter(this));

        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tblMain, vpgMain, true, (tab, position) -> {
            switch (position) {
                case 0:
                    tab.setText("A");
                    break;
                case 1:
                    tab.setText("B");
                    break;
                case 2:
                    tab.setText("C");
                    break;
            }
        });
        tabLayoutMediator.attach();
    }

}