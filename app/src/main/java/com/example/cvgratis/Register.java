package com.example.cvgratis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.hbb20.CountryCodePicker;

import java.util.Calendar;

public class Register extends AppCompatActivity {
private EditText phoneNumber,birthDate,gender;
private DatePickerDialog.OnDateSetListener datesatlistener;
CountryCodePicker ccp;
Dialog genderDialog;
RadioGroup selectedgender;
Button submitgender,registerbtn;
String current_gender=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        setSupportActionBar((Toolbar)findViewById(R.id.register_toolbar));
        phoneNumber=findViewById(R.id.phonenumber);
        birthDate=findViewById(R.id.birthdate);
        gender=findViewById(R.id.gender);
        ccp=(CountryCodePicker)findViewById(R.id.countrycode);
        ccp.registerCarrierNumberEditText(phoneNumber);
        registerbtn=findViewById(R.id.registerbtn);
        genderDialog=new Dialog(this);

        gender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                genderDialog.setContentView(R.layout.gender_dialog);
                selectedgender=genderDialog.findViewById(R.id.selectedgender);
                selectedgender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int radioButtonID) {
                        switch (radioButtonID)
                        {
                            case R.id.male:
                                current_gender="MALE";break;
                            case R.id.female:
                                current_gender="FEMALE";break;
                        }
                    }
                });
                submitgender=genderDialog.findViewById(R.id.gender);
                submitgender.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(selectedgender.getCheckedRadioButtonId()== -1 || current_gender==null)
                        {
                            genderDialog.dismiss();
                            Toast.makeText(Register.this,"Please Select Gender.",Toast.LENGTH_SHORT).show();
                        }
                        else
                        {
                            gender.setText(current_gender);
                            genderDialog.dismiss();
                        }
                    }
                });
                genderDialog.show();
            }
        });

        birthDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar cal=Calendar.getInstance();
                int year=cal.get(Calendar.YEAR);
                int month=cal.get(Calendar.MONTH);
                int day=cal.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog=new DatePickerDialog(
                        Register.this,android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                        datesatlistener,year,month,day);
                TextView tv = new TextView(Register.this);

                // Create a TextView programmatically
                RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(
                        RelativeLayout.LayoutParams.WRAP_CONTENT, // Width of TextView
                        RelativeLayout.LayoutParams.WRAP_CONTENT); // Height of TextView
                tv.setLayoutParams(lp);
                tv.setPadding(10, 10, 10, 10);
                tv.setGravity(Gravity.CENTER);
                tv.setTextSize(TypedValue.COMPLEX_UNIT_DIP,20);
                tv.setTypeface(null, Typeface.BOLD);
                tv.setText("BIRTHDAY");
                tv.setTextColor(Color.parseColor("#000000"));
                tv.setBackgroundColor(Color.parseColor("#A9A9A9"));
//                dialog.setTitle("BIRTHDAY");
                dialog.setCustomTitle(tv);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
                dialog.getButton(DatePickerDialog.BUTTON_POSITIVE).setTextColor(Color.WHITE);
                dialog.getButton(DatePickerDialog.BUTTON_POSITIVE).setBackgroundColor(ContextCompat.getColor(Register.this, R.color.blue));
                dialog.getButton(DatePickerDialog.BUTTON_NEGATIVE).setTextColor(Color.WHITE);
                dialog.getButton(DatePickerDialog.BUTTON_NEGATIVE).setBackgroundColor(ContextCompat.getColor(Register.this, R.color.blue));
            }
        });
        datesatlistener=new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int day) {
             month=month+1;
             String birthday=day+" - "+month+" - "+year;
             birthDate.setText(birthday);
            }
        };

        registerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login_intent = new Intent(Register.this, Login.class);
                startActivity(login_intent);
            }
        });
    }
}