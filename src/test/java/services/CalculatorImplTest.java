package services;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * primary number
 * if has only 2 divisors
 * composite number
 * if has more than 2 divisors
 */
public class CalculatorImplTest {

    private CalculatorImpl calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new CalculatorImpl();
    }

    //not primary number
    @Test
    public void testIsPrimaryNumberWhenNumberIsNegativeShouldReturnFalse(){
        //given && when
        boolean result = calculator.isPrimaryNumber(-10);

        //then
        Assert.assertFalse(result);
    }

    @Test
    public void testIsPrimaryNumberWhenNumberIsZeroShouldReturnFalse(){
        //given && when
        boolean result = calculator.isPrimaryNumber(0);

        //then
        Assert.assertFalse(result);
    }

    @Test
    public void testIsPrimaryNumberWhenNumberIsOneShouldReturnFalse(){
        //given && when
        boolean result = calculator.isPrimaryNumber(1);

        //then
        Assert.assertFalse(result);
    }

    @Test
    public void testIsPrimaryNumberWhenNumberIsFourShouldReturnFalse(){
        //given && when
        boolean result = calculator.isPrimaryNumber(4);

        //then
        Assert.assertFalse(result);
    }

    @Test
    public void testIsPrimaryNumberWhenNumberIsNineShouldReturnFalse(){
        //given && when
        boolean result = calculator.isPrimaryNumber(9);

        //then
        Assert.assertFalse(result);
    }

    @Test
    public void testIsPrimaryNumberWhenNumberIsTwelveShouldReturnFalse(){
        //given && when
        boolean result = calculator.isPrimaryNumber(12);

        //then
        Assert.assertFalse(result);
    }

    //primary number 2,67,97
    @Test
    public void testIsPrimaryNumberWhenNumberIsTwoShouldReturnTrue(){
        //given && when
        boolean result = calculator.isPrimaryNumber(2);

        //then
        Assert.assertTrue(result);
    }

    @Test
    public void testIsPrimaryNumberWhenNumberIsSixtySevenShouldReturnTrue(){
        //given && when
        boolean result = calculator.isPrimaryNumber(67);

        //then
        Assert.assertTrue(result);
    }

    @Test
    public void testIsPrimaryNumberWhenNumberIsNinetySevenShouldReturnTrue(){
        //given && when
        boolean result = calculator.isPrimaryNumber(97);

        //then
        Assert.assertTrue(result);
    }

    @Test
    public void testGetPrimaryNumberSumShouldReturnTeen(){
        //given && when
        int result = calculator.getPrimaryNumberSum(5);

        //then
        Assert.assertEquals(10, result);
    }

    @Test
    public void testGetPrimaryNumberSumShouldReturnFortyOne(){
        //given && when
        int result = calculator.getPrimaryNumberSum(13);

        //then
        Assert.assertEquals(41, result);
    }

    @Test
    public void testGetPrimaryNumberSumShouldReturnOneThousandAndSixty(){
        //given && when
        int result = calculator.getPrimaryNumberSum(97);

        //then
        Assert.assertEquals(1060, result);
    }
}