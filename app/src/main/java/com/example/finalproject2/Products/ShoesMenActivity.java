package com.example.finalproject2.Products;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.finalproject2.R;

public class ShoesMenActivity extends AppCompatActivity {
    RecyclerView rvShoesItem;
    LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoes);

        rvShoesItem = findViewById(R.id.rvShoesItem);

        ShoesModel[] dataShoes = new ShoesModel[]{
                new ShoesModel("Oversized Shirt", "Rp. 379.000,-",  R.drawable.oversizedshirt),
                new ShoesModel("Pocket Shirt", "Rp. 189.000,-",  R.drawable.pocketshirt),
                new ShoesModel("Polo Shirt", "Rp. 170.000,-",  R.drawable.poloshirt),
                new ShoesModel("Relaxed Fit Shirt", "Rp. 299.000,-", R.drawable.relaxedfit),
                new ShoesModel("Roundneck Shirt", "Rp. 99.900,-",  R.drawable.roundneck),

        };

        ShoesAdapter adapterShoes = new ShoesAdapter(dataShoes, ShoesMenActivity.this);
        linearLayoutManager = new LinearLayoutManager(ShoesMenActivity.this, LinearLayoutManager.VERTICAL, false);

        rvShoesItem.setHasFixedSize(true);
        rvShoesItem.setLayoutManager(linearLayoutManager);
        rvShoesItem.setAdapter(adapterShoes);
    }

}