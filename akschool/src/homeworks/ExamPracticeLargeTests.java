package homeworks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ExamPracticeLargeTests {
    @Test
    void testGenerateFactorialListAndSumEverySecond() {
        List<Long> expected = List.of(1L, 1L, 2L, 6L);
        Assertions.assertEquals(expected, ExamPracticeLarge.generateFactorialListAndSumEverySecond(21));
    }

    @Test
    void testSumEverySecondValue() {
        List<Long> numbers = List.of(1L, 1L, 2L, 6L, 24L, 120L, 720L, 5040L);
        Assertions.assertEquals(5167, ExamPracticeLarge.sumEverySecondValue(numbers));
    }
}
