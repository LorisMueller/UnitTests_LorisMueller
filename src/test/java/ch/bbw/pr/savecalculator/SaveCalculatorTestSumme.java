package ch.bbw.pr.savecalculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class SaveCalculatorTestSumme {

    @Test
    public void testSummeTwoPositivesIsOk() {
        SaveCalculator testee = new SaveCalculator();
        int value1 = 10;
        int value2 = 20;
        assertTrue(testee.summe(value1, value2) == 30);
    }
}