package cfsmalltasks.task3;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeUtilsTest {
    @Test
    void shouldReturnAllWordsWhenAllArePalindromes() {
        List<String> input = List.of("racecar", "madam", "radar");
        List<String> expected = List.of("racecar", "madam", "radar");
        List<String> result = PalindromeUtils.findPalindromes(input);
        assertEquals(result, expected);
    }

    @Test
    void shouldReturnEmptyListWhenNoPalindromesPresent() {
        List<String> input = List.of("window", "bird", "tree");
        List<String> result = PalindromeUtils.findPalindromes(input);
        assertTrue(result.isEmpty());
    }

    @Test
    void shouldReturnOnlyPalindromesWhenMixedInputProvided() {
        List<String> input = List.of("madam", "cat", "radar", "dog");
        List<String> expected = List.of("madam", "radar");
        List<String> result = PalindromeUtils.findPalindromes(input);
        assertEquals(result, expected);
    }

    @Test
    void shouldReturnEmptyListWhenInputIsEmpty() {
        List<String> input = List.of();
        List<String> result = PalindromeUtils.findPalindromes(input);
        assertTrue(result.isEmpty());
    }

    @Test
    void shouldReturnSinglePalindromeWhenInputContainsOne() {
        List<String> input = List.of("level");
        List<String> expected = List.of("level");
        List<String> result = PalindromeUtils.findPalindromes(input);
        assertEquals(result, expected);
    }

    @Test
    void shouldKeepDuplicatesWhenTheyArePalindromes() {
        List<String> input = List.of("madam", "bird", "radar", "madam", "tree", "madam");
        List<String> expected = List.of("madam", "radar", "madam", "madam");
        List<String> result = PalindromeUtils.findPalindromes(input);
        assertEquals(result, expected);
    }
}