package cfsmalltasks.task2;

import java.util.List;
import java.util.stream.Collectors;

public class WordReverser {
    public static List<String> reverseWords(List<String> words) {
        return words.stream()
                .map(w -> new StringBuilder(w)
                        .reverse()
                        .toString())
                .collect(Collectors.toList());
    }
}
