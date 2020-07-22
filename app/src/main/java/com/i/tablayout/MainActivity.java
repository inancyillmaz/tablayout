package com.i.tablayout;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tabs;
    ViewPager viewPager;
    TabAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        viewPager = findViewById(R.id.viewpager);
        tabs = findViewById(R.id.tabs);


        adapter = new TabAdapter(getSupportFragmentManager());
        adapter.addFragment(new Tab1Fragment(), "1.Frag");
        adapter.addFragment(new Tab2Fragment(), "2.Frag");
        adapter.addFragment(new Tab3Fragment(), "3.Frag");


        viewPager.setAdapter(adapter);
        tabs.setupWithViewPager(viewPager);


    }
}