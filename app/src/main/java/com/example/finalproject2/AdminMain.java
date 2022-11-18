package com.example.finalproject2;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.finalproject2.Admin.AdminAddStaffActivity;
import com.example.finalproject2.Admin.AdminAddStockActivity;
import com.example.finalproject2.Admin.AdminLoginPagesActivity;
import com.example.finalproject2.databinding.ActivityAdminBinding;
import com.google.firebase.auth.FirebaseAuth;


public class AdminMain extends AppCompatActivity {
    ActivityAdminBinding binding;
    FirebaseAuth mAuth;

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

        binding.btnAddStocks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AdminMain.this, AdminAddStockActivity.class));
            }
        });


        binding.btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences loginSave = getSharedPreferences(AdminLoginPagesActivity.PREFS_NAME, 0);
                SharedPreferences.Editor editor = loginSave.edit();

                editor.putBoolean("hasLogged", false);
                editor.commit();

                Toast.makeText(AdminMain.this, "Logged Out", Toast.LENGTH_LONG).show();
                startActivity(new Intent(AdminMain.this, AdminLoginPagesActivity.class));
                finish();
            }

        });
    }
}
