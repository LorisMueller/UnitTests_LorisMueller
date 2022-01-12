package ch.bbw.pr.savecalculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SaveCalculatorTest_Subtraktion {

    private SaveCalculator testee;

    @Before
    public void setUp() {
        testee = new SaveCalculator();
    }

    @Test
    public void testSubtraktionTwoPositivesIsOk() {
        int value1 = 10;
        int value2 = 1;
        assertTrue(testee.subtraktion(value1, value2) == 9);
    }

    @Test
    public void testSubtraktionTwoNegativesIsOk() {
        int value1 = -20;
        int value2 = -10;
        assertTrue(testee.subtraktion(value1, value2) == -10);
    }

    @Test
    public void testSubtraktionPositivesAndNegativeIsOk() {
        int value1 = 15;
        int value2 = -5;
        assertTrue(testee.subtraktion(value1, value2) == 20);
    }

    @Test
    public void testSubtraktionZeroAndPositiveIsOk() {
        int value1 = 0;
        int value2 = 50;
        assertTrue(testee.subtraktion(value1, value2) == -50);
    }

    @Test(expected = java.lang.ArithmeticException.class)
    public void testSubtraktionMin_ValueIsException() {
        int value1 = Integer.MIN_VALUE;
        int value2 = 1;
        testee.subtraktion(value1, value2);
    }

    @Test
    public void testSubtraktionMax_ValueAndNegativeIsExeption() {
        int value1 = -1;
        int value2 = Integer.MAX_VALUE;
        testee.subtraktion(value1, value2);
    }

    @Test(expected = java.lang.ArithmeticException.class)
    public void testSubtraktionMin_ValueAndMax_ValueIsException() {
        int value1 = Integer.MIN_VALUE;
        int value2 = Integer.MAX_VALUE;
        testee.subtraktion(value1, value2);
    }

    //Switched Max_Value and Min_Value
    @Test(expected = java.lang.ArithmeticException.class)
    public void testSubtraktionMax_ValueAndMin_ValueIsException() {
        int value1 = Integer.MAX_VALUE;
        int value2 = Integer.MIN_VALUE;
        testee.subtraktion(value1, value2);
    }

}