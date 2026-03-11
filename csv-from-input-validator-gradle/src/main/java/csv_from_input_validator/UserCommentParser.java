package csv_from_input_validator;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class UserCommentParser {
    private final EmailValidator emailValidator = new EmailValidator();
    private final UsernameValidator usernameValidator = new UsernameValidator();
    private final CommentValidator commentValidator = new CommentValidator();

    public List<User> parse(String path) {
        List<User> users = new ArrayList<>();

        try (CSVReader reader = new CSVReaderBuilder(new FileReader(path))
                .withSkipLines(1)
                .build()) {
            String[] line;
            while ((line = reader.readNext()) != null) {
                String username = Sanitizer.sanitize(line[0]);
                String email = Sanitizer.sanitize(line[1]);
                String comment = Sanitizer.sanitize(line[2]);

                boolean valid = usernameValidator.isValid(username) &&
                        emailValidator.isValid(email) &&
                        commentValidator.isValid(comment);
                if (valid) {
                    users.add(new User(username, email, comment));
                } else {
                    System.err.println("Invalid row: " + String.join(",", line));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return users;
    }
}
