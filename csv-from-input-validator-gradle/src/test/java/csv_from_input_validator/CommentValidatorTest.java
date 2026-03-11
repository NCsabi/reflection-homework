package csv_from_input_validator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CommentValidatorTest {
    private final CommentValidator validator = new CommentValidator();

    @Test
    void validComments() {
        assertTrue(validator.isValid("Hello world"));
        assertTrue(validator.isValid("This_is-valid."));
        assertTrue(validator.isValid("Numbers 123"));
    }

    @Test
    void invalidComments() {
        assertFalse(validator.isValid("Invalid # comment"));
        assertFalse(validator.isValid("<script>bad</script"));
        assertFalse(validator.isValid(""));
        assertFalse(validator.isValid(null));
    }
}
