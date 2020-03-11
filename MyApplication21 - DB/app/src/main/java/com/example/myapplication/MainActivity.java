package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText shubhamsInput;
    TextView shubhamsText;
    MyDBHandler dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        shubhamsInput = (EditText) findViewById(R.id.shubhamsInput);
        shubhamsText = (TextView) findViewById(R.id.shubhamsText);
        dbHandler = new MyDBHandler(this,null,null,1);
        printDatabase();
    }

    public void addButtonClicked(View view){
        Products product = new Products (shubhamsInput.getText().toString());
        dbHandler.addProduct(product);
        printDatabase();
    }

    public void deleteButtonClicked(View view){
        String inputText = shubhamsInput.getText().toString();
        dbHandler.deleteProduct(inputText);
        printDatabase();
    }

    public void printDatabase(){
        String dbString = dbHandler.databaseToString();
        shubhamsText.setText(dbString);
        //shubhamInput.setText("");
        shubhamsInput.getText().clear();
    }
}
