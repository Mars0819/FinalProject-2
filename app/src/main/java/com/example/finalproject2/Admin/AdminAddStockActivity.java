package com.example.finalproject2.Admin;
import static com.example.finalproject2.Database.Preference.DATABASE_REFERENCE;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.finalproject2.databinding.ActivityAdminAddStockBinding;

public class AdminAddStockActivity extends AppCompatActivity {
    ActivityAdminAddStockBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAdminAddStockBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnAddStock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String idItem = binding.etItemId.getText().toString();
                String quantityItem = binding.etQuantityItem.getText().toString();

                if (idItem.isEmpty() || quantityItem.isEmpty()) {
                    Toast.makeText(AdminAddStockActivity.this, "Please complete the form", Toast.LENGTH_SHORT).show();
                } else {
                    DATABASE_REFERENCE.child("Stocks").child(idItem).child("quantity").setValue(quantityItem);
                    Toast.makeText(AdminAddStockActivity.this, "Add Stock Successfully", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(AdminAddStockActivity.this, AdminActivity.class));
                    finish();
                }
            }
        });
    }
}

