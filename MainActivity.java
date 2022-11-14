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
    private void userInput() {
        progressBar = findViewById(R.id.progressBar);
        f2c_Btn = findViewById(R.id.f2c_btn);
        c2f_Btn = findViewById(R.id.c2f_btn);

        c2f_Btn.setOnClickListener(v -> {

            ConverterClass converterClass = new ConverterClass();
            double degCel = Double.parseDouble(input_Edt.getText().toString());
            double degFar = converterClass.c2f_fn(degCel);
            int final_Far = (int) degFar - 32; //gets to 0 on the bar
            progressBar.setMax(180); // set max bar to 180 since -32 from initial Fahrenheit boiling reading because
            // 100 degrees celsius / 100 pct on bar same as 212 degrees fahrenheit for boiling and -32 is 180 shifting
            // the bar back to read 32 matching 0 pct on the bar marks "freezing point"
            output_TV.setText(Double.toString(degFar));
            CurrentProgress = CurrentProgress + final_Far;
            progressBar.setProgress(CurrentProgress);
            CurrentProgress = 0;

        });

        f2c_Btn.setOnClickListener(v -> {

            ConverterClass converterClass = new ConverterClass();
            double degFar = Double.parseDouble((input_Edt.getText().toString()));
            double degCel = converterClass.f2c_fn(degFar);
            output_TV.setText(Double.toString(degCel));
            int final_Cel = (int) degCel; //gets to 0 on the bar
            progressBar.setMax(100); // set max bar to 100 since 212 degrees fahrenheit and 100 degrees celcius / 100 pct on
            // bar marks "boiling point" as well as 0 degrees celsius matching 0 percent on the bar marks "freezing point"
            CurrentProgress = CurrentProgress + final_Cel;
            progressBar.setProgress(CurrentProgress);
            CurrentProgress = 0;
        });
    }
}


