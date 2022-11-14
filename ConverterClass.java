package com.example.tempconverterbothfarenheitandcelsius;

public class ConverterClass {
    //celsius to fahrenheit calculation
    public double c2f_fn(double celsius) {
        return (celsius*1.8)+32;    }
    //fahrenheit to celsius calculation
    public double f2c_fn(double fahrenheit) {
        return ((fahrenheit-32)*5)/9;

    }
}