package com.example.finalproject2.Products;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.finalproject2.R;

public class ComputerActivity extends AppCompatActivity {
    RecyclerView rvComputerItem;
    LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer);

        rvComputerItem = findViewById(R.id.rvComputerItem);

        ComputerModel[] dataComputer = new ComputerModel[]{
                new ComputerModel("Apple iMac 21.5 MHK03ID/A 2.3GHz-DCi57th-gen/8GB/256GB SSD Iris 640", "Rp. 16.999.000,-",  R.drawable.pc_apple_imac),
                new ComputerModel("Apple Mac Mini 2020 M1 16/1TB", "Rp. 19.358.000,-",  R.drawable.mac_mini_m1_2020),
                new ComputerModel("Apple Macbook Air M2 2022 13,6 inch 8/512GB", "Rp. 23.349.000,-",  R.drawable.macbook_pro_m2_2022_silver_1_3),
                new ComputerModel("Apple MacBook Air MVFH2ID/A 2019 Core i5 RAM 8GB SSD 128GB", "Rp. 17.599.000,-", R.drawable.macbook_air_2019),
                new ComputerModel("Apple Macbook Air 2020 M1 Chip 13 inch 8/256GB", "Rp. 13.620.000,-",  R.drawable.macbook_air_m1_2020),

        };

        ComputerAdapter adapterComputer = new ComputerAdapter(dataComputer, ComputerActivity.this);
        linearLayoutManager = new LinearLayoutManager(ComputerActivity.this, LinearLayoutManager.VERTICAL, false);

        rvComputerItem.setHasFixedSize(true);
        rvComputerItem.setLayoutManager(linearLayoutManager);
        rvComputerItem.setAdapter(adapterComputer);
    }

}
