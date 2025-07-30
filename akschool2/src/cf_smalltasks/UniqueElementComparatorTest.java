package cf_smalltasks;

import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UniqueElementComparatorTest {
    @Test
    public void shouldReturn1WhenFirstListHasMoreUniqueElements() {
        List<Integer> first = List.of(1, 2, 3, 4);
        List<Integer> second = List.of(1, 1, 2, 3);
        int result = UniqueElementComparator.compareUniqueCounts(first, second);
        assertEquals(1, result);
    }

    @Test
    public void shouldReturn2WhenSecondListHasMoreUniqueElements() {
        List<Integer> first = List.of(1, 1, 2, 3);
        List<Integer> second = List.of(1, 2, 3, 4);
        assertEquals(2, UniqueElementComparator.compareUniqueCounts(first, second));
    }

    @Test
    public void shouldReturn0WhenListsHaveEqualUniqueElements() {
        List<Integer> first = List.of(1, 2, 3, 4);
        List<Integer> second = List.of(1, 2, 3, 4);
        assertEquals(0, UniqueElementComparator.compareUniqueCounts(first, second));
    }

    @Test
    public void shouldReturn0ForTwoEmptyLists() {
        List<Integer> first = List.of();
        List<Integer> second = List.of();
        assertEquals(0, UniqueElementComparator.compareUniqueCounts(first, second));
    }
}
