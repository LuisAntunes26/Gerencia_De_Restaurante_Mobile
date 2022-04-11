package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;

public class LaunchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);

            //https://stackoverflow.com/questions/11130190/android-application-logo-activity
            Intent intent = new Intent(this, Login.class);
            final Handler handler = new Handler();
            final Runnable doNextActivity = new Runnable() {

                @Override
                public void run() {
                    // Intent to jump to the next activity
                    startActivity(intent);
                    finish(); // so the splash activity goes away
                }
            };

            new Thread() {
                @Override
                public void run() {
                    SystemClock.sleep(2000);
                    handler.post(doNextActivity);
                }
            }.start();
        }
}