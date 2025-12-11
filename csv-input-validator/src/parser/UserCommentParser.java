package parser;

import model.User;
import sanitizer.Sanitizer;
import validator.CommentValidator;
import validator.EmailValidator;
import validator.UsernameValidator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class UserCommentParser {
    private final EmailValidator emailValidator = new EmailValidator();
    private final UsernameValidator usernameValidator = new UsernameValidator();
    private final CommentValidator commentValidator = new CommentValidator();

    public List<User> readCsv(String filePath) {
        List<User> users = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(Path.of(filePath));
            for (int i = 1; i < lines.size(); i++) {
                String text = lines.get(i);
                String[] splitLine = text.split(",");
                if (splitLine.length < 3) {
                    System.out.println("Invalid row: " + text);
                    continue;
                }
                String username = splitLine[0].trim();
                String email = splitLine[1].trim();
                String comment = Sanitizer.sanitize(splitLine[2].trim());
                boolean validUsername = usernameValidator.isValid(username);
                boolean validEmail = emailValidator.isValid(email);
                boolean validComment = commentValidator.isValid(comment);
                if (validUsername && validEmail && validComment) {
                    users.add(new User(username, email, comment));
                    System.out.println("Valid data: " + username + "," + email + "," + comment);
                } else {
                    System.out.println("Invalid data: " + username + "," + email + "," + comment);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return users;
    }

}
