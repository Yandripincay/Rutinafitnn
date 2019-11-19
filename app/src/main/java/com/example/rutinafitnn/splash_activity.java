package com.example.rutinafitnn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splash_activity extends AppCompatActivity {
    static int TIMEOUT_MILLIS= 5000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_activity);

        getSupportActionBar().hide();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i= new Intent(splash_activity.this, MainActivity.class);

                startActivity(i);
                finish();
            }
        },TIMEOUT_MILLIS);
    }
}
