package ch.bbw.pr.savecalculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SaveCalculatorTest_Addition {

    private SaveCalculator testee;

    @Before
    public void setUp() {
        testee = new SaveCalculator();
    }

    @Test
    public void testSummeTwoPositivesIsOk() {
        int value1 = 1;
        int value2 = 10;
        assertTrue(testee.summe(value1, value2) == 11);
    }

    @Test
    public void testSummeNegativeAndPositiveIsOk() {
        int value1 = 20;
        int value2 = -30;
        assertTrue(testee.summe(value1, value2) == -10);
    }

    @Test
    public void testSummeTwoNegativesIsOk() {
        int value1 = -15;
        int value2 = -5;
        assertTrue(testee.summe(value1, value2) == -20);
    }

    @Test
    public void testSummeZeroandPositiveIsOk() {
        int value1 = 0;
        int value2 = 3;
        assertTrue(testee.summe(value1, value2) == 3);
    }

    @Test
    public void testSummeZeroAndNegativeIsOk() {
        int value1 = 0;
        int value2 = -20;
        assertTrue(testee.summe(value1, value2) == -20);
    }

    @Test(expected = java.lang.ArithmeticException.class)
    public void testSummeMax_ValueIsNotOk() {
        int value1 = 1;
        int value2 = Integer.MAX_VALUE;
        testee.summe(value1, value2);
    }

    @Test
    public void testSummeMin_ValueIsOk() {
        int value1 = 1;
        int value2 = Integer.MIN_VALUE;
        testee.summe(value1, value2);
    }

    @Test
    public void testSummeMax_ValueAndMin_ValueIsOk() {
        int value1 = Integer.MAX_VALUE;
        int value2 = Integer.MIN_VALUE;
        testee.summe(value1, value2);
    }



}