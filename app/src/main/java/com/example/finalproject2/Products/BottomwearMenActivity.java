package com.example.finalproject2.Products;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.finalproject2.R;

public class BottomwearMenActivity extends AppCompatActivity {
    RecyclerView rvBottomwearItem;
    LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottomwear);

        rvBottomwearItem = findViewById(R.id.rvBottomwearItem);

        BottomwearModel[] dataBottomwear = new BottomwearModel[]{
                new BottomwearModel("Reguler Jeans", "Rp. 324.000,-",  R.drawable.regular_jeans),
                new BottomwearModel("Reguler Fit Sweatshirt Shorts", "Rp. 232.000,-",  R.drawable.regular_fit_sweatshirt_shorts),
                new BottomwearModel("Relaxed Fit Printed Sweatshorts", "Rp. 245.000,-",  R.drawable.relaxed_fit_printed_sweatshorts),
                new BottomwearModel("Reguler Fit Twill Cargo Shorts", "Rp. 199.000,-", R.drawable.regular_fit_twill_cargo_shorts),
                new BottomwearModel("Slim Fit Jeans", "Rp. 309.000,-",  R.drawable.slim_jeans),

        };

        BottomwearAdapter adapterBottomwear = new BottomwearAdapter(dataBottomwear, BottomwearMenActivity.this);
        linearLayoutManager = new LinearLayoutManager(BottomwearMenActivity.this, LinearLayoutManager.VERTICAL, false);

        rvBottomwearItem.setHasFixedSize(true);
        rvBottomwearItem.setLayoutManager(linearLayoutManager);
        rvBottomwearItem.setAdapter(adapterBottomwear);
    }

}