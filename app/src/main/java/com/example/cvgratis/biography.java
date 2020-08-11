package com.example.cvgratis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class biography extends AppCompatActivity {
TextView bibnote;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biography);
        bibnote=findViewById(R.id.bibnote);
        bibnote.setText("Write down your biography to fulfill the empty space with minimum 625 words.");
    }
}