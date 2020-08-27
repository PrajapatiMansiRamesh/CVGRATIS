package com.example.cvgratis;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.ArrayList;

public class Hobbies extends AppCompatActivity {
    Button NextBtn;
    GridView gridView;
    int [] images={R.drawable.ic_reading,R.drawable.ic_shopping,R.drawable.ic_gardening,R.drawable.ic_meditate,R.drawable.ic_contentcreator,
            R.drawable.ic_watchingtv,R.drawable.ic_photography,R.drawable.ic_culinary,R.drawable.ic_hiking,R.drawable.ic_cycling,R.drawable.ic_cinema,
            R.drawable.ic_cooking,R.drawable.ic_badminton,R.drawable.ic_accoustic,R.drawable.ic_adventure,R.drawable.ic_swimming,R.drawable.ic_music,
            R.drawable.ic_game,R.drawable.ic_football,R.drawable.ic_basketball,R.drawable.ic_kite,R.drawable.ic_weightlifting,R.drawable.ic_martialarts,
            R.drawable.ic_running,R.drawable.ic_volleyball,R.drawable.ic_repair,R.drawable.ic_investment,R.drawable.ic_studyquran,R.drawable.ic_camping,
            R.drawable.ic_studygospel,R.drawable.ic_drawing,R.drawable.ic_architec,R.drawable.ic_hydroponics,R.drawable.ic_writing,R.drawable.ic_traveling,
            R.drawable.ic_organization,R.drawable.ic_boxing,R.drawable.ic_studyhonduism,R.drawable.ic_poker,R.drawable.ic_studybuddhist,R.drawable.ic_archery,
            R.drawable.ic_tennis,R.drawable.ic_fishing,R.drawable.ic_bowling};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hobbies);
        NextBtn=findViewById(R.id.nextbtn);
        gridView = (GridView) findViewById(R.id.gridView);
        NextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Hobbies.this, Cvpreview.class);
                startActivity(intent);
            }
        });

        CustomAdapter customAdapter=new CustomAdapter(images,this);
        gridView.setAdapter(customAdapter);
    }

    public class CustomAdapter extends BaseAdapter{
        private int [] imagePhoto;
        private Context context;
        private LayoutInflater layoutInflater;

        public CustomAdapter(int[] imagePhoto, Context context) {
            this.imagePhoto = imagePhoto;
            this.context = context;
            this.layoutInflater=(LayoutInflater)context.getSystemService(LAYOUT_INFLATER_SERVICE);
        }

        @Override
        public int getCount() {
            return imagePhoto.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View view, ViewGroup parent) {
            if(view==null)
            {
                view=layoutInflater.inflate(R.layout.hobby_grid,parent,false);
            }

            ImageView imageView=view.findViewById(R.id.imageView);

            imageView.setImageResource(imagePhoto[position]);
            return view;
        }
    }
    }
