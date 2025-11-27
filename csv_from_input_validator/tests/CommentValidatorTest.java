package csv_from_input_validator.tests;


import csv_from_input_validator.validators.CommentValidator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CommentValidatorTest {
    private final CommentValidator validator = new CommentValidator();

    @ParameterizedTest
    @ValueSource(strings = {"Hello World", "The ticket is 100$", "Abcd_1234!?"})
    void validComments(String comment) {
        assertTrue(validator.isValid(comment), "Should be valid: " + comment);
    }

    @ParameterizedTest
    @ValueSource(strings = {"<script>", "bad#comment", "wrong ch@racter"})
    void invalidComments(String comment) {
        assertFalse(validator.isValid(comment), "Should be invalid: " + comment);
    }
}
