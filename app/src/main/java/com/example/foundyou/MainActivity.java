package com.example.foundyou;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static int SPLASH_SCREEN=5000;
    Animation topanim,botanim,bot2anim;
    ImageView img1;
    TextView tv_found,tv_scan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        topanim= AnimationUtils.loadAnimation(this,R.anim.top_animation);
        botanim= AnimationUtils.loadAnimation(this,R.anim.bottom_animation);
        bot2anim=AnimationUtils.loadAnimation(this,R.anim.bottom_animation2);
        img1=findViewById(R.id.img1);
        tv_found=findViewById(R.id.tv_found);
        tv_scan=findViewById(R.id.tv_scan);
        tv_found.setAnimation(topanim);
        img1.setAnimation(botanim);
        tv_scan.setAnimation(bot2anim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(MainActivity.this,Home.class);
                startActivity(i);
                finish();
            }
        },SPLASH_SCREEN);
    }
}