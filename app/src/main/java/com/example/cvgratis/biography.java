package com.example.cvgratis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class biography extends AppCompatActivity {
TextView bibnote;
Button NextBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biography);
        bibnote=findViewById(R.id.bibnote);
        bibnote.setText("Write down your biography to fulfill the empty space with minimum 625 words.");

        NextBtn=findViewById(R.id.nextbtn);
        NextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(biography.this, Hobbies.class);
                startActivity(intent);
            }
        });
    }
}