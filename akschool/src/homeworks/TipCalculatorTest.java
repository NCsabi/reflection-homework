package homeworks;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TipCalculatorTest {
    @Test
    void testTipPercentageBelowMinimum() {
        int number = 9;
        int result = TipCalculator.calculatePercent(number);
        Assertions.assertEquals(-1, result);
    }

    @Test
    void testTipPercentageUpperMaximum() {
        int number = 81;
        int result = TipCalculator.calculatePercent(number);
        Assertions.assertEquals(-1, result);
    }

    @Test
    void testTipPercentageBetweenMinimumAndMaximum() {
        int number = 45;
        int result = TipCalculator.calculatePercent(number);
        Assertions.assertEquals(45, result);
    }

    @Test
    void shouldReturnCorrectSumForArrayOfPrices() {
        int[] array = {2000, 250, 300, 50, 250};
        int result = TipCalculator.addPrices(array);
        Assertions.assertEquals(2850, result);
    }

    @Test
    void testArrayValuesMultipliedByPercentage() {
        int[] array = {2000, 250, 300, 50, 250};
        int tip = 10;
        int result = TipCalculator.calculateTip(array, tip);
        Assertions.assertEquals(285, result);
    }

    @Test
    void testReturningAValueForTooLowInput() {
        int[] array = {2000, 250, 300, 50, 250};
        int tip = 9;
        int result = TipCalculator.calculateTip(array, tip);
        Assertions.assertEquals(-1, result);
    }

    @Test
    void testReturningAValueForTooHighInput() {
        int[] array = {2000, 250, 300, 50, 250};
        int tip = 81;
        int result = TipCalculator.calculateTip(array, tip);
        Assertions.assertEquals(-1, result);
    }
}