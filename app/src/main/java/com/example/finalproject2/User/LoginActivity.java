package com.example.finalproject2.User;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.finalproject2.Products.HomepageActivity;
import com.example.finalproject2.R;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class LoginActivity extends AppCompatActivity {

    EditText etName;
    EditText etPassword;
    TextView tvRegister;
    Button btnLogin;
    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etName = findViewById(R.id.etName);
        etPassword = findViewById(R.id.etPassword);
        tvRegister = findViewById(R.id.tvRegister);
        btnLogin = findViewById(R.id.btnLogin);
        db = new DatabaseHelper(this);

        tvRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = etName.getText().toString().trim();
                String pwd = etPassword.getText().toString().trim();
                boolean res = db.checkUser(user, pwd);
                if (res)
                {
                    Toast.makeText(LoginActivity.this, "Login Berhasil!",Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(LoginActivity.this,HomepageActivity.class);
                    startActivity(intent);
                    finish();
                }
                else
                {
                    Toast.makeText(LoginActivity.this, "Login Gagal!",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}