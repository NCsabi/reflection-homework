package homeworks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayFunTests {
    @Test
    void testCalculateEvenAverage() {
        double expected = 8.5;
        Assertions.assertEquals(expected, ArrayFun.calculateEvenAverage(10, 6, 9, 4, 55, 73, 14, 0));
    }

    @Test
    void testSquareOdds() {
        int[] expected = {81, 3025, 5329};
        Assertions.assertArrayEquals(expected, ArrayFun.squareOdds(10, 6, 9, 4, 55, 73, 14, 0));
    }

    @Test
    void testCountAStartingStrings() {
        int expected = 3;
        Assertions.assertEquals(expected, ArrayFun.countAStartingStrings("Apple", "almond", "door", "chair", "Africa"));
    }

    @Test
    void testCombineStringsOverThree() {
        String expected = "ApplealmonddoorchairAfrica";
        Assertions.assertEquals(expected, ArrayFun.combineStringsOverThree("Apple", "almond", "door", "chair", "pea", "Africa"));
    }

    @Test
    void testNoContainsConsecutiveDuplicates() {
        Assertions.assertFalse(ArrayFun.containsConsecutiveDuplicates(10, 6, 9, 4, 55, 73, 14, 0));
    }

    @Test
    void testContainsConsecutiveDuplicates() {
        Assertions.assertTrue(ArrayFun.containsConsecutiveDuplicates(10, 6, 6, 9, 4, 55, 73, 14, 0));
    }

    @Test
    void testGetTotalVowels() {
        String[][] texts = {
                {"one", "two", "three"},
                {"four", "five", "six"},
                {"seven", "eight", "nine"}
        };
        Assertions.assertEquals(16, ArrayFun.getTotalVowels(texts));
    }

    @Test
    void testSumOfLongestString() {
        String[][] texts = {
                {"one", "two", "three"},
                {"four", "five", "six"},
                {"seven", "eight", "nine"}
        };
        Assertions.assertEquals(14, ArrayFun.sumOfLongestString(texts));
    }

    @Test
    void testGetFlattenedUppercaseStrings() {
        String[][] texts = {
                {"one", "two", "three"},
                {"four", "five", "six"},
                {"seven", "eight", "nine"}
        };
        String[] expected = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"};
        Assertions.assertArrayEquals(expected, ArrayFun.getFlattenedUppercaseStrings(texts));
    }

    @Test
    void testIsDigitInStrings2DForFalse() {
        String[][] texts = {
                {"one", "two", "three"},
                {"four", "five", "six"},
                {"seven", "eight", "nine"}
        };
        boolean[][] expected = {
                {false, false, false},
                {false, false, false},
                {false, false, false}
        };
        Assertions.assertArrayEquals(expected, ArrayFun.isDigitInStrings2D(texts));
    }

    @Test
    void testIsDigitInStrings2DForTrue() {
        String[][] texts = {
                {"1one", "two", "three"},
                {"four", "five", "six"},
                {"seven", "eight", "nine"}
        };
        boolean[][] expected = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        Assertions.assertArrayEquals(expected, ArrayFun.isDigitInStrings2D(texts));
    }

    @Test
    void testCalculateAverageCharacters() {
        String[][] texts = {
                {"one", "two", "three"},
                {"four", "five", "six"},
                {"seven", "eight", "nine"}
        };
        Assertions.assertEquals(4.0, ArrayFun.calculateAverageCharacters(texts));
    }
}
