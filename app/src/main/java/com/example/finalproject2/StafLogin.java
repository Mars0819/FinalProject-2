package com.example.finalproject2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class StafLogin extends AppCompatActivity {
    EditText editText1,editText2;
    Button button1;
    TextView welcome,textView;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staf_login);

        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);

        img = findViewById(R.id.imageAwal);
        editText1 = findViewById(R.id.emailadmin);
        editText2 = findViewById(R.id.passwordadmin);
        welcome = findViewById(R.id.tvwelcomeadmin);
        textView = findViewById(R.id.tv1);
        button1 = findViewById(R.id.btnloginadminlogin);


        Animation animation = AnimationUtils.loadAnimation(this,R.anim.anim_zoomin);
        img.startAnimation(animation);

        welcome.animate().translationY(900).setDuration(1700).setStartDelay(100);
        editText1.animate().translationY(900).setDuration(1700).setStartDelay(100);
        editText2.animate().translationY(900).setDuration(1700).setStartDelay(100);
        button1.animate().translationY(900).setDuration(1700).setStartDelay(100);
        textView.animate().translationY(900).setDuration(1700).setStartDelay(100);

    }
}