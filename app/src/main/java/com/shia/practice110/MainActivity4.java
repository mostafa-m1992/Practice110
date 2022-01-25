package com.shia.practice110;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.tabs.TabLayout;
import com.shia.practice110.adapters3.ViewPagerAdapter;
import com.shia.practice110.fragments3.FragmentFifteen;
import com.shia.practice110.fragments3.FragmentFourteen;
import com.shia.practice110.fragments3.FragmentSixteen;

public class MainActivity4 extends AppCompatActivity {

    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        this.setTitle("Page3");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPage);

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        adapter.addFrg(new FragmentFourteen(), "Item1");
        adapter.addFrg(new FragmentFifteen(), "Item2");
        adapter.addFrg(new FragmentSixteen(), "Item3");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_baseline_3d_rotation_24);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_baseline_6_ft_apart_24);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_baseline_ac_unit_24);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
            //finish();
        }
        return super.onOptionsItemSelected(item);
    }
}