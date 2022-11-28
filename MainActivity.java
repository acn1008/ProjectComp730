package com.example.tempconverterbothfarenheitandcelsius;

import static android.graphics.Color.BLUE;
import static android.graphics.Color.WHITE;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Adapter;

import android.widget.Spinner;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private Button go_Btn;
    private EditText input_Edt;
    private TextView output_TV;
    private int CurrentProgress = 0;
    private ProgressBar progressBar;
    private Object AdapterView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        go_Btn = findViewById(R.id.go_btn);; //button celsius to fahrenheit and fahrenheit to celsius calculation via ConverterClass
        input_Edt = findViewById(R.id.input_edt); // temperature that is inputted prior to calculation
        output_TV = findViewById(R.id.output_tv); // temperature that is outputted after calculation

        Spinner spinner_convert = (Spinner) findViewById(R.id.spinner);
        //creates new Spinner using the XML spinner formatting
        String[] items = new String[] {"Celsius to Fahrenheit", "Fahrenheit to Celsius", "Kelvin to Celsius", "Kelvin to Fahrenheit", "Fahrenheit to Kelvin", "Celsius to Kelvin"};
        //creates a list of dropdown options
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, items);
        //create a new adapter to connect items to a spinner-dropdown format
        spinner_convert.setAdapter(adapter);
        //connects spinner to adapter
        spinner_convert.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id){
                ((TextView) parent.getChildAt(0)).setBackgroundColor(BLUE);
                ((TextView) parent.getChildAt(0)).setTextColor(WHITE);
                ((TextView) parent.getChildAt(0)).setTextSize(18);
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
                else if (position == 2){
                    //gets position of which item in the dropdown was selected
                    //if position 0 (Celsius to Fahrenheit) selected then pass 0 to go_calculate
                    go_calculate(2);
                }
                else if (position == 3){
                    //gets position of which item in the dropdown was selected
                    //if position 0 (Celsius to Fahrenheit) selected then pass 0 to go_calculate
                    go_calculate(3);
                }
                else if (position == 4){
                    //gets position of which item in the dropdown was selected
                    //if position 0 (Celsius to Fahrenheit) selected then pass 0 to go_calculate
                    go_calculate(4);
                }
                else if (position == 5){
                    //gets position of which item in the dropdown was selected
                    //if position 0 (Celsius to Fahrenheit) selected then pass 0 to go_calculate
                    go_calculate(5);
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
        ProgressBar progressBar = findViewById(R.id.progressBar);


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
            if (degFar <= 32){ //if output from conversion is less than 32 color = cold (blue)
                LinearLayout bgElement = (LinearLayout) findViewById(R.id.background_layer);
                bgElement.setBackgroundColor(Color.parseColor("#00296b"));
                TextView tElement = (TextView) findViewById(R.id.output_tv);
                tElement.setTextColor(Color.parseColor("#a2aab8"));
            }
            else if (degFar >= 212) { //if output from conversion is greater than 212 color = hot (red)
                LinearLayout bgElement = (LinearLayout) findViewById(R.id.background_layer);
                bgElement.setBackgroundColor(Color.parseColor("#e60805"));
                TextView tElement = (TextView) findViewById(R.id.output_tv);
                tElement.setTextColor(Color.parseColor("#610000"));
            }
            else { //if output from conversion is in-between 32 and 212 color = medium (purple)
                LinearLayout bgElement = (LinearLayout) findViewById(R.id.background_layer);
                bgElement.setBackgroundColor(Color.parseColor("#599146"));
                TextView tElement = (TextView) findViewById(R.id.output_tv);
                tElement.setTextColor(Color.parseColor("#22590f"));
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
            if (degCel <= 0){ //if output from conversion is less than 0, color = cold (blue)
                LinearLayout bgElement = (LinearLayout) findViewById(R.id.background_layer);
                bgElement.setBackgroundColor(Color.parseColor("#00296b"));
                TextView tElement = (TextView) findViewById(R.id.output_tv);
                tElement.setTextColor(Color.parseColor("#a2aab8"));
            }
            else if (degCel >= 100) { //if output from conversion is greater than 100 color = hot (red)
                LinearLayout bgElement = (LinearLayout) findViewById(R.id.background_layer);
                bgElement.setBackgroundColor(Color.parseColor("#e60805"));
                TextView tElement = (TextView) findViewById(R.id.output_tv);
                tElement.setTextColor(Color.parseColor("#610000"));
            }
            else { //if output from conversion is in-between 0 and 100 color = medium (purple)
                LinearLayout bgElement = (LinearLayout) findViewById(R.id.background_layer);
                bgElement.setBackgroundColor(Color.parseColor("#599146"));
                TextView tElement = (TextView) findViewById(R.id.output_tv);
                tElement.setTextColor(Color.parseColor("#22590f"));
            }
        }
        
        if (num == 2) {
            ConverterClass converterClass = new ConverterClass();
            double degKel = Double.parseDouble(input_Edt.getText().toString());
            //Takes input value from input_Edt and sets it to degCal
            double degCel = converterClass.k2c_fn(degKel);
            //The output of converterClass using degCal is put into degFar as the result
            int final_Cel = (int) degCel;
            //Progress bar needs to be shifted 32 to the left so that is aligned with both freezing points
            //C freezing = 0 and F freezing = 32
            output_TV.setText(Double.toString(degCel));
            progressBar.setMax(100);
            //Progress bar is set to have a max of 180 because 212 is boiling in F and 100 is boiling in C
            //Entire progress bar needs to be offset by 32 so that 212 - 32 = 180
            CurrentProgress = CurrentProgress + final_Cel;
            //Updates progress bar to be filled with a percentage value of what final_Far is
            progressBar.setProgress(CurrentProgress);
            CurrentProgress = 0;
            //Resets progress bar to 0
            if (degCel <= 0){ //if output from conversion is less than 32 color = cold (blue)
                LinearLayout bgElement = (LinearLayout) findViewById(R.id.background_layer);
                bgElement.setBackgroundColor(Color.parseColor("#00296b"));
                TextView tElement = (TextView) findViewById(R.id.output_tv);
                tElement.setTextColor(Color.parseColor("#a2aab8"));
            }
            else if (degCel >= 100) { //if output from conversion is greater than 212 color = hot (red)
                LinearLayout bgElement = (LinearLayout) findViewById(R.id.background_layer);
                bgElement.setBackgroundColor(Color.parseColor("#e60805"));
                TextView tElement = (TextView) findViewById(R.id.output_tv);
                tElement.setTextColor(Color.parseColor("#610000"));
            }
            else { //if output from conversion is in-between 32 and 212 color = medium (purple)
                LinearLayout bgElement = (LinearLayout) findViewById(R.id.background_layer);
                bgElement.setBackgroundColor(Color.parseColor("#599146"));
                TextView tElement = (TextView) findViewById(R.id.output_tv);
                tElement.setTextColor(Color.parseColor("#22590f"));
            }
        }

        if (num == 3) {
            ConverterClass converterClass = new ConverterClass();
            double degKel = Double.parseDouble(input_Edt.getText().toString());
            //Takes input value from input_Edt and sets it to degKel
            double degFar = converterClass.k2f_fn(degKel);
            //The output of converterClass using degKel is put into degFar as the result
            int final_Far = (int) degFar - 32;
            //Progress bar needs to be shifted 32 to the left so that is aligned with both freezing points
            //K freezing = 273 and F freezing = 32
            output_TV.setText(Double.toString(degFar));
            progressBar.setMax(180);
            //Progress bar is set to have a max of 180 because 212 is boiling in F and 100 is boiling in C
            //Entire progress bar needs to be offset by 32 so that 212 - 32 = 180
            CurrentProgress = CurrentProgress + final_Far;
            //Updates progress bar to be filled with a percentage value of what final_Far is
            progressBar.setProgress(CurrentProgress);
            CurrentProgress = 0;
            //Resets progress bar to 0
            if (degFar <= 32){ //if output from conversion is less than 32 color = cold (blue)
                LinearLayout bgElement = (LinearLayout) findViewById(R.id.background_layer);
                bgElement.setBackgroundColor(Color.parseColor("#00296b"));
                TextView tElement = (TextView) findViewById(R.id.output_tv);
                tElement.setTextColor(Color.parseColor("#a2aab8"));
            }
            else if (degFar >= 212) { //if output from conversion is greater than 212 color = hot (red)
                LinearLayout bgElement = (LinearLayout) findViewById(R.id.background_layer);
                bgElement.setBackgroundColor(Color.parseColor("#e60805"));
                TextView tElement = (TextView) findViewById(R.id.output_tv);
                tElement.setTextColor(Color.parseColor("#610000"));
            }
            else { //if output from conversion is in-between 32 and 212 color = medium (purple)
                LinearLayout bgElement = (LinearLayout) findViewById(R.id.background_layer);
                bgElement.setBackgroundColor(Color.parseColor("#599146"));
                TextView tElement = (TextView) findViewById(R.id.output_tv);
                tElement.setTextColor(Color.parseColor("#22590f"));
            }
        }

        if (num == 4) {
            ConverterClass converterClass = new ConverterClass();
            double degFar = Double.parseDouble(input_Edt.getText().toString());
            //Takes input value from input_Edt and sets it to degCal
            double degKel = converterClass.f2k_fn(degFar);
            //The output of converterClass using degKel is put into degFar as the result
            int final_Kel = (int) degKel - 273;
            //Progress bar needs to be shifted 273 to the left so that is aligned with both freezing points
            //F freezing = 32 and F freezing = 273
            //Progress bar represents freezing point as 0% so bar needs to be offset by 273
            output_TV.setText(Double.toString(degKel));
            progressBar.setMax(100);
            //Progress bar is set to have a max of 100 because 373 is boiling in K and 100 is boiling in C
            //Entire progress bar needs to be offset by 273 so that 373 - 273 = 100
            CurrentProgress = CurrentProgress + final_Kel;
            //Updates progress bar to be filled with a percentage value of what final_Kel is
            progressBar.setProgress(CurrentProgress);
            CurrentProgress = 0;
            //Resets progress bar to 0
            if (degKel <= 273){ //if output from conversion is less than 273 color = cold (blue)
                LinearLayout bgElement = (LinearLayout) findViewById(R.id.background_layer);
                bgElement.setBackgroundColor(Color.parseColor("#00296b"));
                TextView tElement = (TextView) findViewById(R.id.output_tv);
                tElement.setTextColor(Color.parseColor("#a2aab8"));
            }
            else if (degKel >= 373) { //if output from conversion is greater than 373 color = hot (red)
                LinearLayout bgElement = (LinearLayout) findViewById(R.id.background_layer);
                bgElement.setBackgroundColor(Color.parseColor("#e60805"));
                TextView tElement = (TextView) findViewById(R.id.output_tv);
                tElement.setTextColor(Color.parseColor("#610000"));
            }
            else { //if output from conversion is in-between 273 and 373 color = medium (purple)
                LinearLayout bgElement = (LinearLayout) findViewById(R.id.background_layer);
                bgElement.setBackgroundColor(Color.parseColor("#599146"));
                TextView tElement = (TextView) findViewById(R.id.output_tv);
                tElement.setTextColor(Color.parseColor("#22590f"));
            }
        }

        if (num == 5) {
            ConverterClass converterClass = new ConverterClass();
            double degCel = Double.parseDouble(input_Edt.getText().toString());
            //Takes input value from input_Edt and sets it to degCal
            double degKel = converterClass.c2k_fn(degCel);
            //The output of converterClass using degCel is put into degKel as the result
            int final_Kel = (int) degKel - 273;
            //Progress bar needs to be shifted 273 to the left so that is aligned with both freezing points
            //C freezing = 0 and F freezing = 273
            //Progress bar represents freezing point as 0% so bar needs to be offset by 273
            output_TV.setText(Double.toString(degKel));
            progressBar.setMax(100);
            //Progress bar is set to have a max of 100 because 373 is boiling in K and 100 is boiling in C
            //Entire progress bar needs to be offset by 273 so that 373 - 273 = 100
            CurrentProgress = CurrentProgress + final_Kel;
            //Updates progress bar to be filled with a percentage value of what final_Kel is
            progressBar.setProgress(CurrentProgress);
            CurrentProgress = 0;
            //Resets progress bar to 0
            if (degKel <= 273){ //if output from conversion is less than 273 color = cold (blue)
                LinearLayout bgElement = (LinearLayout) findViewById(R.id.background_layer);
                bgElement.setBackgroundColor(Color.parseColor("#00296b"));
                TextView tElement = (TextView) findViewById(R.id.output_tv);
                tElement.setTextColor(Color.parseColor("#a2aab8"));
            }
            else if (degKel >= 373) { //if output from conversion is greater than 373 color = hot (red)
                LinearLayout bgElement = (LinearLayout) findViewById(R.id.background_layer);
                bgElement.setBackgroundColor(Color.parseColor("#e60805"));
                TextView tElement = (TextView) findViewById(R.id.output_tv);
                tElement.setTextColor(Color.parseColor("#610000"));
            }
            else { //if output from conversion is in-between 273 and 373 color = medium (purple)
                LinearLayout bgElement = (LinearLayout) findViewById(R.id.background_layer);
                bgElement.setBackgroundColor(Color.parseColor("#599146"));
                TextView tElement = (TextView) findViewById(R.id.output_tv);
                tElement.setTextColor(Color.parseColor("#22590f"));
            }
        }
    }
}


