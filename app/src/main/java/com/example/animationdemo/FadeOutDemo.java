package com.example.animationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class FadeOutDemo extends AppCompatActivity implements Animation.AnimationListener {

    Button btn;
    TextView text;
    Animation animation22;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fade_out_demo);
        btn = findViewById(R.id.btn);
        final TextView text = findViewById(R.id.fadeout);

        animation22 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_out);
        animation22.setAnimationListener(this);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setVisibility(View.VISIBLE);
                text.startAnimation(animation22);
            }
        });
    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {
        if(animation == animation22)
        {
            Toast.makeText(this, "Animation Stopped", Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}
