package com.guptaamey.quizapp;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.graphics.Color;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity {
    Button nameButton;
    Button colorButton;
    EditText nameText;
    EditText colorText;
    TextView displayText;
    ConstraintLayout currentLayout;

    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        currentLayout = findViewById(R.id.Layout);
        displayText = findViewById(R.id.textBox);

        nameText = findViewById(R.id.responseEditText);
        nameButton = findViewById(R.id.clickButton);

        colorText = findViewById(R.id.response2EditText);
        colorButton = findViewById(R.id.clickButton2);


        nameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Name", nameText.getText().toString());
                count += 1;
                String s = "Hi, " + nameText.getText() + "! Count = " + count;
                displayText.setText(s);
            }
        });

        colorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Color", colorText.getText().toString());
                String colorVal = colorText.getText() + "";

                if (colorVal.equals("BLACK")) {
                    colorButton.setBackgroundColor(Color.BLACK);
                    nameButton.setBackgroundColor(Color.BLACK);
                }
                if (colorVal.equals("WHITE")){
                    colorButton.setBackgroundColor(Color.WHITE);
                    nameButton.setBackgroundColor(Color.WHITE);
                }
                if (colorVal.equals("BLUE")){
                    colorButton.setBackgroundColor(Color.BLUE);
                    nameButton.setBackgroundColor(Color.BLUE);
                }
                if (colorVal.equals("RED")){
                    colorButton.setBackgroundColor(Color.RED);
                    nameButton.setBackgroundColor(Color.RED);
                }
                if (colorVal.equals("GREEN")){
                    colorButton.setBackgroundColor(Color.GREEN);
                    nameButton.setBackgroundColor(Color.GREEN);
                }
                if (colorVal.equals("YELLOW")){
                    colorButton.setBackgroundColor(Color.YELLOW);
                    nameButton.setBackgroundColor(Color.YELLOW);
                }
                
            }
        });
    }
}