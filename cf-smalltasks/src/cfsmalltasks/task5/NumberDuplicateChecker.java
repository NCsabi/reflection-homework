package cfsmalltasks.task5;

import java.util.List;

public class NumberDuplicateChecker {
    public static boolean hasDuplicates(List<Integer> numbers) {
        return numbers.stream()
                .distinct()
                .count() < numbers.size();
    }
}