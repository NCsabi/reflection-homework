package validator;

public class CommentValidator implements Validator<String> {
    @Override
    public boolean isValid(String text) {
        return text.matches("[A-Za-z0-9 _\\-!?.$]+");
    }
}
