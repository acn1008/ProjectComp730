package com.example.tempconverterbothfarenheitandcelsius;

/**
 * @author Andre Nasrah and Ellie Brown
 */

public class ConverterClass {
    //celsius to fahrenheit calculation
    public double c2f_fn(double celsius) {
        return (celsius*1.8)+32;
    }
    //fahrenheit to celsius calculation
    public double f2c_fn(double fahrenheit) {
        return ((fahrenheit-32)*5)/9;
    }
    //Calculation for Kelvin to Celsius
    public double k2c_fn(double kelvin) {
        return (kelvin - 273.15);
    }
    //Calculation for Kelvin to Fahrenheit
    public double k2f_fn(double kelvin) {
        return (double)((kelvin-273.15)*1.8+32);
    }
    //Calculation for Fahrenheit to Kelvin
    public double f2k_fn(double fahrenheit) {
        return (double)((fahrenheit-32)*5/9+273.15);
    }
    //Calculation for Celsius to Kelvin
    public double c2k_fn(double celsius) {
        return (celsius+273.15);
    }
}