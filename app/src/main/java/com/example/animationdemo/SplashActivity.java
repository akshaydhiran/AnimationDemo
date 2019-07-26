package com.example.animationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getSupportActionBar().hide();

        imageView = findViewById(R.id.pikachuImg1);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {


                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                ActivityOptions options = ActivityOptions
                        .makeSceneTransitionAnimation(SplashActivity.this, imageView, "pika");
                startActivity(intent, options.toBundle());
            }
        },3000);

    }
}
