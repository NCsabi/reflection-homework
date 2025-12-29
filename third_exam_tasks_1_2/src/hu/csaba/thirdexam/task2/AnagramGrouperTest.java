package hu.csaba.thirdexam.task2;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AnagramGrouperTest {

    @Test
    void shouldGroupSimpleAnagrams() {
        List<String> input = List.of("eat", "Tea", "ate");
        List<List<String>> output = AnagramGrouper.groupAnagrams(input);
        assertEquals(1, output.size());
        assertEquals(List.of("eat", "Tea", "ate"), output.getFirst());
    }

    @Test
    void shouldGroupMultipleAnagramSets() {
        List<String> input = List.of("eat", "Tea", "tan", "ate", "Nat", "bat");
        List<List<String>> output = AnagramGrouper.groupAnagrams(input);
        assertTrue(output.contains(List.of("eat", "Tea", "ate")));
        assertTrue(output.contains(List.of("tan", "Nat")));
        assertTrue(output.contains(List.of("bat")));
    }

    @Test
    void shouldHandleEmptyStrings() {
        List<String> input = List.of("", "", "a");
        List<List<String>> output = AnagramGrouper.groupAnagrams(input);
        assertTrue(output.contains(List.of("", "")));
        assertTrue(output.contains(List.of("a")));
    }

    @Test
    void shouldHandleUnicodeCharacters() {
        List<String> input = List.of("árvíz", "vízár", "ablak");
        List<List<String>> output = AnagramGrouper.groupAnagrams(input);
        assertTrue(output.contains(List.of("árvíz", "vízár")));
        assertTrue(output.contains(List.of("ablak")));
    }

    @Test
    void shouldReturnEmptyListAndNewInstanceWhenInputIsEmpty() {
        List<String> input = List.of();
        List<List<String>> output = AnagramGrouper.groupAnagrams(input);
        assertTrue(output.isEmpty());
        assertNotSame(input, output);
    }
}
