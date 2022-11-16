package com.example.finalproject2.Products;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.finalproject2.R;

public class CategoryMenActivity extends AppCompatActivity {

    Button btnTshirts,btnFormals,btnBottomwear,btnShoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        btnTshirts = findViewById(R.id.btnTshirts);
        btnTshirts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CategoryMenActivity.this, TshirtsMenActivity.class));
            }
        });

        btnFormals = findViewById(R.id.btnFormals);
        btnFormals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CategoryMenActivity.this, FormalsMenActivity.class));
            }
        });

        btnBottomwear = findViewById(R.id.btnBottomwear);
        btnBottomwear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CategoryMenActivity.this, BottomwearMenActivity.class));
            }
        });

        btnShoes = findViewById(R.id.btnShoes);
        btnShoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CategoryMenActivity.this, ShoesMenActivity.class));
            }
        });
    }
}