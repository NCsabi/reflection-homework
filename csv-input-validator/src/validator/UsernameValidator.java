package validator;

public class UsernameValidator implements Validator<String> {
    @Override
    public boolean isValid(String text) {
        return text.matches("[A-Za-z0-9]+");
    }
}
