package csv_from_input_validator;

public class CommentValidator implements Validator<String> {
    @Override
    public boolean isValid(String text) {
        if (text == null) return false;
        return text.matches("[A-Za-z0-9 _\\-!?.$]+");
    }
}
