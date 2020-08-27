package com.example.cvgratis;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import static android.content.Context.LAYOUT_INFLATER_SERVICE;


public class MyarchiveFragment extends Fragment {
    String current_action=null;
    int [] images={R.drawable.template_icon,R.drawable.template_icon,R.drawable.template_icon};
    String [] cv_title={"CV-0001","CV-0002","CV-0003"};
    String [] cv_date={"Last edited: 2 Juni 2020, 14:30","Last edited: 2 Juni 2020, 14:30","Last edited: 2 Juni 2020, 14:30"};

    public MyarchiveFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_myarchive, container, false);
        GridView GV=(GridView)v.findViewById(R.id.gridView);
        GV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = ((TextView)view.findViewById(R.id.template_name)).getText().toString();
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
        });
        TextView tv1=(TextView)v.findViewById(R.id.notice1);
        TextView tv2=(TextView)v.findViewById(R.id.notice2);
        TextView tv3=(TextView)v.findViewById(R.id.notice3);
        tv1.setText("As free user, <username> only allowed\n" +
                "to store the edited templates in one day.");
        tv2.setText("All templates in this archive will be deleted\n" +
                "completely within 00:00, and <username> need\n" +
                "to re-build from the beginning.");
        tv3.setText("Use PRO Account to get your template\n" +
                "stored forever and more templates\n" +
                "you can edit each day.");
        CustomAdapter customAdapter=new CustomAdapter(images,cv_title,cv_date,getContext());
        GV.setAdapter(customAdapter);
        return v;
    }

    public class CustomAdapter extends BaseAdapter{
        private int [] imagePhoto;
        private String [] cvName;
        private String [] cvDate;
        private Context context;
        private LayoutInflater layoutInflater;

        public CustomAdapter(int[] imagePhoto,String [] cvName,String [] cvDate, Context context) {
            this.imagePhoto = imagePhoto;
            this.cvName=cvName;
            this.cvDate=cvDate;
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
                view=layoutInflater.inflate(R.layout.archive_grid,parent,false);
            }

            ImageView imageView=view.findViewById(R.id.templateIcon);
            TextView templateName=(TextView)view.findViewById(R.id.template_name);
            TextView templateDate=(TextView)view.findViewById(R.id.template_date);

            imageView.setImageResource(imagePhoto[position]);
            templateName.setText(cvName[position]);
            templateDate.setText(cvDate[position]);
            return view;
        }
    }
}