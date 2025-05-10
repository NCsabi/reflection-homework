package homeworks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ExamPracticeSmallTests {
    @Test
    void testIsPerfectSquareAndEven() {
        int[] numbers = {5, 6, 25, 36, 10};
        boolean[] expected = {false, false, false, true, false};
        Assertions.assertArrayEquals(expected, ExamPracticeSmall.isPerfectSquareAndEven(numbers));
    }

    @Test
    void testCalculateSqrtDifference() {
        int[] numbers = {5, 12, 3, 6, 8, 9};
        Assertions.assertEquals(3.0, ExamPracticeSmall.calculateSqrtDifference(numbers));
    }

    @Test
    void testCalculateEvenODDDifference() {
        List<Integer> numbers = List.of(2, 3, 4, 5, 6, 7);
        Assertions.assertEquals(-3, ExamPracticeSmall.calculateEvenOddDifference(numbers));
    }

    @Test
    void testFindMaxDifference() {
        int[] numbers = {3, -7, 1};
        Assertions.assertEquals(10, ExamPracticeSmall.findMaxDifference(numbers));
    }
}