package cfsmalltasks.task1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Intersection {
    public static <T> List<T> findIntersection(List<T> first, List<T> second) {
        Set<T> set = new HashSet<>(second);
        return first.stream()
                .filter(set::contains)
                .collect(Collectors.toList());
    }
}
