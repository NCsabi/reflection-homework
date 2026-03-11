package csv_from_input_validator;

public class UsernameValidator implements Validator<String> {
    @Override
    public boolean isValid(String text) {
        if (text == null) return false;
        return text.matches("[A-Za-z0-9]+");
    }
}
