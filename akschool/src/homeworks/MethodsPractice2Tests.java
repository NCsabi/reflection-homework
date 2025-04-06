package homeworks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MethodsPractice2Tests {
    @ParameterizedTest
    @CsvSource({"100, 30", "200, 60", "140, 42", "30,9"})
    void testCalculateThirtyPercent(double number, double expected) {
        double result = MethodsPractice2.calculateThirtyPercent(number);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({"100,42.8", "200,85.6", "150,64.2"})
    void testCalculateFortyTwoPointEightPercent(int number, double expected) {
        double result = MethodsPractice2.calculateFortyTwoPointEightPercent(number);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({"one, 6", "two, 6", "three, 10", "four, 8"})
    void testDoubleStringLength(String word, int expected) {
        int result = MethodsPractice2.doubleStringLength(word);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({"10,15,5", "30,45,15", "100,200,100"})
    void testCalculateDifferenceToTarget(int firstNumber, int secondNumber, int expected) {
        int result = MethodsPractice2.calculateDifferenceToTarget(firstNumber, secondNumber);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void testCalculateSquareRotOfLength() {
        String word = "Java";
        int result = MethodsPractice2.calculateSquareRootOfLength(word);
        Assertions.assertEquals(16, result);
    }

    @Test
    void testCalculateFactorialOfLength() {
        String word = "Java";
        int result = MethodsPractice2.calculateFactorialOfLength(word);
        Assertions.assertEquals(24, result);
    }

    @ParameterizedTest
    @CsvSource({"50, 2", "40,2.5", "100,1", "25,4"})
    void testCalculateHundredDividedByNumber(int number, double expected) {
        double result = MethodsPractice2.calculateHundredDividedByNumber(number);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({"11,121", "2,4", "3,9", "7,49", "12,24", "4,8", "8,16", "9, 27", "10,30"})
    void testProcessNumberByRules(int number, int expected) {
        int result = MethodsPractice2.processNumberByRules(number);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void testCalculateStringLength() {
        int[] expected = {3, 3, 5, 4};
        Assertions.assertArrayEquals(expected, MethodsPractice2.calculateStringLength("one", "two", "three", "four"));
    }

    @ParameterizedTest
    @CsvSource({"100000, 66500.0", "200000, 133000"})
    void testCalculateNetSalary(int number, double expected) {
        Assertions.assertEquals(expected, MethodsPractice2.calculateNetSalary(number));
    }

    @Test
    void testCalculateXor() {
        boolean[] booleans = {false, true, true, false};
        Assertions.assertFalse(MethodsPractice2.calculateXor(booleans));
    }

    @Test
    void testCalculateXor2() {
        boolean[] booleans = {true, true, true, false};
        Assertions.assertTrue(MethodsPractice2.calculateXor(booleans));
    }

    @Test
    void testCalculateXor3() {
        boolean[] booleans = {true, true, true, true};
        Assertions.assertFalse(MethodsPractice2.calculateXor(booleans));
    }

    @Test
    void testFilterNegativeNumbers() {
        int[] expected = {-22, -8, -5, -19};
        Assertions.assertArrayEquals(expected, MethodsPractice2.filterNegativeNumbers(12, 33, 42, 23, -22, -8, -5, -19, 7, 2));
    }
}