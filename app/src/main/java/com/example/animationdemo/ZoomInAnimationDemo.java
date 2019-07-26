package com.example.animationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ZoomInAnimationDemo extends AppCompatActivity implements Animation.AnimationListener {

    TextView textView;
    Button button;
    Animation zoomin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zoom_in_animation_demo);
        textView = findViewById(R.id.zoomin);
        button = findViewById(R.id.btn);

        zoomin = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_in);
        zoomin.setAnimationListener(this);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setVisibility(View.VISIBLE);
                textView.startAnimation(zoomin);
            }
        });
    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {

        if (animation ==  zoomin)
        {
            Toast.makeText(this, "Animation Stopped", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}
