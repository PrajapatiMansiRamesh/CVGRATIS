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

public class contactsinfo extends AppCompatActivity {
    private EditText SM;
    Dialog SMDialog;
    RadioGroup selectedmedia;
    String current_status=null;
    Button submitmedia,next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactsinfo);

        SM=findViewById(R.id.socialmedia);
        next=findViewById(R.id.nextbtn);
        SMDialog=new Dialog(this);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent contacts_intent = new Intent(contactsinfo.this, educationdetails.class);
                startActivity(contacts_intent);
            }
        });
        SM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SMDialog.setContentView(R.layout.socialmedia_dialog);
                selectedmedia=SMDialog.findViewById(R.id.selectedsm);
                selectedmedia.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int radioButtonID) {
                        switch (radioButtonID)
                        {
                            case R.id.instagram:
                                current_status="Instagram";break;
                            case R.id.facebook:
                                current_status="Facebook";break;
                            case R.id.linkedin:
                                current_status="Linkedin";break;
                            case R.id.twitter:
                                current_status="Twitter";break;
                        }
                    }
                });
                submitmedia=SMDialog.findViewById(R.id.social);
                submitmedia.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(selectedmedia.getCheckedRadioButtonId()== -1 || current_status==null)
                        {
                            SMDialog.dismiss();
                            Toast.makeText(contactsinfo.this,"Please Select Social Media.",Toast.LENGTH_SHORT).show();
                        }
                        else
                        {
                            SM.setText(current_status);
                            SMDialog.dismiss();
                        }
                    }
                });
                SMDialog.show();
            }
        });
    }
}