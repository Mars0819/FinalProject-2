package com.example.finalproject2.Database;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Preference extends AppCompatActivity {
    public static final DatabaseReference DATABASE_REFERENCE = FirebaseDatabase.getInstance().getReferenceFromUrl("https://finpro2-48f9f-default-rtdb.firebaseio.com/");

}
