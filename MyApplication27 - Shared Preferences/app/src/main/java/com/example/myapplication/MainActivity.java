package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText usernameInput;
    EditText passwordInput;
    TextView shubhamsText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameInput = (EditText) findViewById(R.id.usernameInput);
        passwordInput = (EditText) findViewById(R.id.passwordInput);
        shubhamsText = (TextView) findViewById(R.id.shubhamsView);
    }

    public void saveInfo(View view){
        SharedPreferences sharedPreferences = getSharedPreferences("userInfo", Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("username",usernameInput.getText().toString());
        editor.putString("password",passwordInput.getText().toString());
        editor.apply();

        Toast.makeText(this,"Saved!",Toast.LENGTH_LONG).show();
    }

    public void showInfo(View view){
        SharedPreferences sharedPreferences = getSharedPreferences("userInfo",Context.MODE_PRIVATE);

        String name = sharedPreferences.getString("username","");
        String password = sharedPreferences.getString("password","");
        shubhamsText.setText(name + " " + password);
    }
}
