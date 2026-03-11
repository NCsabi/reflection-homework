package csv_from_input_validator;

public class Sanitizer {
    public static String sanitize(String input) {
        if (input == null) return null;
        //script blokkok teljes eltávolítása
        input = input.replaceAll("(?i)<script.*?>.*?</script>", "");
        //minden más HTML tag eltávolítása
        return input.replaceAll("<.*?>", "");
    }
}
