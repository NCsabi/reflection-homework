package cfsmalltasks.task3;

import java.util.List;
import java.util.stream.Collectors;

public class PalindromeUtils {
    public static List<String> findPalindromes(List<String> words) {
        return words.stream()
                .filter(w -> w.contentEquals(new StringBuilder(w)
                        .reverse()))
                .collect(Collectors.toList());
    }
}
