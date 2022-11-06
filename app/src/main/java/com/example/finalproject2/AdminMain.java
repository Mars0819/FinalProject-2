package com.example.finalproject2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.finalproject2.Admin.AdminAddStaffActivity;
import com.example.finalproject2.Admin.AdminAddStockActivity;
import com.example.finalproject2.databinding.ActivityAdminBinding;


public class AdminMain extends AppCompatActivity {
    ActivityAdminBinding binding;

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        binding = ActivityAdminBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnAddStaff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AdminMain.this, AdminAddStaffActivity.class));
            }
        });

        binding.btnAddStock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AdminMain.this, AdminAddStockActivity.class));
            }
        });


    }
}
