package homeworks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class PrimeListerTests {
    @ParameterizedTest
    @CsvSource({"2,1", "50,15", "15,6", "2,1", "50_000_000, 3_001_134"})
    void testCountingPrimes(int number, int expected) {
        int result = PrimeLister.countingPrimes(number);
        Assertions.assertEquals(expected, result);

    }

    @Test
    void testPrimesArrayNumber15() {
        int number = 15;
        int[] expected = {2, 3, 5, 7, 11, 13};
        int[] result = PrimeLister.extractPrimesToArray(number);
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    void testPrimesArrayNumber2() {
        int number = 2;
        int[] expected = {2};
        int[] result = PrimeLister.extractPrimesToArray(number);
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    void testPrimesArrayNumber500() {
        int number = 500;
        int[] expected = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31,
                37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89,
                97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149,
                151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199,
                211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269,
                271, 277, 281, 283, 293, 307, 311, 313, 317, 331, 337,
                347, 349, 353, 359, 367, 373, 379, 383, 389, 397, 401,
                409, 419, 421, 431, 433, 439, 443, 449, 457, 461,
                463, 467, 479, 487, 491, 499};
        int[] result = PrimeLister.extractPrimesToArray(number);
        Assertions.assertArrayEquals(expected, result);
    }
}
