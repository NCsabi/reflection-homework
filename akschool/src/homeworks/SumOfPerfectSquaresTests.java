package homeworks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class SumOfPerfectSquaresTests {
    @ParameterizedTest
    @CsvSource({"2,5", "3,14", "5,55", "10,385", "1000,333833500"})
    void testCalculatedSum(int number, int expected) {
        int result = SumOfPerfectSquares.calculateSumOfPerfectSquares(number);
        Assertions.assertEquals(expected, result);
    }
}
