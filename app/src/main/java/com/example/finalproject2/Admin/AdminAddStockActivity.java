package com.example.finalproject2.Admin;
import static com.example.finalproject2.Database.Preference.DATABASE_REFERENCE;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.finalproject2.databinding.ActivityAdminAddStocksBinding;


public class AdminAddStockActivity extends AppCompatActivity {
    ActivityAdminAddStocksBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAdminAddStocksBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnAddStocks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String idItem = binding.etItemId.getText().toString();
                String quantityItem = binding.etQuantityItem.getText().toString();

                if (idItem.isEmpty() || quantityItem.isEmpty()) {
                    Toast.makeText(AdminAddStockActivity.this, "Please complete the form", Toast.LENGTH_SHORT).show();
                } else {
                    DATABASE_REFERENCE.child("Stocks").child("Item").child("ID").setValue(idItem);
                    DATABASE_REFERENCE.child("Stocks").child("Item").child("Quantity").setValue(quantityItem);
                    Toast.makeText(AdminAddStockActivity.this, "Add Stock Successfully", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(AdminAddStockActivity.this, AdminActivity.class));
                    finish();
                }
            }
        });
        binding.btnUpdateId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AdminAddStockActivity.this, AdminUpdateIdActivity.class));
            }
        });
    }
}

