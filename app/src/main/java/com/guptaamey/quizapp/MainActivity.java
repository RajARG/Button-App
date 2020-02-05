package com.guptaamey.quizapp;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.graphics.Color;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button submitButton;
    Button colorButton;
    EditText nameText;
    TextView displayText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submitButton = findViewById(R.id.clickButton);
        colorButton = findViewById(R.id.clickButton2);
        nameText = findViewById(R.id.responseEditText);
        colorText = findViewById(R.id.response2EditText);
        displayText = findViewById(R.id.textBox);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Test Button1", nameText.getText().toString());
                String s = displayText.getText()+" "+ nameText.getText();
                displayText.setText(s);
            }
        });

        colorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Test Button2", nameText.getText().toString());
                String colorVal = colorText.get
                colorButton.setTextColor(Color.parseColor(Color.blue));
            }
        });

        nameText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(!hasFocus){
                    if(nameText.getText().toString().equals("TJ")){
                        displayText.setText("TJ Rocks!");
                        nameText.setText("");
                        nameText.setHint("That's a good name.");
                    }
                }
            }
        });

    }
}