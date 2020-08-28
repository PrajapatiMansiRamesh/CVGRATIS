package com.example.cvgratis;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class TermsofuseFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_termsofuse,container,false);
        TextView tou=(TextView)v.findViewById(R.id.tou);
        tou.setText("Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat.\n" +
                "Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper\n" +
                "suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel\n" +
                "eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel\n" +
                "illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio\n" +
                "dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te\n" +
                "feugait nulla facilisi.\n" +
                "Lorem ipsum dolor sit amet, cons ectetuer adipiscing elit, sed diam\n" +
                "nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat\n" +
                "volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.\n" +
                "Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat.\n" +
                "Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper\n" +
                "suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel\n" +
                "eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel\n" +
                "illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio\n" +
                "dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te\n" +
                "feugait nulla facilisi.\n" +
                "Lorem ipsum dolor sit amet, cons ectetuer adipiscing elit, sed diam\n" +
                "nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat\n" +
                "volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.\n" +
                "Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat.\n" +
                "Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper\n" +
                "suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel\n" +
                "eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel\n" +
                "illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio\n" +
                "dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te\n" +
                "feugait nulla facilisi.\n" +
                "Lorem ipsum dolor sit amet, cons ectetuer adipiscing elit, sed diam\n" +
                "nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat\n" +
                "volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.\n" +
                "Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat.\n" +
                "Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper\n" +
                "suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel\n" +
                "eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel\n" +
                "illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio\n" +
                "dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te\n" +
                "feugait nulla facilisi.\n" +
                "Lorem ipsum dolor sit amet, cons ectetuer adipiscing elit, sed diam\n" +
                "nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat\n" +
                "volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcor\n");
        return v;
    }
}
