package com.example.tempconverterbothfarenheitandcelsius;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private EditText input_Edt;
    private TextView output_TV;
    private Button go_Btn;
    private int CurrentProgress = 0;
    private ProgressBar progressBar;
    private Object AdapterView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input_Edt = findViewById(R.id.input_edt); // temperature that is inputted prior to calculation
        output_TV = findViewById(R.id.output_tv); // temperature that is outputted after calculation
        go_Btn = findViewById(R.id.go_btn);
        
        Spinner spinner_convert = (Spinner) findViewById(R.id.spinner);
        //creates new Spinner using the XML spinner formatting
        String[] items = new String[] {"Celsius to Fahrenheit", "Fahrenheit to Celsius"};
        //creates a list of dropdown options
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, items);
        //create a new adapter to connect items to a spinner-dropdown format
        spinner_convert.setAdapter(adapter);
        //connects spinner to adapter
        spinner_convert.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id){
                //connects items String to position within dropdown
                Log.v("item", (String) parent.getItemAtPosition(position));
                if (position == 0){
                    //gets position of which item in the dropdown was selected
                    //if position 0 (Celsius to Fahrenheit) selected then pass 0 to go_calculate
                    go_calculate(0);
                }
                else if (position == 1){
                    //gets position of which item in the dropdown was selected
                    //if position 0 (Celsius to Fahrenheit) selected then pass 0 to go_calculate
                    go_calculate(1);
                }
            }
            @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                //Run something if nothing is selected. Aka nothing because there is nothing in this method
            }
        });
    }

    private void go_calculate(int num) {
        go_Btn.setOnClickListener(v -> {
            //pass num 1 or 0 from dropdown selection to userInput to calculate correct conversion
            //0 = Celsius to Fahrenheit
            //1 = Fahrenheit to Celsius
            userInput(num);
        });
    }

    @SuppressLint("SetTextI18n")
    private void userInput(int num) {
        progressBar = findViewById(R.id.progressBar);

         if (num == 0) {

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
            //Freezing temperature 32 degrees Fahrenheit or below would have blue background
            //Default background is purple
            if ((int) degFar <= 32) {
                LinearLayout bgElement = (LinearLayout) findViewById(R.id.background_layer);
                bgElement.setBackgroundColor(Color.BLUE);
            }
            //Boiling temperature 212 degrees Fahrenheit or above would have red background
            //Default background is purple
            else if ((int)degFar >= 212) {
                LinearLayout bgElement = (LinearLayout) findViewById(R.id.background_layer);
                bgElement.setBackgroundColor(Color.RED);
            }
            //Temperatures in between freezing and boiling would have green background
            //Default background is purple
            else {
                    LinearLayout bgElement = (LinearLayout) findViewById(R.id.background_layer);
                    bgElement.setBackgroundColor(Color.GREEN);
                }

        }

        if (num == 1) {

            ConverterClass converterClass = new ConverterClass();
            double degFar = Double.parseDouble((input_Edt.getText().toString()));
            double degCel = converterClass.f2c_fn(degFar);
            output_TV.setText(Double.toString(degCel));
            int final_Cel = (int) degCel; //gets to 0 on the bar
            progressBar.setMax(100); // set max bar to 100 since 212 degrees fahrenheit and 100 degrees celcius / 100 pct on
            // bar marks "boiling point" as well as 0 degrees celsius matching 0 percent on the bar marks "freezing point"
            CurrentProgress = CurrentProgress + final_Cel;
            progressBar.setProgress(CurrentProgress);
            //Resets progress bar to 0
            CurrentProgress = 0;
            //Freezing temperature 0 degrees Celsius or below would have blue background
            //Default background is purple
            if ((int)degCel <= 0) {
                LinearLayout bgElement = (LinearLayout) findViewById(R.id.background_layer);
                bgElement.setBackgroundColor(Color.BLUE);
            }
            //Boiling temperature 100 degrees Celsius or above would have red background
            //Default background is purple
            else if ((int)degCel >= 100) {
                LinearLayout bgElement = (LinearLayout) findViewById(R.id.background_layer);
                bgElement.setBackgroundColor(Color.RED);
            }
            //Temperatures in between freezing and boiling would have green background
            //Default background is purple
            else {
                    LinearLayout bgElement = (LinearLayout) findViewById(R.id.background_layer);
                    bgElement.setBackgroundColor(Color.GREEN);
            }
        }
    }
}


