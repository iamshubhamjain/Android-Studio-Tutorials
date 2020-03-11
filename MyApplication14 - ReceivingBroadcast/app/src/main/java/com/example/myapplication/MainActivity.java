package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.IntentFilter;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ReceiveBroadcast receiver = new ReceiveBroadcast(); //class name is BroadcastReceiver in the video
        IntentFilter filter = new IntentFilter();
        filter.addAction("com.thenewboston.sendbroadcast"); // filtering the intent for expected broadcast message.
        registerReceiver(receiver, filter); // initialize the received with filter.

    }
}
