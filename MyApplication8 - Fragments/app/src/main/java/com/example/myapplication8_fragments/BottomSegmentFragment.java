package com.example.myapplication8_fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class BottomSegmentFragment extends Fragment {

    private  static TextView topText;
    private  static TextView bottomText;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_segment_fragment,container,false);

        topText = (TextView) view.findViewById(R.id.topText);
        bottomText =(TextView) view.findViewById(R.id.bottomText);

        return view;
    }

    public void setMemeText(String top, String bottom){
        topText.setText(top);
        bottomText.setText(bottom);
    }
}
