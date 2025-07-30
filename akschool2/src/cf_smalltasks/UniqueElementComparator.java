package cf_smalltasks;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueElementComparator {
    public static void main(String[] args) {
        List<Integer> firstList = List.of(1, 2, 3, 4, 5);
        List<Integer> secondList = List.of(1, 1, 2, 3, 4);
        System.out.println("The bigger list is: " + compareUniqueCounts(firstList, secondList));

    }

    public static int compareUniqueCounts(List<Integer> firstList, List<Integer> secondList) {
        Set<Integer> uniqueFirstList = new HashSet<>(firstList);
        Set<Integer> uniqueSecondList = new HashSet<>(secondList);
        if (uniqueFirstList.size() > uniqueSecondList.size()) {
            return 1;
        } else if (uniqueFirstList.size() < uniqueSecondList.size()) {
            return 2;
        } else {
            return 0;
        }
    }
}
