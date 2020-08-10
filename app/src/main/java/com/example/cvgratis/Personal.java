package com.example.cvgratis;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Personal extends AppCompatActivity {
    private EditText MS;
    Dialog MSDialog;
    RadioGroup selectedstatus;
    String current_status=null;
    Button submitstatus,next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal);
        MS=findViewById(R.id.meritalstatus);
        next=findViewById(R.id.nextbtn);
        MSDialog=new Dialog(this);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent contacts_intent = new Intent(Personal.this, contactsinfo.class);
                startActivity(contacts_intent);
            }
        });
        MS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MSDialog.setContentView(R.layout.meritalstatus_dialog);
                selectedstatus=MSDialog.findViewById(R.id.selectedstatus);
                selectedstatus.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int radioButtonID) {
                        switch (radioButtonID)
                        {
                            case R.id.single:
                                current_status="Single";break;
                            case R.id.married:
                                current_status="Married";break;
                            case R.id.engaged:
                                current_status="Engaged";break;
                        }
                    }
                });
                submitstatus=MSDialog.findViewById(R.id.merital);
                submitstatus.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(selectedstatus.getCheckedRadioButtonId()== -1 || current_status==null)
                        {
                            MSDialog.dismiss();
                            Toast.makeText(Personal.this,"Please Select Merital Status.",Toast.LENGTH_SHORT).show();
                        }
                        else
                        {
                            MS.setText(current_status);
                            MSDialog.dismiss();
                        }
                    }
                });
                MSDialog.show();
            }
        });
    }
}