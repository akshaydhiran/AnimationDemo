package com.example.animationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class BounceAnimationDemo extends AppCompatActivity implements Animation.AnimationListener {

    Button button;
    TextView textView;
    Animation BounceAnim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bounce_animation_demo);
        textView = findViewById(R.id.bounce);
        button = findViewById(R.id.btn);

        BounceAnim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.bounce);
        BounceAnim.setAnimationListener(this);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setVisibility(View.VISIBLE);
                textView.startAnimation(BounceAnim);
            }
        });
    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {

        if (animation == BounceAnim) {
            Toast.makeText(this, "Animation Stopped", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}
