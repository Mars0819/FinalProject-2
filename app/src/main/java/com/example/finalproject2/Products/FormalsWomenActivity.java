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
                new FormalsModel("Oversized Shirt", "Rp. 379.000,-",  R.drawable.oversizedshirt),
                new FormalsModel("Pocket Shirt", "Rp. 189.000,-",  R.drawable.pocketshirt),
                new FormalsModel("Polo Shirt", "Rp. 170.000,-",  R.drawable.poloshirt),
                new FormalsModel("Relaxed Fit Shirt", "Rp. 299.000,-", R.drawable.relaxedfit),
                new FormalsModel("Roundneck Shirt", "Rp. 99.900,-",  R.drawable.roundneck),

        };

        FormalsAdapter adapterFormals = new FormalsAdapter(dataFormals, FormalsWomenActivity.this);
        linearLayoutManager = new LinearLayoutManager(FormalsWomenActivity.this, LinearLayoutManager.VERTICAL, false);

        rvFormalsItem.setHasFixedSize(true);
        rvFormalsItem.setLayoutManager(linearLayoutManager);
        rvFormalsItem.setAdapter(adapterFormals);
    }

}
