package com.example.finalproject2.Products;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.finalproject2.R;

public class TshirtsActivity extends AppCompatActivity {
    RecyclerView rvTshirtsItem;
    LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tshirts);

        rvTshirtsItem = findViewById(R.id.rvTshirtsItem);

        TshirtsModel[] dataTshirts = new TshirtsModel[]{


        };

        TshirtsAdapter adapterTshirts = new TshirtsAdapter(dataTshirts, TshirtsActivity.this);
        linearLayoutManager = new LinearLayoutManager(TshirtsActivity.this, LinearLayoutManager.HORIZONTAL, false);

        rvTshirtsItem.setHasFixedSize(true);
        rvTshirtsItem.setLayoutManager(linearLayoutManager);
        rvTshirtsItem.setAdapter(adapterTshirts);
    }

}