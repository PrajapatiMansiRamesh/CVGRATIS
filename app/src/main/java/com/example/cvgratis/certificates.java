package com.example.cvgratis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class certificates extends AppCompatActivity {
Button nextBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_certificates);
        nextBtn=findViewById(R.id.nextbtn);
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hardskill_intent = new Intent(certificates.this, hearskill.class);
                startActivity(hardskill_intent);
            }
        });
    }
}