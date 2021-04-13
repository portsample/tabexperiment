package com.example.tabexperiment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;
import android.os.Bundle;
import android.widget.Switch;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {
    private TabLayout mTabLayout;
    private ViewPager2 mViewPager2;
    private int iAdapterCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        androidx.appcompat.widget.Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        mTabLayout = findViewById(R.id.tab_Layout);
        mTabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        mViewPager2 = findViewById(R.id.viewPager2);
        mViewPager2.setAdapter(createTabAdapter());

        for (int i = 0; i < iAdapterCount; i++) {
            new TabLayoutMediator(mTabLayout, mViewPager2,
                    (tab, iPosition) -> tab.setText(PagerAdapter.getPageTitle(iPosition))).attach();
        }
    }
        private PagerAdapter createTabAdapter () {
            PagerAdapter adapter = new PagerAdapter(this, mTabLayout.getTabCount());
            iAdapterCount = adapter.getItemCount();
            return adapter;
        }
    }
