package com.example.finalproject2.Products;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.finalproject2.R;

public class BooksActivity extends AppCompatActivity {
    RecyclerView rvBooksItem;
    LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books);

        rvBooksItem = findViewById(R.id.rvBooksItem);

        BooksModel[] dataBooks = new BooksModel[]{
                new BooksModel("Valerie Patkar\n" +
                        "Lukacita", "Rp. 125.000,-",  R.drawable.lukacita_depan),
                new BooksModel("Fellexandro Ruby\n" +
                        "You Do You: Discovering Life through Experiments & Self-Awareness", "Rp. 96.000,-",  R.drawable.you_do_you),
                new BooksModel("Fiersa Besari\n" +
                        "Konspirasi Alam Semesta", "Rp. 75.000,-",  R.drawable.konspirasi_alam_semesta),
                new BooksModel("Andrea Hirata\n" +
                        "Novel Orang-orang Biasa", "Rp. 89.000,-", R.drawable.orang_orang_biasa),
                new BooksModel("Ratih Kumala\n" +
                        "The Potion of Twilight", "Rp. 58.000,-",  R.drawable.potion_of_twilight),

        };

        BooksAdapter adapterBooks = new BooksAdapter(dataBooks, BooksActivity.this);
        linearLayoutManager = new LinearLayoutManager(BooksActivity.this, LinearLayoutManager.VERTICAL, false);

        rvBooksItem.setHasFixedSize(true);
        rvBooksItem.setLayoutManager(linearLayoutManager);
        rvBooksItem.setAdapter(adapterBooks);
    }

}
