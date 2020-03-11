package com.example.myapplication13_intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent i = new Intent(this,MyService.class);
        startService(i);

        Bundle appleData = getIntent().getExtras();
        if(appleData==null)
            return;

        String appleMessage = appleData.getString("redAppleMsg");
        final TextView greenAppleText = (TextView) findViewById(R.id.textView);
        greenAppleText.setText(appleMessage);
    }

    public void onClick(View view){

        Intent i = new Intent(this,Main2Activity.class);
        startActivity(i);
    }
}
