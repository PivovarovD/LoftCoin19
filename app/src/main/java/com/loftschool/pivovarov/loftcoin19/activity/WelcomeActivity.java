package com.loftschool.pivovarov.loftcoin19.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.Button;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.loftschool.pivovarov.loftcoin19.R;
import com.loftschool.pivovarov.loftcoin19.adapter.WelcomePagerAdapter;
import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator;

public class WelcomeActivity extends AppCompatActivity {

    private ViewPager mViewPager;

    private WormDotsIndicator mDotsIndicator;

    private Button mBtnStart;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        mViewPager = findViewById(R.id.pager);
        mViewPager.setAdapter(new WelcomePagerAdapter(getLayoutInflater()));
        mDotsIndicator = findViewById(R.id.worm_dot_indicator);
        mDotsIndicator.setViewPager(mViewPager);
        mBtnStart = findViewById(R.id.btn_start);

        mBtnStart.setOnClickListener(view -> {
            final SharedPreferences prefs = PreferenceManager
                    .getDefaultSharedPreferences(this);
            prefs.edit().putBoolean("show_welcome_screen", false).apply();
            startActivity(new Intent(this, MainActivity.class));
            final Intent intent = new Intent(this, MainActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
        });
    }
}
