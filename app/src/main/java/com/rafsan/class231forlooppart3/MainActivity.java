package com.rafsan.class231forlooppart3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editInitialValue,editTargetedValue,editInitialLeap,editTargetedLeap;
    Button buttonEvenOdd,buttonLeapYear;
    TextView textEvenOdd,textLeapYear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editInitialValue = findViewById(R.id.editInitialValue);
        editTargetedValue = findViewById(R.id.editTargetedValue);
        buttonEvenOdd = findViewById(R.id.buttonEvenOdd);
        textEvenOdd = findViewById(R.id.textEvenOdd);

        editInitialLeap = findViewById(R.id.editInitialLeap);
        editTargetedLeap = findViewById(R.id.editTargetedLeap);
        buttonLeapYear = findViewById(R.id.buttonLeapYear);
        textLeapYear = findViewById(R.id.textLeapYear);



    //================= Even/Odd====================================

        buttonEvenOdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int initialValue = Integer.parseInt(editInitialValue.getText().toString());
                int targetedValue = Integer.parseInt(editTargetedValue.getText().toString());

                textEvenOdd.setText("Even Numbers are :: ");

                for (int x=initialValue; x<=targetedValue; x++){

                    if ( x%2 == 0){

                        textEvenOdd.append(","+x);

                    }


                }

            }
        });


    //=========================Leap Year======================

    buttonLeapYear.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            textLeapYear.setText("Leap Year are given below :: ");

            int initialYear = Integer.parseInt(editInitialLeap.getText().toString());
            int targetedYear = Integer.parseInt(editTargetedLeap.getText().toString());

            for (int year = initialYear; year <= targetedYear; year++){

                if (year % 400 == 0 || (year % 4==0 && year % 100 != 0)){

                    textLeapYear.append(", "+year);

                }

            }

        }
    });


    }
}