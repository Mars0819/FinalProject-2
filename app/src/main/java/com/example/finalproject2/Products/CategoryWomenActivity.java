package com.example.finalproject2.Products;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.finalproject2.R;

public class CategoryWomenActivity extends AppCompatActivity {

    Button btnTshirts,btnFormals,btnBottomwear,btnShoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        btnTshirts = findViewById(R.id.btnTshirts);
        btnTshirts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CategoryWomenActivity.this, TshirtsWomenActivity.class));
            }
        });

        btnFormals = findViewById(R.id.btnFormals);
        btnFormals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CategoryWomenActivity.this, FormalsWomenActivity.class));
            }
        });

        btnBottomwear = findViewById(R.id.btnBottomwear);
        btnBottomwear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CategoryWomenActivity.this, BottomwearWomenActivity.class));
            }
        });

        btnShoes = findViewById(R.id.btnShoes);
        btnShoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CategoryWomenActivity.this, ShoesWomenActivity.class));
            }
        });
    }
}