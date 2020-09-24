package com.example.cvgratis;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Switch;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class NotificationFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_notification, container, false);
        Switch s1=(Switch)v.findViewById(R.id.swtemplate);
        Switch s2=(Switch)v.findViewById(R.id.swglobal);
        Switch s3=(Switch)v.findViewById(R.id.swjobs);
        Switch s4=(Switch)v.findViewById(R.id.swrl);
        return v;
    }

}
