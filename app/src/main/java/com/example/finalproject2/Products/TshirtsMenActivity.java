package com.example.finalproject2.Products;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.finalproject2.R;

public class TshirtsMenActivity extends AppCompatActivity {
    RecyclerView rvTshirtsItem;
    LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tshirts);

        rvTshirtsItem = findViewById(R.id.rvTshirtsItem);

        TshirtsModel[] dataTshirts = new TshirtsModel[]{
                new TshirtsModel("Oversized Shirt", "Rp. 379.000,-",  R.drawable.oversizedshirt),
                new TshirtsModel("Pocket Shirt", "Rp. 189.000,-",  R.drawable.pocketshirt),
                new TshirtsModel("Polo Shirt", "Rp. 170.000,-",  R.drawable.poloshirt),
                new TshirtsModel("Relaxed Fit Shirt", "Rp. 299.000,-", R.drawable.relaxedfit),
                new TshirtsModel("Roundneck Shirt", "Rp. 99.900,-",  R.drawable.roundneck),
                new TshirtsModel("Relaxed Fitterry Polo Shirt", "Rp. 209.000,-",  R.drawable.relaxedfitterrypoloshirt),
                new TshirtsModel("Printed Shirt", "Rp. 108.000,-",  R.drawable.printedt_shirt),
                new TshirtsModel("Relaxed Fit Cotton Shirt", "Rp. 119.000,-",  R.drawable.relaxedfitcottont_shirt),
                new TshirtsModel("Slim Fit Shirt", "Rp. 99.999,-",  R.drawable.slimfitpoloshirt),
                new TshirtsModel("Oversized Fit Printed Shirt", "Rp. 299.900,-",  R.drawable.oversizedfitprintedt_shirt),


        };

        TshirtsAdapter adapterTshirts = new TshirtsAdapter(dataTshirts, TshirtsMenActivity.this);
        linearLayoutManager = new LinearLayoutManager(TshirtsMenActivity.this, LinearLayoutManager.VERTICAL, false);

        rvTshirtsItem.setHasFixedSize(true);
        rvTshirtsItem.setLayoutManager(linearLayoutManager);
        rvTshirtsItem.setAdapter(adapterTshirts);
    }

}