package com.example.rutinafitnn.tabbet;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.rutinafitnn.Biceps_ejercicios;
import com.example.rutinafitnn.Main5Activity;
import com.example.rutinafitnn.R;
import com.example.rutinafitnn.pecho.Main65Activity;
import com.example.rutinafitnn.pecho.Main66Activity;
import com.example.rutinafitnn.pecho.Main67Activity;


public class BlankFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_blank, container, false);
        {
            ImageButton imageButton2=(ImageButton)view.findViewById(R.id.pecho3);
            imageButton2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent in=new Intent(getActivity(), Main67Activity.class);
                    in.putExtra("some","some data");
                    startActivity(in);
                }
            });
        }
        {
            ImageButton imageButton1=(ImageButton)view.findViewById(R.id.pecho2);
            imageButton1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent in=new Intent(getActivity(), Main66Activity.class);
                    in.putExtra("some","some data");
                    startActivity(in);
                }
            });
        }
        ImageButton imageButton=(ImageButton) view.findViewById(R.id.pecho1);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(getActivity(),Main65Activity.class);
                in.putExtra("some","some data");
                startActivity(in);
            }
        });
        return view;
    }



}
