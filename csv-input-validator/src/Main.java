import model.User;
import parser.UserCommentParser;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserCommentParser parser = new UserCommentParser();
        List<User> users = parser.readCsv("C:\\docs\\sample.csv");
        for (User user : users) {
            System.out.println(user);
        }

    }
}