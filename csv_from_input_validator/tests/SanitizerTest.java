package csv_from_input_validator.tests;

import csv_from_input_validator.Sanitizer;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SanitizerTest {
    @ParameterizedTest
    @CsvSource({
            "'Hello <b>world<b>', Hello world",
            "'flawless text', 'flawless text'"
    })
    void testSanitizeRemovesHtmlTags(String input, String expected) {
        String result = Sanitizer.sanitize(input);
        assertEquals(expected, result);
    }
}
