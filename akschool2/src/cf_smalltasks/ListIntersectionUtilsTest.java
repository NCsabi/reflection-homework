package cf_smalltasks;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ListIntersectionUtilsTest {
    @Test
    public void testGetIntersectionWithCommonElements() {
        List<Integer> list1 = Arrays.asList(2, 4, 6, 8, 10);
        List<Integer> list2 = List.of(5, 6, 7, 8, 9);

        List<Integer> expected = Arrays.asList(6, 8);
        List<Integer> result = ListIntersectionUtils.getIntersection(list1, list2);

        assertEquals(expected, result);
    }

    @Test
    public void testGetIntersectionWithNoCommonElements() {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> list2 = Arrays.asList(5, 6, 7, 8);

        List<Integer> expected = List.of();
        List<Integer> result = ListIntersectionUtils.getIntersection(list1, list2);

        assertEquals(expected, result);
    }
}
