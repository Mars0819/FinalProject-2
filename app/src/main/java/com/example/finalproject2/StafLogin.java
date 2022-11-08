package com.example.finalproject2;

import static com.example.finalproject2.Database.Preference.DATABASE_REFERENCE;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.finalproject2.Admin.AdminLoginPagesActivity;
import com.example.finalproject2.databinding.ActivityAdminLoginPagesBinding;
import com.example.finalproject2.databinding.ActivityStafLoginBinding;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.ValueEventListener;

public class StafLogin extends AppCompatActivity {
//    EditText editText1,editText2;
//    Button button1;
//    TextView welcome,textView;
//    ImageView img;
    @NonNull ActivityStafLoginBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityStafLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);

//        img = findViewById(R.id.imageAwal);
//        editText1 = findViewById(R.id.emailadmin);
//        editText2 = findViewById(R.id.passwordadmin);
//        welcome = findViewById(R.id.tvwelcomeadmin);
       // textView = findViewById(R.id.tv1);
       // button1 = findViewById(R.id.btnloginadminlogin);

//
//        Animation animation = AnimationUtils.loadAnimation(this,R.anim.anim_zoomin);
//        img.startAnimation(animation);

//        welcome.animate().translationY(900).setDuration(1700).setStartDelay(100);
//        editText1.animate().translationY(900).setDuration(1700).setStartDelay(100);
//        editText2.animate().translationY(900).setDuration(1700).setStartDelay(100);
//        button1.animate().translationY(900).setDuration(1700).setStartDelay(100);
//        textView.animate().translationY(900).setDuration(1700).setStartDelay(100);

        binding.btnloginstafflogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usernameLogin = binding.emailstaff.getText().toString();
                String passwordLogin = binding.passwordstaff.getText().toString();

                if (usernameLogin.isEmpty() || passwordLogin.isEmpty()) {
                    Toast.makeText(StafLogin.this, "Please enter your username or password", Toast.LENGTH_SHORT).show();
                } else {
                    DATABASE_REFERENCE.child("Staffs").addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {
                            //check if username/password is exist in firebase db
                            if (snapshot.hasChild(usernameLogin)) {
                                String getPasswordLogin = snapshot.child(usernameLogin).child("password").getValue(String.class);
                                if (getPasswordLogin.equals(passwordLogin)) {
                                    Toast.makeText(StafLogin.this, "Successfully Logged in", Toast.LENGTH_SHORT).show();
                                    startActivity(new Intent(StafLogin.this, SuccessLoginStaf.class));
                                    finish();
                                } else {
                                    Toast.makeText(StafLogin.this, "Wrong Password", Toast.LENGTH_SHORT).show();
                                }
                            } else {
                                Toast.makeText(StafLogin.this, "Wrong Username", Toast.LENGTH_SHORT).show();
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
