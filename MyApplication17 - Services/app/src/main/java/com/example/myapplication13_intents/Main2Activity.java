package com.example.myapplication13_intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void onClick(View view){
        Intent i = new Intent(this,MainActivity.class);
        final EditText input = (EditText) findViewById(R.id.editText);

        String msg = input.getText().toString();
        i.putExtra("redAppleMsg",msg);
        startActivity(i);
    }
}
