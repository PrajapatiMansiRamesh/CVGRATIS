package com.example.cvgratis;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;

public class selectvariation extends AppCompatActivity {
    private ImageButton img,img2,img3;
    Button nextBtn;
    private boolean isSelected = false;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selectvariation);

        nextBtn=findViewById(R.id.next);

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent contacts_intent = new Intent(selectvariation.this, Personal.class);
                startActivity(contacts_intent);
            }
        });
        img = (ImageButton) findViewById(R.id.img1);
        img.setClickable(true);
        img.setBackground(getDrawable(R.drawable.unselect_color1));
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.startAnimation(AnimationUtils.loadAnimation(getBaseContext(), android.R.anim.fade_in));
                if (isSelected) {
                    isSelected = false;
                    img.setBackground(getDrawable(R.drawable.unselect_color1));
                } else {
                    isSelected = true;
                    img.setBackground(getDrawable(R.drawable.selected_color1));
                }
            }
        });

        img2 = (ImageButton) findViewById(R.id.img2);
        img2.setClickable(true);
        img2.setBackground(getDrawable(R.drawable.unselect_color2));
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img2.startAnimation(AnimationUtils.loadAnimation(getBaseContext(), android.R.anim.fade_in));
                if (isSelected) {
                    isSelected = false;
                    img2.setBackground(getDrawable(R.drawable.unselect_color2));
                } else {
                    isSelected = true;
                    img2.setBackground(getDrawable(R.drawable.selected_color2));
                }
            }
        });

        img3 = (ImageButton) findViewById(R.id.img3);
        img3.setClickable(true);
        img3.setBackground(getDrawable(R.drawable.unselect_color3));
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img3.startAnimation(AnimationUtils.loadAnimation(getBaseContext(), android.R.anim.fade_in));
                if (isSelected) {
                    isSelected = false;
                    img3.setBackground(getDrawable(R.drawable.unselect_color3));
                } else {
                    isSelected = true;
                    img3.setBackground(getDrawable(R.drawable.selected_color3));
                }
            }
        });
    }

}