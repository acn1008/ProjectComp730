package com.example.tempconverterbothfarenheitandcelsius;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.widget.ProgressBar;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;

import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private Button c2f_Btn;
    private Button f2c_Btn;
    private EditText input_Edt;
    private TextView output_TV;
    private int CurrentProgress = 0;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c2f_Btn = findViewById(R.id.c2f_btn); //button celsius to fahrenheit calculation via ConverterClass
        f2c_Btn = findViewById(R.id.f2c_btn); //button fahrenheit to celsius calculation via ConverterClass
        input_Edt = findViewById(R.id.input_edt); // temperature that is inputted prior to calculation
        output_TV = findViewById(R.id.output_tv); // temperature that is outputted after calculation

        userInput(); //user gets input from input field

    }

    @SuppressLint("SetTextI18n")
    c2f_Btn.setOnClickListener(v -> {

            ConverterClass converterClass = new ConverterClass();
            double degCel = Double.parseDouble(input_Edt.getText().toString());
            //Takes input value from input_Edt and sets it to degCal
            double degFar = converterClass.c2f_fn(degCel);
            //The output of converterClass using degCal is put into degFar as the result
            int final_Far = (int) degFar - 32;
            //Progress bar needs to be shifted 32 to the left so that is aligned with both freezing points
            //C freezing = 0 and F freezing = 32
            output_TV.setText(Double.toString(degFar));
                progressBar.setMax(180);
                //Progress bar is set to have a max of 180 because 212 is boiling in F and 100 is boiling in C
                //Entire progress bar needs to be offset by 32 so that 212 - 32 = 180
                CurrentProgress = CurrentProgress + final_Far;
                //Updates progress bar to be filled with a percentage value of what final_Far is
                progressBar.setProgress(CurrentProgress);
                CurrentProgress = 0;
                //Resets progress bar to 0

        });

        f2c_Btn.setOnClickListener(v -> {

            ConverterClass converterClass = new ConverterClass();
            double degFar = Double.parseDouble((input_Edt.getText().toString()));
            double degCel = converterClass.f2c_fn(degFar);
            output_TV.setText(Double.toString(degCel));
            int final_Cel = (int) degCel;
            //Min of progress bar is set to 0 by default
                progressBar.setMax(100);
                //Progress bar is to toa max of 100 because boiling in Celsius is 100
                CurrentProgress = CurrentProgress + final_Cel;
                //Updates progress bar to be filled with a percentage of what final_Cel is
                progressBar.setProgress(CurrentProgress);
                CurrentProgress = 0;
                //Resets progress bar to 0
        });
    }
}


