package csv_from_input_validator.validators;

public class UsernameValidator implements Validator<String> {
    @Override
    public boolean isValid(String text) {
        return text.matches("[A-Za-z0-9]+");
    }
}
