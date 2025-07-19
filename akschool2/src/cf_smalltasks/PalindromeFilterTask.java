package cf_smalltasks;

import java.util.ArrayList;
import java.util.List;

public class PalindromeFilterTask {
    public static void main(String[] args) {
        List<String> words = List.of("madam", "level", "chair", "noon", "morning");
        System.out.println(filterPalindromes(words));

    }

    public static List<String> filterPalindromes(List<String> words) {
        List<String> palindromes = new ArrayList<>();
        for (String word : words) {
            StringBuilder sb = new StringBuilder(word);
            String reversed = sb.reverse().toString();
            if (reversed.equalsIgnoreCase(word)) {
                palindromes.add(word);
            }
        }
        return palindromes;
    }
}
