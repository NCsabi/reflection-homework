package validator;

public class EmailValidator implements Validator<String> {
    @Override
    public boolean isValid(String text) {
        return text.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
    }
}
