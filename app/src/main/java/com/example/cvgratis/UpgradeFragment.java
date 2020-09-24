package com.example.cvgratis;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class UpgradeFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_upgrade, container, false);
        dialog_popup();
        return v;
    }

    private void dialog_popup() {
        final Dialog updradDialog = new Dialog(getContext());
        updradDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        updradDialog.setContentView(R.layout.upgrade_dialog);
        final TextView data1=updradDialog.findViewById(R.id.dialogdata1);
        final TextView data2=updradDialog.findViewById(R.id.dialogdata2);
        data1.setText("Thank you for the PRO subscription,\n" +
                "enjoy the best features and our handpicked\n" +
                "templates for you, edit more templates\n" +
                "in a day, no ads and you can sell the generated CV\n" +
                "with Commercial License from CVGratis Indonesia.");
        data2.setText("Please note if this PRO Account is a yearly subscription\n" +
                "which means you have to subscribe every year\n" +
                "to get PRO Account still with you.\n");
        updradDialog.show();
    }



}
