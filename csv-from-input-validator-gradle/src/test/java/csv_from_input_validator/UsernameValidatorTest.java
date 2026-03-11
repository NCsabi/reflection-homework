package csv_from_input_validator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UsernameValidatorTest {
    private final UsernameValidator validator = new UsernameValidator();

    @Test
    void validUsernames() {
        assertTrue(validator.isValid("Jane111"));
        assertTrue(validator.isValid("Bob222"));
        assertTrue(validator.isValid("USER1"));
    }

    @Test
    void invalidUsers() {
        assertFalse(validator.isValid("Jane Doe"));
        assertFalse(validator.isValid("Jane!"));
        assertFalse(validator.isValid(""));
        assertFalse(validator.isValid(null));
    }
}
