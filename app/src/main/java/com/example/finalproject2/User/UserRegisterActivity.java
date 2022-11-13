package com.example.finalproject2.User;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.finalproject2.R;
import com.example.finalproject2.databinding.ActivityAdminAddStaffBinding;
import com.example.finalproject2.databinding.ActivityUserRegisterBinding;

public class UserRegisterActivity extends AppCompatActivity {
    ActivityUserRegisterBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityUserRegisterBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }
}
