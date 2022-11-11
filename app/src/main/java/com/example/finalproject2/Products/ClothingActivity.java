package com.example.finalproject2.Products;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.finalproject2.R;

public class ClothingActivity extends AppCompatActivity {

    Button btnMen, btnWomen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clothing);

        btnMen = findViewById(R.id.btnMen);
        btnWomen = findViewById(R.id.btnWomen);

        btnMen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ClothingActivity.this, CategoryActivity.class));
            }
        });

        btnWomen = findViewById(R.id.btnWomen);
        btnWomen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ClothingActivity.this, CategoryActivity.class));
            }
        });
    }
}