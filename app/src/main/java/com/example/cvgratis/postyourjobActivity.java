package com.example.cvgratis;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class postyourjobActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    EditText position,companyname,email,qualification,worklocation;
    Button NextBtn;
    DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.postyourjob);

        androidx.appcompat.widget.Toolbar toolbar=(Toolbar) findViewById(R.id.main_toolbar);
        setSupportActionBar(toolbar);
        drawerLayout=findViewById(R.id.drawer_layout);

        position=findViewById(R.id.position);
        companyname=findViewById(R.id.company_name);
        worklocation=findViewById(R.id.work_location);
        qualification=findViewById(R.id.qualifications);
        email=findViewById(R.id.email);
        NextBtn=findViewById(R.id.nextbtn);

        NavigationView navigationView=(NavigationView) findViewById(R.id.drawer);
        navigationView.setNavigationItemSelectedListener(postyourjobActivity.this);
        ActionBarDrawerToggle drawerToggle=new ActionBarDrawerToggle(this,drawerLayout,
                toolbar,R.string.drawer_open,R.string.drawe_close);
        drawerToggle.setDrawerIndicatorEnabled(false);
        drawerToggle.setToolbarNavigationClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });
        drawerToggle.setHomeAsUpIndicator(R.drawable.ic_drawer);
        NextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(postyourjobActivity.this,"Job posted",Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void closeDrawer() {
        drawerLayout.closeDrawer(GravityCompat.START);
    }
    private void openDrawer(){
        drawerLayout.openDrawer(GravityCompat.START);
    }

    @Override
    public void onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.START))
        {
            closeDrawer();
        }
        super.onBackPressed();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return false;
    }
}