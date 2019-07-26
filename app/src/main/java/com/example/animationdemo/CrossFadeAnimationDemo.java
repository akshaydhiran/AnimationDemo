package com.example.animationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CrossFadeAnimationDemo extends AppCompatActivity implements Animation.AnimationListener {

    TextView textView,textView2;
    Button button;
    Animation aacrossfade1,aacrossfade2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cross_fade_animation_demo);
       button = findViewById(R.id.btn);
       textView = findViewById(R.id.crossfade);
       textView2 = findViewById(R.id.crossfade2);

       aacrossfade1 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
       aacrossfade2 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_out);

       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               textView.setVisibility(View.VISIBLE);
               textView.startAnimation(aacrossfade1);
               textView2.startAnimation(aacrossfade2);
           }
       });
    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {
        if (animation == aacrossfade1 && animation == aacrossfade2)
        {
            Toast.makeText(this, "Animation Stopped", Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}
