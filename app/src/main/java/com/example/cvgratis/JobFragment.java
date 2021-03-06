package com.example.cvgratis;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class JobFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment_jobs,container,false);
        TabLayout tabLayout=(TabLayout)v.findViewById(R.id.Tabjob);
        TabItem latestjobtab=(TabItem)v.findViewById(R.id.tab_latestjob);
        TabItem myposttab=(TabItem)v.findViewById(R.id.tab_mypost);
        ExtendedFloatingActionButton jobfab=(ExtendedFloatingActionButton)v.findViewById(R.id.jobFab);
        final ViewPager viewPager=(ViewPager)v.findViewById(R.id.viewPager);

        jobfab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), postyourjobActivity.class);
                startActivity(intent);
            }
        });

        JobPagerAdapter jobpagerAdapter=new JobPagerAdapter(getChildFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(jobpagerAdapter);

        tabLayout.addOnTabSelectedListener(new TabLayout.BaseOnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        return v;
    }

}

