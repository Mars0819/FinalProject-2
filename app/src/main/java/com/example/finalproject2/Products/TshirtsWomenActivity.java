package com.example.finalproject2.Products;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.finalproject2.R;

public class TshirtsWomenActivity extends AppCompatActivity {
    RecyclerView rvTshirtsItem;
    LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tshirts);

        rvTshirtsItem = findViewById(R.id.rvTshirtsItem);

        TshirtsModel[] dataTshirts = new TshirtsModel[]{
                new TshirtsModel("Cotton T-Shirt", "Rp. 232.000,-",  R.drawable.cotton_tshirt),
                new TshirtsModel("Printed T-Shirt", "Rp. 300.000,-",  R.drawable.printed_tshirt),
                new TshirtsModel("Oversized T-Shirt", "Rp. 299.000,-",  R.drawable.oversized_tshirt),
                new TshirtsModel("Sleeveless T-Shirt", "Rp. 199.000,-", R.drawable.sleeveless_tshirt),
                new TshirtsModel("Fineknit T-Shirt", "Rp. 280.000,-",  R.drawable.fineknit_tshirt),

        };

        TshirtsAdapter adapterTshirts = new TshirtsAdapter(dataTshirts, TshirtsWomenActivity.this);
        linearLayoutManager = new LinearLayoutManager(TshirtsWomenActivity.this, LinearLayoutManager.VERTICAL, false);

        rvTshirtsItem.setHasFixedSize(true);
        rvTshirtsItem.setLayoutManager(linearLayoutManager);
        rvTshirtsItem.setAdapter(adapterTshirts);
    }

}
