package homeworks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ExamPracticeLargeSecondTests {
    @Test
    void testGeneratePerfectSquaresAndSumEveryFifth() {
        List<Integer> expected = List.of(1, 4, 9, 16, 25, 36, 49);
        Assertions.assertEquals(expected, ExamPracticeLargeSecond.generatePerfectSquaresAndSumEveryFifth(60));
    }
}
