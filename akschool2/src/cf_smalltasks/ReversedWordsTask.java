package cf_smalltasks;

import java.util.ArrayList;
import java.util.List;

public class ReversedWordsTask {
    public static void main(String[] args) {
        List<String> words = List.of("one", "two", "three", "four", "five", "six");

    }

    public static List<String> reverseWords(List<String> words) {
        List<String> reverseWords = new ArrayList<>();
        for (String word : words) {
            StringBuilder sb = new StringBuilder(word);
            String reversed = sb.reverse().toString();
            reverseWords.add(reversed);
        }
        return reverseWords;
    }
}
