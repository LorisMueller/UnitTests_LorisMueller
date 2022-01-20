package ch.bbw.pr.savecalculator;

import junit.framework.TestCase;
import org.junit.*;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

import java.util.*;

public class SaveCalculatorTest {

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

    @Test(expected = java.lang.ArithmeticException.class)
    public void testArithmeticException() {
        int value1 = Integer.MAX_VALUE;
        int value2 = 1;
        testee.summe(value1, value2);
    }

    //Unexpected Exception
    /*@Test
    public void testArithmeticException_2()
        throws ArithmeticException {
        int value1 = Integer.MAX_VALUE;
        int value2 = 1;
        testee.summe(value1, value2);
    }*/

    //Protected Methods can be tested...
    @Test
    public void testProtectedMethodisOk() {
        int value1 = 10;
        int value2 = 20;
        assertTrue(testee.summeProtected(value1, value2) == 30);
    }

    //Package protected Methods can also be tested...
    @Test
    public void testPackageProtectedMethodisOk() {
        int value1 = 10;
        int value2 = 20;
        assertTrue(testee.summePackageProtected(value1, value2) == 30);
    }


    //Only one assertions each, is already added in the previous step
    
    //it is not sensible to set a Getter or Setter for "testee"

    //Sichtbarkeit: All this test in this file are test for a public method and also package protected methods (because these tests are under the same package, as the method)

    //Sichtbarkeit: You can't test a private Method, because she is private and you can't access to it with a Test

}

