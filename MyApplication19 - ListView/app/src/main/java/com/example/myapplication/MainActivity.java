package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] foods = {"Brownie", "Karachi Bakery Fruit Biscuits", "Ghewar", "Pista Lodge", "Peda", "Dry Fruit Laddu", "Chocolate Dry Fruit Bar", "Imarti", "Jalebi", "Rabri Falooda", "Motichoor Laddu", " Pyaax Kachori","Matar Samosa", "Samosa", "Gujiya"};
        ListAdapter shubhamsAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,foods);
        ListView shubhamsListView = (ListView) findViewById(R.id.shubhamsListView);
        shubhamsListView.setAdapter(shubhamsAdapter);

        shubhamsListView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String food = String.valueOf(parent.getItemAtPosition(position));
                        Toast.makeText(MainActivity.this,food,Toast.LENGTH_LONG).show();
                    }
                }
        );
    }
}
