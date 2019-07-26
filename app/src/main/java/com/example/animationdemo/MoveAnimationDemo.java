package com.example.animationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MoveAnimationDemo extends AppCompatActivity implements Animation.AnimationListener {

    TextView textView;
    Button button;
    Animation move;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_animation_demo);
        textView = findViewById(R.id.moveanim);
        button = findViewById(R.id.btn);

        move = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);
        move.setAnimationListener(this);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setVisibility(View.VISIBLE);
                textView.startAnimation(move);
            }
        });

    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {

        if (animation == move)
        {
            Toast.makeText(this, "Animation Stopped", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}
