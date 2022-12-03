package com.example.tempconverterbothfarenheitandcelsius;

import junit.framework.TestCase;

//Testing class created to test ConverterClass. 24 tests total (4 for each function)
//Test 4 for each function tests negative temperatures being converted

public class ConverterClassTest extends TestCase {

    public void test1C2f_fn() {

    //The following four tests will test Celsius to Fahrenheit as stated in read me file
    //Used double type for temperature to be converted to Fahrenheit from Celsius. The assertion
    //is checked as actual actual value is compared to the what we entered as the expected value.

        ConverterClass converterClassC2FTest1 = new ConverterClass();
        assertEquals(32.0, converterClassC2FTest1.c2f_fn(0));
    }

    public void test2c2f_fn() {
        ConverterClass converterClassC2FTest2 = new ConverterClass();
        assertEquals(212.0, converterClassC2FTest2.c2f_fn(100));
    }

    public void test3c2f_fn() {
        ConverterClass converterClassC2FTest3 = new ConverterClass();
        assertEquals(104.0, converterClassC2FTest3.c2f_fn(40));

    }

    public void test4c2f_fn() {
        ConverterClass converterClassC2FTest3 = new ConverterClass();
        assertEquals(-148.0, converterClassC2FTest3.c2f_fn(-100));

    }
    //The following four tests will test Fahrenheit to Celsius as stated in read me file
    //Used double type for temperature to be converted to Celsius from Fahrenheit. The assertion
    //is checked as actual actual value is compared to the what we entered as the expected value.

    public void test1F2c_fn() {

        ConverterClass converterClassF2CTest1 = new ConverterClass();
        assertEquals(0.0, converterClassF2CTest1.f2c_fn(32));
    }

    public void test2F2c_fn() {

        ConverterClass converterClassF2CTest2 = new ConverterClass();
        assertEquals(100.0, converterClassF2CTest2.f2c_fn(212));
    }

    public void test3F2c_fn() {

        ConverterClass converterClassF2CTest3 = new ConverterClass();
        assertEquals(79.44444444444444 , converterClassF2CTest3.f2c_fn(175));
    }

    public void test4F2c_fn() {

        ConverterClass converterClassF2CTest1 = new ConverterClass();
        assertEquals(-35.55555555555556, converterClassF2CTest1.f2c_fn(-32));
    }

    //The following four tests will test Kelvin to Celsius as stated in read me file
    //Used double type for temperature to be converted to Celsius from Kelvin. The assertion
    //is checked as actual actual value is compared to the what we entered as the expected value.

    public void test1K2c_fn() {
        ConverterClass converterClassK2CTest1 = new ConverterClass();
        assertEquals(100.0, converterClassK2CTest1.k2c_fn(373.15));
    }

    public void test2K2c_fn() {
        ConverterClass converterClassK2CTest2 = new ConverterClass();
        assertEquals(0.0, converterClassK2CTest2.k2c_fn(273.15));
    }

    public void test3K2c_fn() {
        ConverterClass converterClassK2CTest3 = new ConverterClass();
        assertEquals(50.0, converterClassK2CTest3.k2c_fn(323.15));
    }

    public void test4K2c_fn() {
        ConverterClass converterClassK2CTest3 = new ConverterClass();
        assertEquals(-646.30, converterClassK2CTest3.k2c_fn(-373.15));
    }

    //The following four tests will test Kelvin to Fahrenheit as stated in read me file
    //Used double type for temperature to be converted to Fahrenheit from Kelvin. The assertion
    //is checked as actual actual value is compared to the what we entered as the expected value.

    public void test1K2f_fn() {
        ConverterClass converterClassK2CTest1 = new ConverterClass();
        assertEquals(212.0, converterClassK2CTest1.k2f_fn(373.15));
    }

    public void test2K2f_fn() {
        ConverterClass converterClassK2CTest2 = new ConverterClass();
        assertEquals(32.0, converterClassK2CTest2.k2f_fn(273.15));
    }

    public void test3K2f_fn() {
        ConverterClass converterClassK2CTest3 = new ConverterClass();
        assertEquals(122.0, converterClassK2CTest3.k2f_fn(323.15));
    }

    public void test4K2f_fn() {
        ConverterClass converterClassK2CTest3 = new ConverterClass();
        assertEquals(-1131.34, converterClassK2CTest3.k2f_fn(-373.15));
    }

    //The following four tests will test Fahrenheit to Kelvin as stated in read me file
    //Used double type for temperature to be converted to Kelvin from Fahrenheit. The assertion
    //is checked as actual actual value is compared to the what we entered as the expected value.
    public void test1F2k_fn() {
        ConverterClass converterClassK2CTest1 = new ConverterClass();
        assertEquals(373.15, converterClassK2CTest1.f2k_fn(212.00));
    }

    public void test2F2k_fn() {
        ConverterClass converterClassK2CTest2 = new ConverterClass();
        assertEquals(273.15, converterClassK2CTest2.f2k_fn(32.0));
    }

    public void test3F2k_fn() {
        ConverterClass converterClassK2CTest3 = new ConverterClass();
        assertEquals(323.15, converterClassK2CTest3.f2k_fn(122.00));
    }

    public void test4F2k_fn() {
        ConverterClass converterClassK2CTest3 = new ConverterClass();
        assertEquals(137.594444444444443, converterClassK2CTest3.f2k_fn(-212.00));
    }

    //The following four tests will test Celsius to Kelvin as stated in read me file
    //Used double type for temperature to be converted to Kelvin from Celsius. The assertion
    //is checked as actual actual value is compared to the what we entered as the expected value.

    public void test1C2k_fn() {
        ConverterClass converterClassK2CTest1 = new ConverterClass();
        assertEquals(373.15, converterClassK2CTest1.c2k_fn(100.0));
    }

    public void test2C2k_fn() {
        ConverterClass converterClassK2CTest2 = new ConverterClass();
        assertEquals(273.15, converterClassK2CTest2.c2k_fn(0.0));
    }

    public void test3C2k_fn() {
        ConverterClass converterClassK2CTest3 = new ConverterClass();
        assertEquals(323.15, converterClassK2CTest3.c2k_fn(50.0));
    }

    public void test4C2k_fn() {
        ConverterClass converterClassK2CTest3 = new ConverterClass();
        assertEquals(-100.0, converterClassK2CTest3.c2k_fn(-373.15));
    }

}