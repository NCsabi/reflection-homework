package homeworks;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringSmallExercisesTests {
    @ParameterizedTest
    @CsvSource({"gjbnBnBBoijdBBsd, 5", "BBoijdB, 3", "gjbn, 0", "BBsd, 2"})
    void testCountOccurrencesOfB(String text, int expected) {
        assertEquals(expected, StringSmallExercises.countOccurrencesOfB(text));
    }

    @ParameterizedTest
    @CsvSource({"ahElloeorldhelloaworldHELLOhello, 2", "ahElloeorldhell, 0", "ello, 0", "HELLOhello, 1"})
    void testCountOccurrences(String text, int expected) {
        assertEquals(expected, StringSmallExercises.countOccurrences(text));
    }
}
