package csv_from_input_validator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class SanitizerTest {

    @Test
    void removesHtmlTags() {
        assertEquals("Hello", Sanitizer.sanitize("<b>Hello</b>"));
        assertEquals("Test", Sanitizer.sanitize("<script>alert(1)</script>Test"));
    }

    @Test
    void handlesNull() {
        assertNull(Sanitizer.sanitize(null));
    }

    @Test
    void leavesCleanTextUntouched() {
        assertEquals("Hello world", Sanitizer.sanitize("Hello world"));
    }
}
