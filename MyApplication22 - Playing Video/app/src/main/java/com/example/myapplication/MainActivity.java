package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final VideoView shubhamsVideoView = (VideoView) findViewById(R.id.shubhamsVideoView);
        shubhamsVideoView.setVideoPath("https://www.youtube.com/watch?v=XvUSsh3gdO4");

//        MediaController mediaController = new MediaController(this);
//        mediaController.setAnchorView(shubhamsVideoView);
//        shubhamsVideoView.setMediaController(mediaController);

        shubhamsVideoView.start();
    }
}
