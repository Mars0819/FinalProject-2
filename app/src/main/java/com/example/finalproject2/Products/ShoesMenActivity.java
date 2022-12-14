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
                new ShoesModel("Trainers Shoes", "Rp. 765.000,-",  R.drawable.trainers),
                new ShoesModel("Mesh Trainers Shoes", "Rp. 454.000,-",  R.drawable.mesh_trainers),
                new ShoesModel("Derby Shoes", "Rp. 675.000,-",  R.drawable.derby_shoes),
                new ShoesModel("Canvas Hi-Top Trainers Shoes", "Rp. 435.000,-", R.drawable.canvas_hi_top_trainers),
                new ShoesModel("Chunky Derby Shoes", "Rp. 624.000,-",  R.drawable.chunky_derby_shoes),
                new ShoesModel("Terry Slides", "Rp. 649.000,-",  R.drawable.terryslides),
                new ShoesModel("Slip On Trainers Shoes", "Rp. 525.000,-",  R.drawable.slip_ontrainers),
                new ShoesModel("Slip On Trainers Shoes", "Rp. 499.000,-",  R.drawable.slip_ontrainers_greymarl),
                new ShoesModel("Espadrilles", "Rp. 600.000,-",  R.drawable.espadrilles),
                new ShoesModel("Trainers White Shoes", "Rp. 599.000,-",  R.drawable.trainers_white),

        };

        ShoesAdapter adapterShoes = new ShoesAdapter(dataShoes, ShoesMenActivity.this);
        linearLayoutManager = new LinearLayoutManager(ShoesMenActivity.this, LinearLayoutManager.VERTICAL, false);

        rvShoesItem.setHasFixedSize(true);
        rvShoesItem.setLayoutManager(linearLayoutManager);
        rvShoesItem.setAdapter(adapterShoes);
    }

}