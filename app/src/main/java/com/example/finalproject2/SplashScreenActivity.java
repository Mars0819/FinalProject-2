package com.example.finalproject2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;

@SuppressLint("CustomSplashScreen")
public class SplashScreenActivity extends AppCompatActivity {
    LottieAnimationView lottie;
    TextView tv1,tv2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lottie = findViewById(R.id.animation_view);
        tv1 = findViewById(R.id.tvShopping);
        tv2 = findViewById(R.id.tv2);

//        lottie.animate().translationY(-1600).setDuration(2500).setStartDelay(0);
//        tv1.animate().translationY(-1850).setDuration(3000).setStartDelay(0);
//        tv2.animate().translationY(-1300).setDuration(3300).setStartDelay(0);
//        Animation animation = AnimationUtils.loadAnimation(this,R.anim.anim_zoomin);
//        lottie.startAnimation(animation);
//        final Handler handler = new Handler();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreenActivity.this, HalamanAwal.class);
                startActivity(intent);
                finish();
            }
        },5000);
    }
}