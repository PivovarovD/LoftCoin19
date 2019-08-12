package com.loftschool.pivovarov.loftcoin19.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final int DELAY = 2000;

        new Handler().postDelayed(()-> {
            startActivity(new Intent(this, MainActivity.class));
        },DELAY);
    }
}


