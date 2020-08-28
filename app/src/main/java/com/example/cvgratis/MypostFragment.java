package com.example.cvgratis;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class MypostFragment extends Fragment {
    RecyclerView recyclerView;
    ArrayList arrayList;
    String current_action=null;
    private final String dasignation_list[] = {
            "WEB DEVELOPER","GRAPHIC DESIGNER","ACCOUNTING STAFF"
    };
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_mypost, container, false);
        initViews(v);
        return v;
    }

    private void initViews(View v){
        RecyclerView recyclerView = (RecyclerView)v.findViewById(R.id.card_recycler_view);
        recyclerView.setHasFixedSize(true);
        GridLayoutManager layoutManager = new GridLayoutManager(getContext(),1);
        recyclerView.setLayoutManager(layoutManager);
        ArrayList<AndroidVersion> androidVersions = prepareData();
        LatestjobDataAdapter adapter = new LatestjobDataAdapter(getContext(),androidVersions);
        recyclerView.setAdapter(adapter);

        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(getContext(),
                recyclerView, new RecyclerTouchListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                String item = ((TextView)view.findViewById(R.id.designation)).getText().toString();
//                Toast.makeText(getContext(), "" + item, Toast.LENGTH_SHORT).show();
                final Dialog cvactionDialog = new Dialog(getContext());
                cvactionDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                cvactionDialog.setContentView(R.layout.cvaction_dialog);
                final TextView editaction=cvactionDialog.findViewById(R.id.edit);
                final TextView deleteaction=cvactionDialog.findViewById(R.id.delete);
                TextView cvname=cvactionDialog.findViewById(R.id.cvname);
                cvname.setText(item);
                editaction.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        current_action=editaction.getText().toString();
                        Toast.makeText(getContext(), "" + current_action, Toast.LENGTH_SHORT).show();
                        cvactionDialog.dismiss();
                    }
                });
                deleteaction.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        current_action=deleteaction.getText().toString();
                        Toast.makeText(getContext(), "" + current_action, Toast.LENGTH_SHORT).show();
                        cvactionDialog.dismiss();
                    }
                });
                cvactionDialog.show();
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));

    }

    private ArrayList<AndroidVersion> prepareData(){

        ArrayList<AndroidVersion> android_version = new ArrayList<>();
        for(int i=0;i<dasignation_list.length;i++){
            AndroidVersion androidVersion = new AndroidVersion();
            androidVersion.setAndroid_version_name(dasignation_list[i]);
            android_version.add(androidVersion);
        }
        return android_version;
    }
}