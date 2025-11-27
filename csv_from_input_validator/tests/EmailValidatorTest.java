package csv_from_input_validator.tests;

import csv_from_input_validator.validators.EmailValidator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EmailValidatorTest {
    private final EmailValidator validator = new EmailValidator();

    @Test
    void validSimpleEmailReturnsTrue() {
        assertTrue(validator.isValid("test@example.com"));
    }

    @Test
    void validWithDotInLocalPartReturnsTrue() {
        assertTrue(validator.isValid("john.doe@example.org"));
    }

    @Test
    void validWithPlusInLocalPartReturnsTrue() {
        assertTrue(validator.isValid("test+code@example.hu"));
    }

    @Test
    void invalidMissingAtSymbolReturnFalse() {
        assertFalse(validator.isValid("john.example.org"));
    }

    @Test
    void invalidMissingTldDotReturnsFalse() {
        assertFalse(validator.isValid("john@com"));
    }

    @Test
    void invalidTldTooShortReturnsFalse() {
        assertFalse(validator.isValid("john@example.c"));
    }

    @Test
    void invalidEmptyLocalPartReturnsFalse() {
        assertFalse(validator.isValid("@example.hu"));
    }

    @Test
    void invalidForbiddenCharsInLocalPartReturnsFalse() {
        assertFalse(validator.isValid("john(@example.c0m"));
    }
}