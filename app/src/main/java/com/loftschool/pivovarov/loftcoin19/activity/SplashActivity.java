package com.loftschool.pivovarov.loftcoin19.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.loftschool.pivovarov.loftcoin19.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        final SharedPreferences prefs = PreferenceManager
                .getDefaultSharedPreferences(this);

        final int DELAY = 2000;

       new Handler().postDelayed(()-> {
           if(prefs.getBoolean("show_welcome_screen", true)) {
               startActivity(new Intent(this, WelcomeActivity.class));
           } else {
               startActivity(new Intent(this, MainActivity.class));
           }
       },DELAY);
    }
}


