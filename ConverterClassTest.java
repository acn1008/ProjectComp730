package com.example.tempconverterbothfarenheitandcelsius;

import junit.framework.TestCase;

public class ConverterClassTest extends TestCase {



    public void testC2f_fn() {
        ConverterClass converterClass = new ConverterClass();
        assertEquals(32.0, converterClass.c2f_fn(0));

        ConverterClass converterClass1 = new ConverterClass();
        assertEquals(212.00, converterClass1.c2f_fn(100));

        ConverterClass converterClass2 = new ConverterClass();
        assertEquals(104.0, converterClass2.c2f_fn(40));

    }

    public void testF2c_fn() {
        ConverterClass converterClassA = new ConverterClass();
        assertEquals(0.0, converterClassA.f2c_fn(32));

        ConverterClass converterClassB = new ConverterClass();
        assertEquals(100.0, converterClassB.f2c_fn(212));

        ConverterClass converterClassC = new ConverterClass();
        assertEquals(79.44444444444444, converterClassC.f2c_fn(175));


    }
}