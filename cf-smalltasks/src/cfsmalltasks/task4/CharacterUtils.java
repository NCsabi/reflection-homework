package cfsmalltasks.task4;

import java.util.HashSet;
import java.util.Set;

public class CharacterUtils {

    public static int countDistinctCharacters(String text) {
        Set<Character> seen = new HashSet<>();
        for (char character : text.toCharArray()) {
            seen.add(character);
        }
        return seen.size();
    }

    public static int countCharactersOccurringOnce(String text) {
        Set<Character> seen = new HashSet<>();
        Set<Character> duplicates = new HashSet<>();
        for (char character : text.toCharArray()) {
            if (!seen.add(character)) {
                duplicates.add(character);
            }
        }
        seen.removeAll(duplicates);
        return seen.size();
    }
}
