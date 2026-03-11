package csv_from_input_validator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EmailValidatorTest {

    private final EmailValidator validator = new EmailValidator();

    @Test
    void validEmails() {
        assertTrue(validator.isValid("jane@example.com"));
        assertTrue(validator.isValid("a.b-c_d+e@domain.co"));
    }

    @Test
    void invalidEmails() {
        assertFalse(validator.isValid("janeexample.com"));
        assertFalse(validator.isValid("jane@"));
        assertFalse(validator.isValid("@example.com"));
        assertFalse(validator.isValid(""));
        assertFalse(validator.isValid(null));
    }
}
