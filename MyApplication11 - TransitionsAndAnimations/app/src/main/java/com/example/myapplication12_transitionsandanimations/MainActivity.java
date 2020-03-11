package com.example.myapplication12_transitionsandanimations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    ViewGroup shubhamsLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        shubhamsLayout = (ViewGroup) findViewById(R.id.shubhamsLayout);

        shubhamsLayout.setOnTouchListener (
            new RelativeLayout.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    moveButton();
                    return true;
                }
            }
            );


    }

    private void moveButton() {
        View shubhamsButton = (View) findViewById(R.id.button);

        TransitionManager.beginDelayedTransition(shubhamsLayout);

        RelativeLayout.LayoutParams positionRules = new RelativeLayout.LayoutParams(
                shubhamsLayout.getLayoutParams());
        positionRules.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM, RelativeLayout.TRUE);
        positionRules.addRule(RelativeLayout.ALIGN_PARENT_RIGHT, RelativeLayout.TRUE);
//        positionRules.setMargins(300,500,0,0);
        shubhamsButton.setLayoutParams(positionRules);

        ViewGroup.LayoutParams sizeRules = shubhamsLayout.getLayoutParams();
        sizeRules.width=450;
        sizeRules.height=300;
        shubhamsButton.setLayoutParams(sizeRules);
    }
}
