package com.example.finalproject2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class HalamanAwal extends AppCompatActivity {

    Button userlogin,registeruser,about;
    TextView adminlogin,stafflogin,lorem,welcome;
    ImageView img;
    RelativeLayout rv;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_awal);

        userlogin = findViewById(R.id.buttonlogin);
        adminlogin = findViewById(R.id.tvadminlogin);
        registeruser = findViewById(R.id.buttonregis);
        stafflogin = findViewById(R.id.tvstafflogin);
        about = findViewById(R.id.btnabout);
        img = findViewById(R.id.imageAwal);
        lorem =findViewById(R.id.textviewlorem);
        welcome = findViewById(R.id.tvwelcome);
        img = findViewById(R.id.imageAwal);

        Animation animation = AnimationUtils.loadAnimation(this,R.anim.anim_zoomin);
        img.startAnimation(animation);
        welcome.animate().translationY(700).setDuration(1700).setStartDelay(100);
        lorem.animate().translationY(700).setDuration(1700).setStartDelay(100);
        userlogin.animate().translationY(700).setDuration(1700).setStartDelay(100);
        registeruser.animate().translationY(700).setDuration(1700).setStartDelay(100);


        userlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HalamanAwal.this,UserLogin.class);
                intent.addFlags(intent.FLAG_ACTIVITY_CLEAR_TOP|intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
            }
        });
        adminlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HalamanAwal.this,AdminLogin.class);
                intent.addFlags(intent.FLAG_ACTIVITY_CLEAR_TOP|intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
            }
        });
        registeruser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HalamanAwal.this,RegisUser.class);
                intent.addFlags(intent.FLAG_ACTIVITY_CLEAR_TOP|intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
            }
        });
        stafflogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HalamanAwal.this,StafLogin.class);
                intent.addFlags(intent.FLAG_ACTIVITY_CLEAR_TOP|intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
            }
        });
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HalamanAwal.this, AboutActivity.class);
                intent.addFlags(intent.FLAG_ACTIVITY_CLEAR_TOP|intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
            }
        });
    }

}