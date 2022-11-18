package com.example.finalproject2.Admin;

import static com.example.finalproject2.Database.Preference.DATABASE_REFERENCE;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.finalproject2.R;
import com.example.finalproject2.databinding.ActivityAdminAddStocksBinding;
import com.example.finalproject2.databinding.ActivityUpdateIdBinding;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class AdminUpdateIdActivity extends AppCompatActivity {
    ActivityUpdateIdBinding binding;
    private TextView oldID;
    private EditText newID;
    private String getID;
    private Button update;

    FirebaseDatabase database;
    DatabaseReference reference;

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        binding = ActivityUpdateIdBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        database = FirebaseDatabase.getInstance();
        reference = database.getReference("Stocks").child("Item").child("ID");

        oldID = findViewById(R.id.etOldId);
        newID = findViewById(R.id.etNewId);

        update = findViewById(R.id.btnUpdateId);

        getData();

        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getID = newID.getText().toString();

                updateData();
            }
        });

    }

    private void updateData()
    {
        DATABASE_REFERENCE.child("Stocks").child("Item").child("ID").setValue(getID)
                .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void unused) {
                        newID.setText("");

                        Toast.makeText(AdminUpdateIdActivity.this, "ID Updated", Toast.LENGTH_SHORT).show();
                    }
                });
    }

    private void getData()
    {
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String value = snapshot.getValue(String.class);

                oldID.setText(value);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(AdminUpdateIdActivity.this, "Fail get Data", Toast.LENGTH_SHORT).show();
            }
        });
    }
}


