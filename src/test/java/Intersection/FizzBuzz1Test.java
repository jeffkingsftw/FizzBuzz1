package Intersection;

import static Intersection.StringConstants.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class FizzBuzz1Test
{
    /**
     * Tests to validate the isMultipleOfThree() method
     * For any number n should return true if
     * the number is a multiple of 3
     * Examples:
     *  3 => true
     *  -3 => true
     *  15 => true
     *  0 => false
     *  5 => false
     */
    @Test
    public void whenMultipleOfThree() {
        FizzBuzz1 fb1 = new FizzBuzz1( 0, 0 );
        boolean result = false;

        int num = -33;
        result = fb1.isMultipleOfThree( num );
        assertEquals( true, result );

        num = -30;
        result = fb1.isMultipleOfThree( num );
        assertEquals( true, result );

        num = -20;
        result = fb1.isMultipleOfThree( num );
        assertEquals( false, result );

        num = -15;
        result = fb1.isMultipleOfThree( num );
        assertEquals( true, result );

        num = -9;
        result = fb1.isMultipleOfThree( num );
        assertEquals( true, result );

        num = -5;
        result = fb1.isMultipleOfThree( num );
        assertEquals( false, result );

        num = -3;
        result = fb1.isMultipleOfThree( num );
        assertEquals( true, result );

        num = -1;
        result = fb1.isMultipleOfThree( num );
        assertEquals( false, result );

        num = 0;
        result = fb1.isMultipleOfThree( num );
        assertEquals( false, result );

        num = 1;
        result = fb1.isMultipleOfThree( num );
        assertEquals( false, result );

        num = 3;
        result = fb1.isMultipleOfThree( num );
        assertEquals( true, result );

        num = 5;
        result = fb1.isMultipleOfThree( num );
        assertEquals( false, result );

        num = 9;
        result = fb1.isMultipleOfThree( num );
        assertEquals( true, result );

        num = 15;
        result = fb1.isMultipleOfThree( num );
        assertEquals( true, result );

        num = 20;
        result = fb1.isMultipleOfThree( num );
        assertEquals( false, result );

        num = 30;
        result = fb1.isMultipleOfThree( num );
        assertEquals( true, result );

        num = 33;
        result = fb1.isMultipleOfThree( num );
        assertEquals( true, result );
    }

    /**
     * Tests to validate the isMultipleOfFive() method
     * For any number n should return true if
     * the number is a multiple of 5
     * Examples:
     *  5 => true
     *  -5 => true
     *  15 => true
     *  0 => false
     *  6 => false
     */
    @Test
    public void whenMultipleOfFive() {
        FizzBuzz1 fb1 = new FizzBuzz1( 0, 0 );
        boolean result = false;

        int num = -33;
        result = fb1.isMultipleOfFive( num );
        assertEquals( false, result );

        num = -30;
        result = fb1.isMultipleOfFive( num );
        assertEquals( true, result );

        num = -20;
        result = fb1.isMultipleOfFive( num );
        assertEquals( true, result );

        num = -15;
        result = fb1.isMultipleOfFive( num );
        assertEquals( true, result );

        num = -9;
        result = fb1.isMultipleOfFive( num );
        assertEquals( false, result );

        num = -5;
        result = fb1.isMultipleOfFive( num );
        assertEquals( true, result );

        num = -3;
        result = fb1.isMultipleOfFive( num );
        assertEquals( false, result );

        num = -1;
        result = fb1.isMultipleOfFive( num );
        assertEquals( false, result );

        num = 0;
        result = fb1.isMultipleOfFive( num );
        assertEquals( false, result );

        num = 1;
        result = fb1.isMultipleOfFive( num );
        assertEquals( false, result );

        num = 3;
        result = fb1.isMultipleOfFive( num );
        assertEquals( false, result );

        num = 5;
        result = fb1.isMultipleOfFive( num );
        assertEquals( true, result );

        num = 9;
        result = fb1.isMultipleOfFive( num );
        assertEquals( false, result );

        num = 15;
        result = fb1.isMultipleOfFive( num );
        assertEquals( true, result );

        num = 20;
        result = fb1.isMultipleOfFive( num );
        assertEquals( true, result );

        num = 30;
        result = fb1.isMultipleOfFive( num );
        assertEquals( true, result );

        num = 33;
        result = fb1.isMultipleOfFive( num );
        assertEquals( false, result );
    }

    /**
     * Tests to validate the isMultipleOfFifteen() method
     * For any number n should return true if
     * the number is a multiple of 15
     * Examples:
     *  15 => true
     *  -15 => true
     *  30 => true
     *  0 => false
     *  40 => false
     */
    @Test
    public void whenMultipleOfFifteen() {
        FizzBuzz1 fb1 = new FizzBuzz1( 0, 0 );
        boolean result = false;

        int num = -33;
        result = fb1.isMultipleOfFifteen( num );
        assertEquals( false, result );

        num = -30;
        result = fb1.isMultipleOfFifteen( num );
        assertEquals( true, result );

        num = -20;
        result = fb1.isMultipleOfFifteen( num );
        assertEquals( false, result );

        num = -15;
        result = fb1.isMultipleOfFifteen( num );
        assertEquals( true, result );

        num = -9;
        result = fb1.isMultipleOfFifteen( num );
        assertEquals( false, result );

        num = -5;
        result = fb1.isMultipleOfFifteen( num );
        assertEquals( false, result );

        num = -3;
        result = fb1.isMultipleOfFifteen( num );
        assertEquals( false, result );

        num = -1;
        result = fb1.isMultipleOfFifteen( num );
        assertEquals( false, result );

        num = 0;
        result = fb1.isMultipleOfFifteen( num );
        assertEquals( false, result );

        num = 1;
        result = fb1.isMultipleOfFifteen( num );
        assertEquals( false, result );

        num = 3;
        result = fb1.isMultipleOfFifteen( num );
        assertEquals( false, result );

        num = 5;
        result = fb1.isMultipleOfFifteen( num );
        assertEquals( false, result );

        num = 9;
        result = fb1.isMultipleOfFifteen( num );
        assertEquals( false, result );

        num = 15;
        result = fb1.isMultipleOfFifteen( num );
        assertEquals( true, result );

        num = 20;
        result = fb1.isMultipleOfFifteen( num );
        assertEquals( false, result );

        num = 30;
        result = fb1.isMultipleOfFifteen( num );
        assertEquals( true, result );

        num = 33;
        result = fb1.isMultipleOfFifteen( num );
        assertEquals( false, result );
    }

    /**
     * Tests to validate the getOutputList() method
     * with a list of a single value: n - n
     * Examples:
     *  ( 0, 0 ) => 0
     *  ( 3, 3 ) => fizz
     *  ( 5, 5 ) => buzz
     *  ( -15, -15 ) => fizzbuzz
     */
    @Test
    public void whenSingleNumberInList() {
        FizzBuzz1 fb1 = new FizzBuzz1( -1, -1 );
        String expectedResult = "-1";
        String actualResult = fb1.getOutputList();
        assertEquals( expectedResult, actualResult );

        FizzBuzz1 fb2 = new FizzBuzz1( 0, 0 );
        expectedResult = "0";
        actualResult = fb2.getOutputList();
        assertEquals( expectedResult, actualResult );

        FizzBuzz1 fb3 = new FizzBuzz1( 2, 2 );
        expectedResult = "2";
        actualResult = fb3.getOutputList();
        assertEquals( expectedResult, actualResult );

        FizzBuzz1 fb4 = new FizzBuzz1( 3, 3 );
        expectedResult = MULTIPLE_OF_THREE_TEXT;
        actualResult = fb4.getOutputList();
        assertEquals( expectedResult, actualResult );

        FizzBuzz1 fb5 = new FizzBuzz1( 5, 5 );
        expectedResult = MULTIPLE_OF_FIVE_TEXT;
        actualResult = fb5.getOutputList();
        assertEquals( expectedResult, actualResult );

        FizzBuzz1 fb6 = new FizzBuzz1( 15, 15 );
        expectedResult = MULTIPLE_OF_FIFTEEN_TEXT;
        actualResult = fb6.getOutputList();
        assertEquals( expectedResult, actualResult );
    }

    @Test
    public void whenRangeOfNumbers() {
        FizzBuzz1 allNegative = new FizzBuzz1( -1, -15 );
        String expectedResult = MULTIPLE_OF_FIFTEEN_TEXT + " -14 -13 " + MULTIPLE_OF_THREE_TEXT
                           + " -11 " + MULTIPLE_OF_FIVE_TEXT + " " + MULTIPLE_OF_THREE_TEXT + " -8 -7 "
                           + MULTIPLE_OF_THREE_TEXT + " " + MULTIPLE_OF_FIVE_TEXT + " -4 " + MULTIPLE_OF_THREE_TEXT
                           + " -2 -1";
        String actualResult = allNegative.getOutputList();
        assertEquals( expectedResult, actualResult );

        FizzBuzz1 allPositive = new FizzBuzz1( 1, 15 );
        expectedResult = "1 2 " + MULTIPLE_OF_THREE_TEXT + " 4 " + MULTIPLE_OF_FIVE_TEXT
                        + " " + MULTIPLE_OF_THREE_TEXT + " 7 8 " + MULTIPLE_OF_THREE_TEXT
                        + " " + MULTIPLE_OF_FIVE_TEXT + " 11 " + MULTIPLE_OF_THREE_TEXT
                        + " 13 14 " + MULTIPLE_OF_FIFTEEN_TEXT;
        actualResult = allPositive.getOutputList();
        assertEquals( expectedResult, actualResult );

        FizzBuzz1 negativeToPositive = new FizzBuzz1( -15, 15 );
        expectedResult = MULTIPLE_OF_FIFTEEN_TEXT + " -14 -13 " + MULTIPLE_OF_THREE_TEXT + " -11 " + MULTIPLE_OF_FIVE_TEXT
                       + " " + MULTIPLE_OF_THREE_TEXT + " -8 -7 " + MULTIPLE_OF_THREE_TEXT
                       + " " + MULTIPLE_OF_FIVE_TEXT + " -4 " + MULTIPLE_OF_THREE_TEXT + " -2 -1 0 1 2 "
                       + MULTIPLE_OF_THREE_TEXT + " 4 " + MULTIPLE_OF_FIVE_TEXT + " " + MULTIPLE_OF_THREE_TEXT
                       + " 7 8 " + MULTIPLE_OF_THREE_TEXT + " " + MULTIPLE_OF_FIVE_TEXT + " 11 "
                       + MULTIPLE_OF_THREE_TEXT + " 13 14 " + MULTIPLE_OF_FIFTEEN_TEXT;
        actualResult = negativeToPositive.getOutputList();
        assertEquals( expectedResult, actualResult );
    }

    /**
     * Tests to validate the toString() method
     * which generates the String output of the list
     */
    @Test
    public void testToString() {
        FizzBuzz1 allNegative = new FizzBuzz1( -1, -15 );
        String expectedResult = MULTIPLE_OF_FIFTEEN_TEXT + " -14 -13 " + MULTIPLE_OF_THREE_TEXT
                       + " -11 " + MULTIPLE_OF_FIVE_TEXT + " " + MULTIPLE_OF_THREE_TEXT + " -8 -7 "
                       + MULTIPLE_OF_THREE_TEXT + " " + MULTIPLE_OF_FIVE_TEXT + " -4 " + MULTIPLE_OF_THREE_TEXT
                       + " -2 -1";
        String actualResult = allNegative.toString();
        assertEquals( expectedResult, actualResult );

        FizzBuzz1 allPositive = new FizzBuzz1( 1, 15 );
        expectedResult = "1 2 " + MULTIPLE_OF_THREE_TEXT + " 4 " + MULTIPLE_OF_FIVE_TEXT
                       + " " + MULTIPLE_OF_THREE_TEXT + " 7 8 " + MULTIPLE_OF_THREE_TEXT
                       + " " + MULTIPLE_OF_FIVE_TEXT + " 11 " + MULTIPLE_OF_THREE_TEXT
                       + " 13 14 " + MULTIPLE_OF_FIFTEEN_TEXT;
        actualResult = allPositive.toString();
        assertEquals( expectedResult, actualResult );

        FizzBuzz1 negativeToPositive = new FizzBuzz1( -15, 15 );
        expectedResult = MULTIPLE_OF_FIFTEEN_TEXT + " -14 -13 " + MULTIPLE_OF_THREE_TEXT + " -11 " + MULTIPLE_OF_FIVE_TEXT
                       + " " + MULTIPLE_OF_THREE_TEXT + " -8 -7 " + MULTIPLE_OF_THREE_TEXT
                       + " " + MULTIPLE_OF_FIVE_TEXT + " -4 " + MULTIPLE_OF_THREE_TEXT + " -2 -1 0 1 2 "
                       + MULTIPLE_OF_THREE_TEXT + " 4 " + MULTIPLE_OF_FIVE_TEXT + " " + MULTIPLE_OF_THREE_TEXT
                       + " 7 8 " + MULTIPLE_OF_THREE_TEXT + " " + MULTIPLE_OF_FIVE_TEXT + " 11 "
                       + MULTIPLE_OF_THREE_TEXT + " 13 14 " + MULTIPLE_OF_FIFTEEN_TEXT;
        actualResult = negativeToPositive.toString();
        assertEquals( expectedResult, actualResult );
    }
}
