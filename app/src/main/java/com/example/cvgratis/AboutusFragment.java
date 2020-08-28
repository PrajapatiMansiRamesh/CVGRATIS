package com.example.cvgratis;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class AboutusFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment_aboutus,container,false);
        TextView aboutus1=(TextView)v.findViewById(R.id.aboutus1);
        TextView aboutus2=(TextView)v.findViewById(R.id.aboutus2);
        TextView aboutus3=(TextView)v.findViewById(R.id.aboutus3);
        TextView aboutus4=(TextView)v.findViewById(R.id.aboutus4);
        TextView aboutus5=(TextView)v.findViewById(R.id.aboutus5);

        aboutus1.setText("CV Gratis Indonesia, atau dikenal sebagai CVGratis dot id\n" +
                "merupakan penyedia layanan pembuatan CV yang pada\n" +
                "awalnya telah berkiprah di instagram sejak 2019.");
        aboutus2.setText("CV Gratis Indonesia berada dibawah naungan sebuah\n" +
                "layanan desain digital yaitu Cafe Visual, dimana\n" +
                "telah berdiri sejak 2014 hingga saat ini.");
        aboutus3.setText("Cafe Visual didirikan oleh sekelompok alumni kelas\n" +
                "desain grafis angkatan 2012 - 2013 dari kampus ternama\n" +
                "yaitu Wearnes Education Center Malang, yang kemudian\n" +
                "semua personilnya menjalankan bisnis sebagai freelancer.");
        aboutus4.setText("Setelah mendapatkan banyak sekali project, baik dari dalam\n" +
                "maupun luar negeri, akhirnya seluruh personil disibukkan\n" +
                "oleh project masing-masing. Namun hingga saat ini\n" +
                "Cafe Visual kembali dengan mengusung sebuah\n" +
                "karya bernama CV Gratis Indonesia.");
        aboutus5.setText("CV Gratis Indonesia memiliki misi untuk meningkatkan\n" +
                "kualitas personal branding pada pencari kerja\n" +
                "di seluruh Indonesia, yaitu dengan kemudahan\n" +
                "membuat CV yang menarik serta berkualitas\n" +
                "untuk meningkatkan potensi diterima bekerja.");

                return v;
    }
}
