package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import validator.UsernameValidator;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UsernameValidatorTest {
    private final UsernameValidator validator = new UsernameValidator();

    @ParameterizedTest
    @ValueSource(strings = {"john", "john111", "johny22", "JOHN2020", "abcDEF1234"})
    void validUsernames(String username) {
        assertTrue(validator.isValid(username), "Should be valid: " + username);
    }

    @ParameterizedTest
    @ValueSource(strings = {"john_doe", "john-doe", "john.doe", "john doe"})
    void invalidUsernames(String username) {
        assertFalse(validator.isValid(username), "Should be invalid: " + username);
    }
}
