package com.example.cvgratis;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import static android.content.Context.LAYOUT_INFLATER_SERVICE;

public class RatingFragment extends Fragment {
    int [] images={R.drawable.template_icon,R.drawable.template_icon,R.drawable.template_icon};
    String [] cv_title={"CV-0001","CV-0002","CV-0003"};
    public RatingFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         View v=inflater.inflate(R.layout.fragment_rating, container, false);
        GridView GV=(GridView)v.findViewById(R.id.gridView);
        CustomAdapter customAdapter=new CustomAdapter(images,cv_title,getContext());
        GV.setAdapter(customAdapter);
        return v;
    }

    public class CustomAdapter extends BaseAdapter {
        private int [] imagePhoto;
        private String [] cvName;
        private Context context;
        private LayoutInflater layoutInflater;

        public CustomAdapter(int[] imagePhoto,String [] cvName, Context context) {
            this.imagePhoto = imagePhoto;
            this.cvName=cvName;
            this.context = context;
            this.layoutInflater=(LayoutInflater)context.getSystemService(LAYOUT_INFLATER_SERVICE);
        }

        @Override
        public int getCount() {
            return imagePhoto.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View view, ViewGroup parent) {
            if(view==null)
            {
                view=layoutInflater.inflate(R.layout.rating_grid,parent,false);
            }

            ImageView imageView=view.findViewById(R.id.templateIcon);
            TextView templateName=(TextView)view.findViewById(R.id.cvname);

            imageView.setImageResource(imagePhoto[position]);
            templateName.setText(cvName[position]);
            return view;
        }
    }
}