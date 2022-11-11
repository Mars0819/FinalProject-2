package com.example.finalproject2.Products;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.finalproject2.R;

public class HomepageActivity extends AppCompatActivity {

    Button btnClothing, btnElectronics, btnBooks, btnOtherItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        btnClothing = findViewById(R.id.btnClothing);
        btnElectronics = findViewById(R.id.btnElectronics);

        btnClothing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomepageActivity.this,ClothingActivity.class));
            }
        });

        btnElectronics = findViewById(R.id.btnElectronics);
        btnElectronics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomepageActivity.this, ElectronicsActivity.class));
            }
        });

        btnBooks = findViewById(R.id.btnBooks);
        btnBooks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomepageActivity.this, BooksActivity.class));
            }
        });

        btnOtherItems = findViewById(R.id.btnOtherItems);
        btnOtherItems.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomepageActivity.this, OtheritemsActivity.class));
            }
        });
    }
}