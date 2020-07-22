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
        adapter.addFragment(new Tab1Fragment(), "1.Fragment");
        adapter.addFragment(new Tab2Fragment(), "2.Fragment");
        adapter.addFragment(new Tab3Fragment(), "3.Fragment");
        adapter.addFragment(new Tab3Fragment(), "4.Fragment");
        adapter.addFragment(new Tab3Fragment(), "5.Fragment");
        adapter.addFragment(new Tab3Fragment(), "6.Fragment");
        adapter.addFragment(new Tab3Fragment(), "7.Fragment");
        adapter.addFragment(new Tab3Fragment(), "8.Fragment");
        adapter.addFragment(new Tab3Fragment(), "9.Fragment");
        adapter.addFragment(new Tab3Fragment(), "10.Fragment");
        adapter.addFragment(new Tab3Fragment(), "11.Fragment");
        adapter.addFragment(new Tab3Fragment(), "12.Fragment");
        adapter.addFragment(new Tab3Fragment(), "13.Fragment");
        adapter.addFragment(new Tab3Fragment(), "14.Fragment");
        adapter.addFragment(new Tab3Fragment(), "15.Fragment");
        adapter.addFragment(new Tab3Fragment(), "16.Fragment");
        adapter.addFragment(new Tab3Fragment(), "17.Fragment");
        adapter.addFragment(new Tab3Fragment(), "18.Fragment");
        adapter.addFragment(new Tab3Fragment(), "19.Fragment");
        adapter.addFragment(new Tab3Fragment(), "20.Fragment");
        adapter.addFragment(new Tab3Fragment(), "21.Fragment");
        adapter.addFragment(new Tab3Fragment(), "22.Fragment");
        adapter.addFragment(new Tab3Fragment(), "23.Fragment");
        adapter.addFragment(new Tab3Fragment(), "23.Fragment");


        viewPager.setAdapter(adapter);
        tabs.setupWithViewPager(viewPager);


    }
}