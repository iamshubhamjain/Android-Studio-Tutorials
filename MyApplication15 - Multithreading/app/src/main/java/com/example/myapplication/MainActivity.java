package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Handler shubhamTextHandler = new Handler(){
        @Override
        public void handleMessage(@NonNull Message msg) {

            TextView shubhamsText = (TextView) findViewById(R.id.shubhamText);
            shubhamsText.setText("Nice Job!");
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void shubhamsButtonOnClick(View view){

        Runnable r = new Runnable() {
            @Override
            public void run() {
                long futureTime = System.currentTimeMillis() + 10000;
                while(System.currentTimeMillis()<futureTime) {
                    synchronized (this) {
                        try {
                            wait(futureTime - System.currentTimeMillis());

                        } catch (Exception e) {
                        }
                    }
                }
                shubhamTextHandler.sendEmptyMessage(0);
            }
        };

        Thread shubhamThread = new Thread(r);
        shubhamThread.start();

    }
}
