package com.example.animationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14,a15;

    public void initialize()
    {
        a1 = findViewById(R.id.FadeIN);
        a2 = findViewById(R.id.FadeOUT);
        a3 = findViewById(R.id.CrossFADE);
        a4 = findViewById(R.id.Blink);
        a5 = findViewById(R.id.ZoomIN);
        a6 = findViewById(R.id.ZoomOUT);
        a7 = findViewById(R.id.Rotate);
        a8 = findViewById(R.id.Move);
        a9 = findViewById(R.id.SlideUP);
        a10 = findViewById(R.id.SlideDOWN);
        a11 = findViewById(R.id.Bounce);
        a12 = findViewById(R.id.Sequential);
        a13 = findViewById(R.id.Togther);
        a14 = findViewById(R.id.login);
        a15 = findViewById(R.id.LottieFILES);
        a1.setOnClickListener(this);
        a2.setOnClickListener(this);
        a3.setOnClickListener(this);
        a4.setOnClickListener(this);
        a5.setOnClickListener(this);
        a6.setOnClickListener(this);
        a7.setOnClickListener(this);
        a8.setOnClickListener(this);
        a9.setOnClickListener(this);
        a10.setOnClickListener(this);
        a11.setOnClickListener(this);
        a12.setOnClickListener(this);
        a13.setOnClickListener(this);
        a14.setOnClickListener(this);
        a15.setOnClickListener(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // ANDROIDHIVE
        initialize();
        getSupportActionBar().hide();
    }

    @Override
    public void onClick(View view) {



        int id = view.getId(); // v is an object is a object for View Onclick class.
        Intent intent = null; // intent is used to show messages.
        switch (id){  // here we use switch for giving id for multiple butttons we used for to distinguish.
            case R.id.FadeIN : intent = new Intent(MainActivity.this, FadeInDemo.class); break;
            case R.id.login : intent = new Intent(MainActivity.this,LoginActivity.class);break;
            case R.id.FadeOUT : intent = new Intent(MainActivity.this, FadeOutDemo.class); break;
            case R.id.CrossFADE : intent = new Intent(MainActivity.this, CrossFadeAnimationDemo.class); break;
            case R.id.Blink : intent = new Intent(MainActivity.this, BlinkAnimationDemo.class); break;
            case R.id.ZoomIN : intent = new Intent(MainActivity.this, ZoomInAnimationDemo.class); break;
            case R.id.ZoomOUT : intent = new Intent(MainActivity.this, ZoomOutAnimationDemo.class); break;
            case R.id.Rotate : intent = new Intent(MainActivity.this, RotateAnimationDemo.class); break;
            case R.id.Move : intent = new Intent(MainActivity.this, MoveAnimationDemo.class); break;
            case R.id.SlideUP : intent = new Intent(MainActivity.this, SlideUpAnimationDemo.class); break;
            case R.id.SlideDOWN : intent = new Intent(MainActivity.this, SlideDownAnimationDemo.class); break;
            case R.id.Bounce : intent = new Intent(MainActivity.this, BounceAnimationDemo.class); break;
            case R.id.Sequential : intent = new Intent(MainActivity.this, SequentialAnimationDemo.class); break;
            case R.id.Togther : intent = new Intent(MainActivity.this, TogtherAnimationDemo.class); break;
            case R.id.LottieFILES : intent = new Intent(MainActivity.this,LottieFilesAnimationDemo.class);break;

        }
        if (intent!=null)
            startActivity(intent);  // here we use startACtivity for using other buttons because it is crash instead.

    }
}
