package ch.bbw.pr.savecalculator;

import junit.framework.TestCase;
import org.junit.*;
import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

import java.util.*;

public class SaveCalculatorTest extends TestCase {

    private SaveCalculator testee;

    @Before
    public void setUp() {
        testee = new SaveCalculator();
    }

    @Test
    public void testSummeTwoPositivesIsOk() {
        int value1 = 10;
        int value2 = 20;
        assertTrue(testee.summe(value1, value2) == 30);
    }

    @Test
    public void testSubtraktionTwoPositivesIsOk() {
        int value1 = 50;
        int value2 = 20;
        assertTrue(testee.subtraktion(value1, value2) == 30);
    }

    @Test
    public void testDivisionTwoPositivesIsOk() {
        int value1 = 100;
        int value2 = 10;
        assertTrue(testee.division(value1, value2) == 10);
    }
}

//Only one assertions each, is already added in the previous step