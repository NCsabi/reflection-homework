package cf_smalltasks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class DuplicateNumberChecker {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println(isDuplicates(numbers));

    }

    public static boolean isDuplicates(List<Integer> numbers) {
        HashSet<Integer> num = new HashSet<>();
        for (Integer number : numbers) {
            if (!num.add(number)) {
                return true;
            }
        }
        return false;
    }
}
