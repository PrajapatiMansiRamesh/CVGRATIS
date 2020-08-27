package com.example.cvgratis;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Cvpreview extends AppCompatActivity {
    Dialog saveDialog;
    RadioGroup selectedtype;
    String current_cv=null;
    Button submitcv,save;
    TextView type1,type2,type3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cvpreview);
        save=findViewById(R.id.savetodevice);

        saveDialog=new Dialog(this);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveDialog.setContentView(R.layout.saveas_dialog);
                type1=saveDialog.findViewById(R.id.sjpg_text);
                type2=saveDialog.findViewById(R.id.cmykjpg_text);
                type3=saveDialog.findViewById(R.id.pdf_text);
                selectedtype=saveDialog.findViewById(R.id.selectedsave);
                type1.setText("Regular image with JPG format,\n" +
                        "medium size with good quality image.");
                type2.setText("For printing requirments,high\n" +
                        "fidelity image.");
                type3.setText("Compressed document for online job\n" +
                        "applications.");
                selectedtype.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int radioButtonID) {
                        switch (radioButtonID)
                        {
                            case R.id.sjpg:
                                current_cv="STANDARD JPG";
//                                do something
                                break;
                            case R.id.cmykjpg:
                                current_cv="CMYK JPG";
                                //                                do something
                                break;
                            case R.id.pdf:
                                current_cv="PDF";
                                //                                do something
                                break;
                        }
                    }
                });
                submitcv=saveDialog.findViewById(R.id.savecv);
                submitcv.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(selectedtype.getCheckedRadioButtonId()== -1 || current_cv==null)
                        {
                            saveDialog.dismiss();
                            Toast.makeText(Cvpreview.this,"Please Select Save Type.",Toast.LENGTH_SHORT).show();
                        }
                        else
                        {
//                            do something
                            Intent rating_intent = new Intent(Cvpreview.this, giverating.class);
                            startActivity(rating_intent);
                            saveDialog.dismiss();
                        }
                    }
                });
                saveDialog.show();
            }
        });
    }
}