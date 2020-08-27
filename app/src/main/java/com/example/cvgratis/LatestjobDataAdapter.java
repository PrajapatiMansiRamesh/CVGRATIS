package com.example.cvgratis;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LatestjobDataAdapter extends RecyclerView.Adapter<LatestjobDataAdapter.ViewHolder> {
    private ArrayList<AndroidVersion> android;
    private Context context;
    public LatestjobDataAdapter(Context context, ArrayList<AndroidVersion> android) {
        this.android = android;
        this.context = context;
    }
    @NonNull
    @Override

    public LatestjobDataAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.latestjob_recyclerlayout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LatestjobDataAdapter.ViewHolder holder, int position) {
        holder.tv_designation.setText(android.get(position).getAndroid_version_name());
    }

    @Override
    public int getItemCount() {
        return android.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tv_designation;
        public ViewHolder(View view) {
            super(view);
            tv_designation = (TextView)view.findViewById(R.id.designation);

        }
    }
}
