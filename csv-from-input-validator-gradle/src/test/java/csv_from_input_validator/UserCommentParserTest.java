package csv_from_input_validator;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserCommentParserTest {

    @Test
    void parsersValidRows() {
        UserCommentParser parser = new UserCommentParser();
        String path = "src/test/resources/test.csv";
        List<User> users = parser.parse(path);
        assertEquals(1, users.size());
        assertEquals("john", users.get(0).getUsername());
    }
}
