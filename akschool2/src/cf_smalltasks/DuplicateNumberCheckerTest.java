package cf_smalltasks;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class DuplicateNumberCheckerTest {
    @Test
    public void shouldReturnTrueWhenListContainsDuplicateNumbers() {
        List<Integer> numbers = Arrays.asList(1, 1, 2, 3, 4);
        boolean expected = true;

        boolean result = DuplicateNumberChecker.isDuplicates(numbers);

        assertEquals(expected, result);

    }

    @Test
    public void shouldReturnFalseWhenListNoContainsDuplicateNumbers() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        boolean expected = false;

        boolean result = DuplicateNumberChecker.isDuplicates(numbers);

        assertEquals(expected, result);
    }

    @Test
    public void shouldReturnTrueWhenAllNumbersAreSame() {
        List<Integer> numbers = List.of(3, 3, 3, 3);
        boolean expected = true;

        boolean result = DuplicateNumberChecker.isDuplicates(numbers);

        assertEquals(expected, result);
    }

    @Test
    public void shouldReturnFalseWhenListHasOneElement() {
        List<Integer> number = List.of(12);
        boolean expected = false;

        boolean result = DuplicateNumberChecker.isDuplicates(number);

        assertEquals(expected, result);
    }

}
