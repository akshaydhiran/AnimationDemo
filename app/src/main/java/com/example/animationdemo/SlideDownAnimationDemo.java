package com.example.animationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SlideDownAnimationDemo extends AppCompatActivity implements Animation.AnimationListener {

    TextView textView;
    Button button;
    Animation SlideDownAnim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide_down_animation_demo);
        textView = findViewById(R.id.slidedown);
        button = findViewById(R.id.btn);

        SlideDownAnim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_down);
        SlideDownAnim.setAnimationListener(this);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setVisibility(View.VISIBLE);
                textView.startAnimation(SlideDownAnim);
            }
        });
    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {

        if (animation == SlideDownAnim)
        {
            Toast.makeText(this, "Animation Stopped", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}
