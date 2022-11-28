package com.example.tempconverterbothfarenheitandcelsius;

public class ConverterClass {
    //celsius to fahrenheit calculation
    public double c2f_fn(double celsius) {
        return (celsius*1.8)+32;    
    }
    
    //fahrenheit to celsius calculation
    public double f2c_fn(double fahrenheit) {
        return ((fahrenheit-32)*5)/9;
    }
    
    public double k2c_fn(double kelvin) {
        //Calculation for Kelvin to Celsius
        return (kelvin - 273.15);
    }

    public double k2f_fn(double kelvin) {
        //Calculation for Kelvin to Fahrenheit
        return (double)((kelvin-273.15)*1.8+32);
    }

    public double f2k_fn(double fahrenheit) {
        //Calculation for Fahrenheit to Kelvin
        return (double)((fahrenheit-32)*5/9+273.15);
    }

    public double c2k_fn(double celsius) {
        //Calculation for Celsius to Kelvin
        return (celsius+273.15);
    }
}
