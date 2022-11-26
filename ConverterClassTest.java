package com.example.tempconverterbothfarenheitandcelsius;

import junit.framework.TestCase;

//Testing class created to test ConverterClass

public class ConverterClassTest extends TestCase {

    //The following test will test Celsius to Fahrenheit as stated in read me file

    public void testC2f_fn() {

        double delta = .05;

    //Note ".05" for variable named double delta as the actual result to have the assertion
    // hold true must be within 5 percent of the actual value

        ConverterClass converterClass = new ConverterClass();
        assertEquals(32.0, converterClass.c2f_fn(0), delta);

        ConverterClass converterClass1 = new ConverterClass();
        assertEquals(212.00, converterClass1.c2f_fn(100),delta);

        ConverterClass converterClass2 = new ConverterClass();
        assertEquals(104.0, converterClass2.c2f_fn(40), delta);

    }

    //The following test will test Fahrenheit to Celsius as stated in read me file
    //Note ".05" for variable named double delta for third example as the actual result
    //is 79.44444444444444 and we only wanted to have the assertion hold true within 5 percent
    // of the actual value

    public void testF2c_fn() {

        double delta = .05;

        ConverterClass converterClassA = new ConverterClass();
        assertEquals(0.0, converterClassA.f2c_fn(32), delta);

        ConverterClass converterClassB = new ConverterClass();
        assertEquals(100, converterClassB.f2c_fn(212), delta);

        ConverterClass converterClassC = new ConverterClass();
        assertEquals(79.4, converterClassC.f2c_fn(175), delta);


    }
}