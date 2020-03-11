package com.example.myapplication6_gestures;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GestureDetectorCompat;

import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener,
GestureDetector.OnDoubleTapListener{

    private TextView shubhamsText;
    private GestureDetectorCompat gestureDetector;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        shubhamsText = (TextView) findViewById(R.id.shubhamText);
        this.gestureDetector = new GestureDetectorCompat(this,this);
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        shubhamsText.setText("onSingleTapConfirmed");
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        shubhamsText.setText("onDoubleTap");
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        shubhamsText.setText("onDoubleTapEvent");
        return true;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        shubhamsText.setText("onDown");
        return true;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        shubhamsText.setText("onShowPress");
    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        shubhamsText.setText("onSingleTapUp");
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        shubhamsText.setText("onScroll");
        return true;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        shubhamsText.setText("onLongPress");
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        shubhamsText.setText("onFling");
        return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.gestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }
}
