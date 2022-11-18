package com.example.finalproject2.Admin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.finalproject2.databinding.ActivityAdminBinding;

public class AdminActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.example.finalproject2.databinding.ActivityAdminBinding
                binding = ActivityAdminBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.btnAddStaff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AdminActivity.this, AdminAddStaffActivity.class));
            }
        });
        binding.btnAddStocks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AdminActivity.this, AdminAddStockActivity.class));
            }
        });
    }
}