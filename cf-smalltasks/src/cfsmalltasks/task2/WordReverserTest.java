package cfsmalltasks.task2;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WordReverserTest {
    @Test
    void testReverseWordsSimple() {
        List<String> a = List.of("apple", "banana");
        List<String> result = WordReverser.reverseWords(a);
        assertEquals(List.of("elppa", "ananab"), result);
    }

    @Test
    void testReverseWordsEmptyList() {
        List<String> a = List.of();
        List<String> result = WordReverser.reverseWords(a);
        assertTrue(result.isEmpty());
    }

    @Test
    void testReverseWordsSingleWord() {
        List<String> a = List.of("dog");
        List<String> result = WordReverser.reverseWords(a);
        assertEquals(List.of("god"), result);
    }

    @Test
    void testReverseWordsWithSpecialCharacters() {
        List<String> input = List.of("a-b", "123", "!hello?");
        List<String> expected = List.of("b-a", "321", "?olleh!");
        List<String> result = WordReverser.reverseWords(input);
        assertEquals(result, expected);
    }
}
