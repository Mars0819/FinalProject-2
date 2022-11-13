package com.example.finalproject2.Admin;

import static com.example.finalproject2.Database.Preference.DATABASE_REFERENCE;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.finalproject2.AdminMain;
import com.example.finalproject2.databinding.ActivityAdminLoginPagesBinding;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.ValueEventListener;

public class AdminLoginPagesActivity extends AppCompatActivity {
    public static final String PREFS_NAME = "Logined";
    ActivityAdminLoginPagesBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAdminLoginPagesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnLoginAdmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usernameLogin = binding.etAdminUserName.getText().toString();
                String passwordLogin = binding.etAdminPassword.getText().toString();

                if (usernameLogin.isEmpty() || passwordLogin.isEmpty()) {
                    Toast.makeText(AdminLoginPagesActivity.this, "Please enter your username or password", Toast.LENGTH_SHORT).show();
                } else {
                    DATABASE_REFERENCE.child("mimin").addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {
                            //check if username/password is exist in firebase db
                            if (snapshot.hasChild(usernameLogin)) {
                                String getPasswordLogin = snapshot.child(usernameLogin).child("password").getValue(String.class);
                                if (getPasswordLogin.equals(passwordLogin)) {
                                    SharedPreferences loginSave = getSharedPreferences(AdminLoginPagesActivity.PREFS_NAME, 0);
                                    SharedPreferences.Editor editor = loginSave.edit();

                                    editor.putBoolean("hasLogged", true);
                                    editor.commit();

                                    Toast.makeText(AdminLoginPagesActivity.this, "Successfully Logged in", Toast.LENGTH_SHORT).show();
                                    startActivity(new Intent(AdminLoginPagesActivity.this, AdminMain.class));
                                    finish();
                                } else {
                                    Toast.makeText(AdminLoginPagesActivity.this, "Wrong Password", Toast.LENGTH_SHORT).show();
                                }
                            } else {
                                Toast.makeText(AdminLoginPagesActivity.this, "Wrong Username", Toast.LENGTH_SHORT).show();
                            }
                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {

                        }
                    });
                }
            }
        });
    }
}