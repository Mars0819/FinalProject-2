package com.example.finalproject2.Products;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.finalproject2.R;

public class ElectronicsActivity extends AppCompatActivity {

    Button btnComputer, btnSmartphone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electronics);
        btnComputer = findViewById(R.id.btnComputer);
        btnComputer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ElectronicsActivity.this, ComputerActivity.class));
            }
        });

        btnSmartphone = findViewById(R.id.btnSmartphone);
        btnSmartphone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ElectronicsActivity.this, SmartphoneActivity.class));
            }
        });
    }
}