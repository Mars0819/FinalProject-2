package com.example.finalproject2.Products;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.finalproject2.R;

public class ShoesWomenActivity extends AppCompatActivity {
    RecyclerView rvShoesItem;
    LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoes);

        rvShoesItem = findViewById(R.id.rvShoesItem);

        ShoesModel[] dataShoes = new ShoesModel[]{
                new ShoesModel("Chunky Heeled Loafers", "Rp. 409.000,-",  R.drawable.chunky_heeled_loafers),
                new ShoesModel("Mules", "Rp. 349.000,-",  R.drawable.mules),
                new ShoesModel("Platform Mules", "Rp. 370.000,-",  R.drawable.platform_mules),
                new ShoesModel("Chunky Snaffle Trim Loafers", "Rp. 649.000,-", R.drawable.chunky_snaffle_trim_loafers),
                new ShoesModel("Studded Mules", "Rp. 469.000,-",  R.drawable.studded_mules),
                new ShoesModel("Block Heeled Tie Strap Sandals", "Rp. 366.000,-",  R.drawable.block_heeledtie_strapsandals),
                new ShoesModel("Tie Strapes Padrilles", "Rp. 449.000,-",  R.drawable.tie_strapespadrilles),
                new ShoesModel("Shimmering Metallic Mules", "Rp. 329.000,-",  R.drawable.shimmeringmetallicmules),
                new ShoesModel("Knot Detail Sandals", "Rp. 392.000,-",  R.drawable.knot_detailsandals),
                new ShoesModel("Braided Slides", "Rp. 419.000,-",  R.drawable.braidedslides),

        };

        ShoesAdapter adapterShoes = new ShoesAdapter(dataShoes, ShoesWomenActivity.this);
        linearLayoutManager = new LinearLayoutManager(ShoesWomenActivity.this, LinearLayoutManager.VERTICAL, false);

        rvShoesItem.setHasFixedSize(true);
        rvShoesItem.setLayoutManager(linearLayoutManager);
        rvShoesItem.setAdapter(adapterShoes);
    }

}
