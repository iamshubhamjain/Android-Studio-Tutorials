package com.example.myapplication_7challengeeventsandgesturescombined;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.GestureDetectorCompat;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener,
        GestureDetector.OnDoubleTapListener {

    private TextView shubhamsText;
    private GestureDetectorCompat gestureDetector;
    private View shubhamsLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button shubhamsButton = (Button) findViewById(R.id.shubhamButton);

        //Layout shubhamsLayout = (Layout) findViewById(R.id.shubhamsLayout);
        //LayoutInflater inflater = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //View view = inflater.inflate(R.layout.activity_main, null);

         shubhamsLayout= (View ) findViewById(R.id.shubhamsLayout);

        shubhamsButton.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        shubhamsText=(TextView) findViewById(R.id.shubhamsText);
                        shubhamsText.setText("Event : Click");
                        shubhamsLayout.setBackgroundColor(Color.RED);
                    }
                }
        );

        shubhamsButton.setOnLongClickListener(
                new Button.OnLongClickListener(){
                    public boolean onLongClick(View v){
                        shubhamsText=(TextView) findViewById(R.id.shubhamsText);
                        shubhamsText.setText("Event : Long Click");
                        shubhamsLayout.setBackgroundColor(Color.RED);
                        return true;
                    }
                }
        );

        shubhamsText=(TextView) findViewById(R.id.shubhamsText);
        this.gestureDetector=new GestureDetectorCompat(this,this);
        gestureDetector.setOnDoubleTapListener(this);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.gestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        shubhamsText.setText("Gesture : onSingleTapConfirmed");
        shubhamsLayout.setBackgroundColor(Color.WHITE);
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        shubhamsText.setText("Gesture : onDoubleTap");
        shubhamsLayout.setBackgroundColor(Color.WHITE);
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        shubhamsText.setText("Gesture : onDoubleTapEvent");
        shubhamsLayout.setBackgroundColor(Color.WHITE);
        return true;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        shubhamsText.setText("Gesture : onDown");
        shubhamsLayout.setBackgroundColor(Color.WHITE);
        return true;
    }

    @Override
    public void onShowPress(MotionEvent e) {

        shubhamsText.setText("Gesture : onShowPress");
        shubhamsLayout.setBackgroundColor(Color.WHITE);
    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        shubhamsText.setText("Gesture : onSingleTapUp");
        shubhamsLayout.setBackgroundColor(Color.WHITE);
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        shubhamsText.setText("Gesture : onScroll");
        shubhamsLayout.setBackgroundColor(Color.WHITE);
        return true;
    }

    @Override
    public void onLongPress(MotionEvent e) {

        shubhamsText.setText("Gesture : onLongPress");
        shubhamsLayout.setBackgroundColor(Color.WHITE);
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        shubhamsText.setText("Gesture : onFling");
        shubhamsLayout.setBackgroundColor(Color.WHITE);
        return true;
    }
}
