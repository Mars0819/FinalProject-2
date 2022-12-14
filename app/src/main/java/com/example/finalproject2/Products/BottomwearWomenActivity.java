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
                new BottomwearModel("Straight High Split Jeans", "Rp. 479.000,-",  R.drawable.straight_high_split_jeans),
                new BottomwearModel("90s Baggy High Waist Jeans", "Rp. 588.000,-",  R.drawable.baggy_high_waist_jeans),
                new BottomwearModel("Mom Fit Denim Shorts", "Rp. 430.000,-",  R.drawable.mom_fit_denim_shorts),
                new BottomwearModel("Sweatshorts", "Rp. 532.000,-", R.drawable.sweatshorts),
                new BottomwearModel("Denim Shorts", "Rp. 299.000,-",  R.drawable.denim_shorts),
                new BottomwearModel("Crease Leg Lined Satin Trousers", "Rp. 389.000,-",  R.drawable.crease_leglinedsatintrousers),
                new BottomwearModel("Straight Cargo Trousers", "Rp. 249.000,-",  R.drawable.straightcargotrousers),
                new BottomwearModel("Wide Satin Trousers", "Rp. 299.000,-",  R.drawable.widesatintrousers),
                new BottomwearModel("Sweatpants", "Rp. 199.000,-",  R.drawable.sweatpants),
                new BottomwearModel("Wide Linen Blend Trousers", "Rp. 399.000,-",  R.drawable.widelinen_blendtrousers),

        };

        BottomwearAdapter adapterBottomwear = new BottomwearAdapter(dataBottomwear, BottomwearWomenActivity.this);
        linearLayoutManager = new LinearLayoutManager(BottomwearWomenActivity.this, LinearLayoutManager.VERTICAL, false);

        rvBottomwearItem.setHasFixedSize(true);
        rvBottomwearItem.setLayoutManager(linearLayoutManager);
        rvBottomwearItem.setAdapter(adapterBottomwear);
    }

}