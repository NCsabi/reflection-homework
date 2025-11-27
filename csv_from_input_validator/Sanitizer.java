package csv_from_input_validator;

public class Sanitizer {
    public static String sanitize(String input) {
        return input.replaceAll("<.*?>", "");
    }
}
