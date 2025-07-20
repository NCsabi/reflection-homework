package cf_smalltasks;

import java.util.HashSet;

public class UniqueCharacterCounter {
    public static void main(String[] args) {
        System.out.println(countUniqueCharacters("aabbbc"));

    }

    public static int countUniqueCharacters(String input) {
        HashSet<Character> numbers = new HashSet<>();
        for (int i = 0; i < input.length(); i++) {
            numbers.add(input.charAt(i));
        }
        return numbers.size();
    }
}
