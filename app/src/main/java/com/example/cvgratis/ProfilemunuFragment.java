package com.example.cvgratis;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import static android.content.Context.LAYOUT_INFLATER_SERVICE;

public class ProfilemunuFragment extends Fragment {
    String current_action=null;
    int [] images={R.drawable.ic_setting,R.drawable.ic_heart,R.drawable.pro,R.drawable.ic_notification,R.drawable.ic_send,R.drawable.logoicon
            ,R.drawable.ic_description,R.drawable.ic_contactus};
    String [] profile_name={"Account Settings","Liked Templates","Upgrade Accounts","Notifications","Invite Friends","About Us","Term of use","Contact Us"};

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_profilemune,container,false);
        GridView GV=(GridView)v.findViewById(R.id.gridView);
        GV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = ((TextView)view.findViewById(R.id.profile_name)).getText().toString();
//                Toast.makeText(getContext(), "" + item, Toast.LENGTH_SHORT).show();
                Fragment selectedFragment=null;
                switch (item){
                    case "Account Settings":
                        selectedFragment=new AccountsettingFragment();
                        break;
                    case "Liked Templates":
                        selectedFragment=new LikedtemplateFragment();
                        break;
                    case "Upgrade Accounts":
                        selectedFragment=new JobFragment();
                        break;
                    case "Notifications":
                        selectedFragment=new ProfileFragment();
                        break;
                    case "Invite Friends":
                        selectedFragment=new ProfileFragment();
                        break;
                    case "About Us":
                        selectedFragment=new AboutusFragment();
                        break;
                    case "Term of use":
                        selectedFragment=new TermsofuseFragment();
                        break;
                    case "Contact Us":
                        selectedFragment=new ContactusFragment();
                        break;
                }
                getFragmentManager().beginTransaction().replace(R.id.frame_container,selectedFragment).commit();
//                return true;
            }
        });

        CustomAdapter customAdapter=new CustomAdapter(images,profile_name,getContext());
        GV.setAdapter(customAdapter);
        return v;
    }

    public class CustomAdapter extends BaseAdapter {
        private int [] imagePhoto;
        private String [] profileName;
        private Context context;
        private LayoutInflater layoutInflater;

        public CustomAdapter(int[] imagePhoto,String [] profileName,Context context) {
            this.imagePhoto = imagePhoto;
            this.profileName=profileName;
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
                view=layoutInflater.inflate(R.layout.profile_grid,parent,false);
            }

            ImageView imageView=view.findViewById(R.id.profile_icon);
            TextView templateName=(TextView)view.findViewById(R.id.profile_name);

            imageView.setImageResource(imagePhoto[position]);
            templateName.setText(profileName[position]);
            return view;
        }
    }
}
