package tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import validator.EmailValidator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmailValidatorTest {
    private final EmailValidator validator = new EmailValidator();

    @ParameterizedTest
    @CsvSource({
            "john@example.com, true",
            "john.doe@example.org, true",
            "test+code@example.hu, true",

            "john.example.org, false",
            "john@com, false",
            "john@example.c, false",
            "@example.hu, false",
            "john(@example.c0m, false"
    })
    void emailValidation(String email, boolean expected) {
        assertEquals(expected, validator.isValid(email));
    }
}
