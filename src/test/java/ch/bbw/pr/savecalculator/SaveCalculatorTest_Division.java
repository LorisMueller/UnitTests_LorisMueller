package ch.bbw.pr.savecalculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SaveCalculatorTest_Division {

    private SaveCalculator testee;

    @Before
    public void setUp() {
        testee = new SaveCalculator();
    }

    @Test
    public void testDivisionTwoPositivesIsOk() {
        int value1 = 100;
        int value2 = 10;
        assertTrue(testee.division(value1, value2) == 10);
    }

    @Test
    public void testDivisionPositivAndNegativIsOk() {
        int value1 = 200;
        int value2 = -20;
        assertTrue(testee.division(value1, value2) == -10);
    }

    @Test
    public void testDivisionTwoNegativesIsOk() {
        int value1 = -15;
        int value2 = -3;
        assertTrue(testee.division(value1, value2) == 5);
    }

    // x / 0
    @Test(expected = java.lang.ArithmeticException.class)
    public void testDivisionPositiveWithZeroIsException() {
        int value1 = 10;
        int value2 = 0;
        testee.division(value1, value2);
    }

    // 0 / x
    @Test
    public void testDivisionZeroWithPositiveIsOk() {
        int value1 = 0;
        int value2 = 100;
        assertTrue(testee.division(value1, value2) == 0);
    }

    @Test
    public void testDivisionPositiveAndMax_ValueIsOk() {
        int value1 = Integer.MAX_VALUE;
        int value2 = 100;
        testee.division(value1, value2);
    }

    @Test
    public void testDivisionNegativeAndMin_ValueIsOk() {
        int value1 = Integer.MIN_VALUE;
        int value2 = -200;
        testee.division(value1, value2);
    }

    @Test
    public void testDivisionMax_ValueAndMin_ValueIsOk() {
        int value1 = Integer.MIN_VALUE;
        int value2 = Integer.MAX_VALUE;
        assertTrue(testee.division(value1, value2) == -1);
    }




}