package cfsmalltasks.task6;

import java.util.List;

public class UniqueCounter {
    public static <T> int compareUniqueCounts(List<T> first, List<T> second) {
        long unique1 = first.stream()
                .distinct()
                .count();
        long unique2 = second.stream()
                .distinct().count();
        if (unique1 > unique2)
            return 1;
        if (unique1 < unique2)
            return 2;
        return 0;
    }
}

