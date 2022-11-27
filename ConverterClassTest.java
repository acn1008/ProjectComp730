package com.example.tempconverterbothfarenheitandcelsius;

import junit.framework.TestCase;

//Testing class created to test ConverterClass

public class ConverterClassTest extends TestCase {

    //The following test will test Celsius to Fahrenheit as stated in read me file

    public void testC2f_fn() {

    //Used double type for temperature to be converted to Fahrenheit from Celsius. The assertion
    //is checked as actual actual value is compared to the what we entered as the expected value.

        ConverterClass converterClass = new ConverterClass();
        assertEquals(32.0, converterClass.c2f_fn((double) 0));

        ConverterClass converterClass1 = new ConverterClass();
        assertEquals(212.0, converterClass1.c2f_fn((double) 100));

        ConverterClass converterClass2 = new ConverterClass();
        assertEquals(104.0, converterClass2.c2f_fn((double) 40));

    }

    //Used double type for temperature to be converted to Celsius from Fahrenheit. The assertion
    //is checked as actual actual value is compared to the what we entered as the expected value.

    public void testF2c_fn() {

        //double delta = .05;

        ConverterClass converterClassA = new ConverterClass();
        assertEquals(0.0, converterClassA.f2c_fn((double) 32));

        ConverterClass converterClassB = new ConverterClass();
        assertEquals(100.0, converterClassB.f2c_fn((double) 212));

        ConverterClass converterClassC = new ConverterClass();
        assertEquals(79.44444444444444 , converterClassC.f2c_fn((double) 175));

    }
}