package com.example.cvgratis;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DashboardFragment extends Fragment {
    RecyclerView recyclerView;
    ArrayList arrayList;

    private final String android_version_names[] = {
            "CV-0001",
            "CV-0002",
            "CV-0001",
            "CV-0002",
            "CV-0001",
            "CV-0002",
            "CV-0001",
            "CV-0002",
            "CV-0001",
            "CV-0002"
    };

    private final Integer android_image_urls[] = {
            R.drawable.template_icon,
            R.drawable.template_icon,
            R.drawable.template_icon,
            R.drawable.template_icon,
            R.drawable.template_icon,
            R.drawable.template_icon,
            R.drawable.template_icon,
            R.drawable.template_icon,
            R.drawable.template_icon,
            R.drawable.template_icon

    };

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_dashboard,container,false);
        initViews(v);
        return v;
    }

    private void initViews(View v){
        RecyclerView recyclerView = (RecyclerView)v.findViewById(R.id.card_recycler_view);
        recyclerView.setHasFixedSize(true);
        GridLayoutManager layoutManager = new GridLayoutManager(getContext(),2);
        recyclerView.setLayoutManager(layoutManager);
        ArrayList<AndroidVersion> androidVersions = prepareData();
        DataAdapter adapter = new DataAdapter(getContext(),androidVersions);
        recyclerView.setAdapter(adapter);

        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(getContext(),
                recyclerView, new RecyclerTouchListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {
//                Toast.makeText(Cvtemplate.this,"Item Clicked",Toast.LENGTH_SHORT).show();
                Intent login_intent = new Intent(getContext(), selectphoto.class);
                startActivity(login_intent);
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));

    }

    private ArrayList<AndroidVersion> prepareData(){

        ArrayList<AndroidVersion> android_version = new ArrayList<>();
        for(int i=0;i<android_version_names.length;i++){
            AndroidVersion androidVersion = new AndroidVersion();
            androidVersion.setAndroid_version_name(android_version_names[i]);
            androidVersion.setAndroid_image_url(android_image_urls[i]);
            android_version.add(androidVersion);
        }
        return android_version;
    }
}
