package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CustomAdapter extends ArrayAdapter<String> {


    public CustomAdapter(@NonNull Context context, String[] foods) {
        super(context, R.layout.custom_row, foods);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater shubhamsInflater = LayoutInflater.from(getContext());
        View customView = shubhamsInflater.inflate(R.layout.custom_row,parent,false);

        String singleFoodItem = getItem(position);
        TextView shubhamsText = (TextView) customView.findViewById(R.id.shubhamsText);
        ImageView shubhamsImage = (ImageView) customView.findViewById(R.id.shubhamsImage);

        shubhamsText.setText((singleFoodItem));
        shubhamsImage.setImageResource(R.mipmap.images);
        return customView;
    }
}
