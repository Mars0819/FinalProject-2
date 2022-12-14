package com.example.finalproject2.Products;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.finalproject2.R;

public class FormalsMenActivity extends AppCompatActivity {
    RecyclerView rvFormalsItem;
    LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formals);

        rvFormalsItem = findViewById(R.id.rvFormalsItem);

        FormalsModel[] dataFormals = new FormalsModel[]{
                new FormalsModel("Slim Fit Jacket", "Rp. 473.000,-",  R.drawable.jacket_slim_fit),
                new FormalsModel("Suit Waist Coat Slim Fit Black", "Rp. 432.000,-",  R.drawable.suitwaistcoatslimfit_black),
                new FormalsModel("Slim Fit Blazer", "Rp. 635.000,-",  R.drawable.jas_slim_fit),
                new FormalsModel("Slim Fit Cotton Chinos", "Rp. 455.000,-",  R.drawable.slim_fit_cotton_chinos),
                new FormalsModel("Twill Trousers Slim Fit", "Rp. 299.000,-",  R.drawable.twilltrousersslimfit),
                new FormalsModel("Slim Fit Suit Trousers", "Rp. 362.000,-", R.drawable.suit_trousers_slim_fit),
                new FormalsModel("Jacket Skinny Fit", "Rp. 300.000,-",  R.drawable.jacketskinnyfit),
                new FormalsModel("Slim Fit Suit Waistcoat", "Rp. 488.000,-",  R.drawable.suit_waiscoat_slim_fit),
                new FormalsModel("Jacket Slim Fit Dark Grey", "Rp. 343.000,-",  R.drawable.jacketslimfit_darkgrey),
                new FormalsModel("Suit Trousers Skinny Fit", "Rp. 449.000,-",  R.drawable.suittrousersskinnyfit),

        };

        FormalsAdapter adapterFormals = new FormalsAdapter(dataFormals, FormalsMenActivity.this);
        linearLayoutManager = new LinearLayoutManager(FormalsMenActivity.this, LinearLayoutManager.VERTICAL, false);

        rvFormalsItem.setHasFixedSize(true);
        rvFormalsItem.setLayoutManager(linearLayoutManager);
        rvFormalsItem.setAdapter(adapterFormals);
    }

}