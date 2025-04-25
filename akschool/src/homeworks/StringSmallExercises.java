package homeworks;

public class StringSmallExercises {
    public static void main(String[] args) {
        String mixedString = "gjbnBnBBoijdBBsd";
        String mixedHelloString = "ahElloeorldhelloaworldHELLOhello";
        System.out.println(countOccurrencesOfB(mixedString));
        System.out.println(countOccurrences(mixedHelloString));
    }

    public static int countOccurrencesOfB(String mixedString) {
        int counter = 0;
        for (int i = 0; i < mixedString.length(); i++) {
            if (mixedString.charAt(i) == 'B') {
                counter++;
            }
        }
        return counter;
    }

    public static int countOccurrences(String word) {
        int counter = 0;
        String text = "hello";
        for (int i = 0; i <= word.length() - text.length(); i++) {
            if (text.equals(word.substring(i, i + text.length()))) {
                counter++;
            }
        }
        return counter;
    }
}