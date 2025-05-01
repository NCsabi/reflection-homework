package homeworks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstMockExamTests {
    @Test
    void testCalculateAlternatingSum() {
        long[] numbers = {1, 2, 3, 4};
        Assertions.assertEquals(-3, FirstMockExam.calculateAlternatingSum(numbers));
    }

    @Test
    void testCalculateAlternatingSumForZero() {
        long[] numbers = {0};
        Assertions.assertEquals(0, FirstMockExam.calculateAlternatingSum(numbers));
    }
}
