package com.example.finalproject2.Admin;
import static com.example.finalproject2.Database.Preference.DATABASE_REFERENCE;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.finalproject2.databinding.ActivityAdminUpdateIdItemsBinding;
import com.example.finalproject2.databinding.ActivityAdminUpdateIdItemsBinding;

public class AdminUpdateIdItemsActivity extends AppCompatActivity {
    ActivityAdminUpdateIdItemsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAdminUpdateIdItemsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnUpdateIdItems.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String men = binding.etItemId.getText().toString();
                String Tshrits = binding.etNamaBarang.getText().toString();

                if (men.isEmpty() || Tshrits.isEmpty()) {
                    Toast.makeText(AdminUpdateIdItemsActivity.this, "Please complete the form", Toast.LENGTH_SHORT).show();
                } else {
                    DATABASE_REFERENCE.child("categori").child(men).child("Tshirts").setValue(Tshrits);
                    Toast.makeText(AdminUpdateIdItemsActivity.this, "Update Successfully", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(AdminUpdateIdItemsActivity.this, AdminActivity.class));
                    finish();
                }
            }
        });
    }
}

