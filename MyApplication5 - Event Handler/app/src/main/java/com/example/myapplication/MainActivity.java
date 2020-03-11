package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button shubhamsButton = (Button) findViewById(R.id.shubhamsButton);

        shubhamsButton.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView shubhamsText = (TextView) findViewById(R.id.shubhamsText);
                        shubhamsText.setText("World");
            }
        }
        );

        shubhamsButton.setOnLongClickListener(
                new Button.OnLongClickListener(){
                    public boolean onLongClick(View v){
                        TextView shubhamsText = (TextView) findViewById(R.id.shubhamsText);
                        shubhamsText.setText("Long Click!");
                        return false;
                    }
                }
        );
    }
}
