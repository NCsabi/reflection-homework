package cf_smalltasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ListIntersectionUtils {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16, 18, 20);
        List<Integer> list2 = List.of(3, 6, 9, 12, 15, 18, 21, 24, 27, 30);
        System.out.println(getIntersection(list1, list2));

    }

    public static List<Integer> getIntersection(List<Integer> listFirst, List<Integer> listSecond) {
        List<Integer> intersection = new ArrayList<>();
        for (Integer number : listFirst) {
            for (Integer num : listSecond) {
                if (Objects.equals(number, num)) {
                    intersection.add(number);
                }
            }
        }
        return intersection;
    }
}
