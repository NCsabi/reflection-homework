package homeworks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExamPracticeLargeThirdTest {
    @Test
    void testGenerateTribonacciSequence() {
        int[] expected = {19, 47, 101, 167, 315, 583, 1065, 1963, 3611, 6639};
        Assertions.assertArrayEquals(expected, generateTribonacciSequence());
    }

    public static int[] generateTribonacciSequence() {
        int[] numbers = {19, 47, 101, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 3; i < numbers.length; i++) {
            numbers[i] = numbers[i - 3] + numbers[i - 2] + numbers[i - 1];
        }
        return numbers;
    }
}