package com.example.cvgratis;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class LatestjobFragment extends Fragment {
    RecyclerView recyclerView;
    ArrayList arrayList;

    private final String dasignation_list[] = {
            "WEB DEVELOPER","GRAPHIC DESIGNER","ACCOUNTING STAFF","DRIVER","WEB DEVELOPER","STORE MANAGER","WEB DEVELOPER","DRIVER"
    };

    public LatestjobFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_latestjob, container, false);
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