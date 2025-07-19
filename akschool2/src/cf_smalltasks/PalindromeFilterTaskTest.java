package cf_smalltasks;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PalindromeFilterTaskTest {
    @Test
    public void testFilterPalindromesWithMixedWords() {
        List<String> input = Arrays.asList("noon", "bird", "radar", "racecar", "table");
        List<String> expected = Arrays.asList("noon", "radar", "racecar");

        List<String> actual = PalindromeFilterTask.filterPalindromes(input);

        assertEquals(expected, actual);
    }

    @Test
    public void testFilterPalindromesWithOnlyPalindromes() {
        List<String> input = Arrays.asList("level", "noon", "madam");
        List<String> expected = Arrays.asList("level", "noon", "madam");

        List<String> actual = PalindromeFilterTask.filterPalindromes(input);

        assertEquals(expected, actual);
    }

    @Test
    public void testFilterPalindromesWithNoPalindromes() {
        List<String> input = List.of("bird", "building", "door");
        List<String> expected = List.of();

        List<String> actual = PalindromeFilterTask.filterPalindromes(input);

        assertEquals(expected, actual);
    }

    @Test
    public void testFilterPalindromeWithEmptyList() {
        List<String> input = List.of();
        List<String> expected = List.of();

        List<String> actual = PalindromeFilterTask.filterPalindromes(input);

        assertEquals(expected, actual);
    }
}
