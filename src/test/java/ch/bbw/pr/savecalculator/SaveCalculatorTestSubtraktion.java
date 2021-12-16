package ch.bbw.pr.savecalculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class SaveCalculatorTestSubtraktion {

    @Test
    public void testSubtraktionTwoPositivesIsOk() {
        SaveCalculator testee = new SaveCalculator();
        int value1 = 50;
        int value2 = 20;
        assertTrue(testee.subtraktion(value1, value2) == 30);
    }
}