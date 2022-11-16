package com.example.finalproject2.User;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.finalproject2.R;

public class RegisterActivity extends AppCompatActivity {
    EditText etName;
    EditText etPassword;
    EditText etRepassword;
    TextView tvLogin;
    Button btnRegister;
    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etName = findViewById(R.id.etName);
        etPassword = findViewById(R.id.etPassword);
        etRepassword = findViewById(R.id.etRepassword);
        tvLogin = findViewById(R.id.tvLogin);
        btnRegister = findViewById(R.id.btnRegister);
        db = new DatabaseHelper(this);

        tvLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = etName.getText().toString().trim();
                String pwd = etPassword.getText().toString().trim();
                String cnf_pwd = etRepassword.getText().toString().trim();
                
                if (pwd.equals(cnf_pwd)){
                    long val = db.addUser(user,pwd);
                    if (val > 0){
                        Toast.makeText(RegisterActivity.this, "Anda telah terdaftar!", Toast.LENGTH_SHORT).show();
                        Intent intentMoveToLogin = new Intent(RegisterActivity.this, LoginActivity.class);
                        startActivity(intentMoveToLogin);
                    }else{
                        Toast.makeText(RegisterActivity.this, "Pendaftaran gagal!", Toast.LENGTH_SHORT).show();
                    }
                }else {
                    Toast.makeText(RegisterActivity.this, "Password tidak sama!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}