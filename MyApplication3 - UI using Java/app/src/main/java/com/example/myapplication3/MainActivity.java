package com.example.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.content.res.Resources;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        RelativeLayout shubhamLayout = new RelativeLayout(this);
        shubhamLayout.setBackgroundColor(Color.GREEN);

        Button redButton = new Button(this);
        redButton.setId(1);
        redButton.setText("Click Me!");
        redButton.setBackgroundColor(Color.RED);

        RelativeLayout.LayoutParams buttonDetails = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        buttonDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        buttonDetails.addRule(RelativeLayout.CENTER_VERTICAL);

        EditText userName = new EditText(this);
        userName.setId(2);

        RelativeLayout.LayoutParams userNameDetails = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        userNameDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        userNameDetails.addRule(RelativeLayout.ABOVE,redButton.getId());
        userNameDetails.setMargins(0,0,0,50);

        Resources r = getResources();
        int px=(int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,200,
                r.getDisplayMetrics());

        userName.setWidth(px);

        shubhamLayout.addView(redButton,buttonDetails);
        shubhamLayout.addView(userName,userNameDetails);

        setContentView(shubhamLayout);
    }
}
