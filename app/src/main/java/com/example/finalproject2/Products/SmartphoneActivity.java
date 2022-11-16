package com.example.finalproject2.Products;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.finalproject2.R;

public class SmartphoneActivity extends AppCompatActivity {
    RecyclerView rvSmartphoneItem;
    LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smartphone);

        rvSmartphoneItem = findViewById(R.id.rvSmartphoneItem);

        SmartphoneModel[] dataSmartphone = new SmartphoneModel[]{
                new SmartphoneModel("Samsung Galaxy Z Flip 4 5G 8/512GB", "Rp. 15.726.000,-",  R.drawable.samsung_galaxy_z_flip4),
                new SmartphoneModel("Samsung Galaxy Z Fold 3 5G 512GB", "Rp. 19.990.000,-",  R.drawable.samsung_galaxy_z_fold3),
                new SmartphoneModel("Asus ROG Phone 6 8/256GB", "Rp. 10.999.000,-",  R.drawable.asus_rog_phone_6),
                new SmartphoneModel("Apple iPhone 14 Pro 5G 128GB", "Rp. 20.799.000,-", R.drawable.iphone_14_pro_max),
                new SmartphoneModel("iPhone 13 Pro Max Dual Sim 128GB", "Rp. 19.199.000,-",  R.drawable.iphone_13_pro_max),

        };

        SmartphoneAdapter adapterSmartphone = new SmartphoneAdapter(dataSmartphone, SmartphoneActivity.this);
        linearLayoutManager = new LinearLayoutManager(SmartphoneActivity.this, LinearLayoutManager.VERTICAL, false);

        rvSmartphoneItem.setHasFixedSize(true);
        rvSmartphoneItem.setLayoutManager(linearLayoutManager);
        rvSmartphoneItem.setAdapter(adapterSmartphone);
    }

}
