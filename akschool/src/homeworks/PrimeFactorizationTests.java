package homeworks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

public class PrimeFactorizationTests {
    @ParameterizedTest
    @CsvSource({"0, false", "1, false", "2,true", "3,true"})
    void shouldInitializeBooleanListCorrectly(int number, boolean expected) {
        int num = 28;
        List<Boolean> result = PrimeFactorization.initializeBooleanList(num);
        Assertions.assertEquals(expected, result.get(number));
    }

    @ParameterizedTest
    @CsvSource({"0, false", "1, false", "2, true", "4, false", "6, false", "7, true", "11, true"})
    void shouldCorrectlyMarkPrimes(int number, boolean expected) {
        int num = 100;
        List<Boolean> result = PrimeFactorization.isSievePrimeFlags(num);
        Assertions.assertEquals(expected, result.get(number));
    }

    @ParameterizedTest
    @CsvSource({"0, 2", "1, 3", "6, 17", "8, 23"})
    void testGeneratePrimeList(int number, int expected) {
        int num = 100;
        List<Integer> result = PrimeFactorization.generatePrimeList(num);
        Assertions.assertEquals(expected, result.get(number));
    }

    @ParameterizedTest
    @CsvSource({"0, 2", "1, 2", "2,5", "3,5"})
    void testPrimeFactorization(int number, int expected) {
        int num = 100;
        List<Integer> result = PrimeFactorization.primeFactorization(num);
        Assertions.assertEquals(expected, result.get(number));
    }
}
