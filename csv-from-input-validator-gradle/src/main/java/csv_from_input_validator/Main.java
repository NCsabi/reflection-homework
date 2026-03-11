package csv_from_input_validator;

public class Main {
    public static void main(String[] args) throws Exception {
        UserCommentParser parser = new UserCommentParser();
        String path = "src/main/resources/sample.csv";
        var users = parser.parse(path);
        users.forEach(System.out::println);
    }
}
