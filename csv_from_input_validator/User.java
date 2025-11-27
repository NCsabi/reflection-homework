package csv_from_input_validator;

public class User {
    private String username;
    private String email;
    private String comment;

    public User(String username, String email, String comment) {
        this.username = username;
        this.email = email;
        this.comment = comment;
    }

    @Override
    public String toString() {
        return String.format(
                "Username: %s, " + "Email: %s, " + "Comment %s",
                username, email, comment
        );
    }
}
