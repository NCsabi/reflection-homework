package csv_from_input_validator.tests;

import csv_from_input_validator.validators.UsernameValidator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UsernameValidatorTest {
    private final UsernameValidator validator = new UsernameValidator();

    @ParameterizedTest
    @ValueSource(strings = {"john", "John111", "johny22", "JOHN2020", "abcDEF1234"})
    void validUsernames(String username) {
        assertTrue(validator.isValid(username), "Should be valid: " + username);
    }

    @ParameterizedTest
    @ValueSource(strings = {"john_doe", "john-doe", "john.doe", "john doe"})
    void invalidUsernames(String username) {
        assertFalse(validator.isValid(username), "Should be invalid: " + username);
    }

}
