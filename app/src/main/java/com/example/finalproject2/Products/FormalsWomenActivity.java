package com.example.finalproject2.Products;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.finalproject2.R;

public class FormalsWomenActivity extends AppCompatActivity {
    RecyclerView rvFormalsItem;
    LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formals);

        rvFormalsItem = findViewById(R.id.rvFormalsItem);

        FormalsModel[] dataFormals = new FormalsModel[]{
                new FormalsModel("Fitted Jacket", "Rp. 479.000,-",  R.drawable.fitted_jacket),
                new FormalsModel("Oversized Jacket", "Rp. 589.000,-",  R.drawable.oversized_jacket),
                new FormalsModel("Single Breasted Jacket", "Rp. 238.000,-",  R.drawable.single_breasted_jacket),
                new FormalsModel("Sleeveless Jacket", "Rp. 399.000,-", R.drawable.sleeveless_jacket),
                new FormalsModel("Denim Suit Waistcoat", "Rp. 499.000,-",  R.drawable.denim_suit_waistcoat),

        };

        FormalsAdapter adapterFormals = new FormalsAdapter(dataFormals, FormalsWomenActivity.this);
        linearLayoutManager = new LinearLayoutManager(FormalsWomenActivity.this, LinearLayoutManager.VERTICAL, false);

        rvFormalsItem.setHasFixedSize(true);
        rvFormalsItem.setLayoutManager(linearLayoutManager);
        rvFormalsItem.setAdapter(adapterFormals);
    }

}
