package com.example.finalproject2.Products;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.finalproject2.R;

public class BottomwearWomenActivity extends AppCompatActivity {
    RecyclerView rvBottomwearItem;
    LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottomwear);

        rvBottomwearItem = findViewById(R.id.rvBottomwearItem);

        BottomwearModel[] dataBottomwear = new BottomwearModel[]{
                new BottomwearModel("Oversized Shirt", "Rp. 379.000,-",  R.drawable.oversizedshirt),
                new BottomwearModel("Pocket Shirt", "Rp. 189.000,-",  R.drawable.pocketshirt),
                new BottomwearModel("Polo Shirt", "Rp. 170.000,-",  R.drawable.poloshirt),
                new BottomwearModel("Relaxed Fit Shirt", "Rp. 299.000,-", R.drawable.relaxedfit),
                new BottomwearModel("Roundneck Shirt", "Rp. 99.900,-",  R.drawable.roundneck),

        };

        BottomwearAdapter adapterBottomwear = new BottomwearAdapter(dataBottomwear, BottomwearWomenActivity.this);
        linearLayoutManager = new LinearLayoutManager(BottomwearWomenActivity.this, LinearLayoutManager.VERTICAL, false);

        rvBottomwearItem.setHasFixedSize(true);
        rvBottomwearItem.setLayoutManager(linearLayoutManager);
        rvBottomwearItem.setAdapter(adapterBottomwear);
    }

}