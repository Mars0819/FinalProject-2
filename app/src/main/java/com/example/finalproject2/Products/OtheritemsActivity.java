package com.example.finalproject2.Products;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.finalproject2.R;

public class OtheritemsActivity extends AppCompatActivity {
    RecyclerView rvOtheritemsItem;
    LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otheritems);

        rvOtheritemsItem = findViewById(R.id.rvOtheritemsItem);

        OtheritemsModel[] dataOtheritems = new OtheritemsModel[]{
                new OtheritemsModel("BLÅVINGAD\n" +
                        "Boneka, orca/hitam putih, 60 cm", "Rp. 149.000,-",  R.drawable.blavingad),
                new OtheritemsModel("SPARKA\n" +
                        "Soft toy, football/black white", "Rp. 49.900,-",  R.drawable.sparka),
                new OtheritemsModel("JÄTTELIK\n" +
                        "Soft toy, dinosaur/dinosaur/thyrannosaurus rex, 44 cm", "Rp. 149.000,-",  R.drawable.jattelik),
                new OtheritemsModel("SÖTAST\n" +
                        "Soft toy, set of 2, koala/grey", "Rp. 199.000,-", R.drawable.sottast),
                new OtheritemsModel("GOSIG GOLDEN\n" +
                        "Soft toy, dog/golden retriever, 40 cm", "Rp. 79.900,-",  R.drawable.gosig_golden),
                new OtheritemsModel("GRACIÖS\n" +
                        "Cushion, velvet/turquoise, 36 cm", "Rp. 199.000,-",  R.drawable.gracios),
                new OtheritemsModel("UPPTÅG\n" +
                        "Cushion, blue, 49x36 cm", "Rp. 179.000,-",  R.drawable.upptag),
                new OtheritemsModel("FAMNIG HJÄRTA\n" +
                        "Cushion, red, 40x101 cm", "Rp. 49.900,-",  R.drawable.famnig),
                new OtheritemsModel("BARNDRÖM\n" +
                        "Bantal kursi dengan kantong, krem, 32x8 cm", "Rp. 199.000,-",  R.drawable.barndrom),
                new OtheritemsModel("FJÄDERMOLN\n" +
                        "Bantal kursi, biru muda, 59x34 cm", "Rp. 129.000,-",  R.drawable.fjadermoln),

        };

        OtheritemsAdapter adapterOtheritems = new OtheritemsAdapter(dataOtheritems, OtheritemsActivity.this);
        linearLayoutManager = new LinearLayoutManager(OtheritemsActivity.this, LinearLayoutManager.VERTICAL, false);

        rvOtheritemsItem.setHasFixedSize(true);
        rvOtheritemsItem.setLayoutManager(linearLayoutManager);
        rvOtheritemsItem.setAdapter(adapterOtheritems);
    }

}
