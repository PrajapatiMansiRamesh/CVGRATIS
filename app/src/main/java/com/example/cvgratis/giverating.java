package com.example.cvgratis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class giverating extends AppCompatActivity {
TextView feedback1,feedback2,feedback3;
Button rating;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giverating);
        feedback1=findViewById(R.id.feedback_text1);
        feedback2=findViewById(R.id.feedback_text2);
        feedback3=findViewById(R.id.feedback_text3);
        rating=findViewById(R.id.submitrating);
        feedback1.setText("We would be happy to hear your feedback");
        feedback2.setText("on Google PlayStore, please");
        feedback3.setText("leave us your review.");
    }
}