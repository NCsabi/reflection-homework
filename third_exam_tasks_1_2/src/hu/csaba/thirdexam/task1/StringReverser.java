package hu.csaba.thirdexam.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringReverser {
    public static List<String> reverseEveryThirdString(List<String> text) {
        if (text.size() < 3) {
            return new ArrayList<>(text);
        }
        List<String> reversedStrings = new ArrayList<>();
        for (int i = 2; i < text.size(); i += 3) {
            String reversed = new StringBuilder(text.get(i)).reverse().toString();
            reversedStrings.add(reversed);
        }
        Collections.reverse(reversedStrings);
        List<String> result = new ArrayList<>(text);
        int index = 0;
        for (int i = 2; i < result.size(); i += 3) {
            result.set(i, reversedStrings.get(index++));
        }
        return result;
    }
}
