package cfsmalltasks.task6;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UniqueCounterTest {
    @Test
    void shouldReturn1WhenTheFirstListIsBigger() {
        List<Integer> a = List.of(1, 2, 3, 4);
        List<Integer> b = List.of(1, 1, 2, 3);
        int result = UniqueCounter.compareUniqueCounts(a, b);
        assertEquals(result, 1);
    }

    @Test
    void shouldReturn2WhenTheFirstListIsSmaller() {
        List<Integer> a = List.of(1, 2, 2, 3);
        List<Integer> b = List.of(1, 2, 3, 4);
        int result = UniqueCounter.compareUniqueCounts(a, b);
        assertEquals(result, 2);
    }

    @Test
    void shouldReturn0WhenTheTwoListAreEquals() {
        List<Integer> a = List.of(1, 2, 3, 4);
        List<Integer> b = List.of(1, 2, 3, 4);
        int result = UniqueCounter.compareUniqueCounts(a, b);
        assertEquals(result, 0);
    }

    @Test
    void shouldReturn0WhenTheTwoListAreEmpty() {
        List<Integer> a = List.of();
        List<Integer> b = List.of();
        int result = UniqueCounter.compareUniqueCounts(a, b);
        assertEquals(result, 0);
    }

    @Test
    void shouldReturn1WhenTheFirstStringListIsBigger() {
        List<String> a = List.of("one", "two", "there");
        List<String> b = List.of("one", "two", "two");
        int result = UniqueCounter.compareUniqueCounts(a, b);
        assertEquals(result, 1);
    }

    @Test
    void shouldReturn2WhenTheFirstStringListIsSmaller() {
        List<String> a = List.of("apple", "pear", "apple");
        List<String> b = List.of("apple", "pear", "cherry");
        int result = UniqueCounter.compareUniqueCounts(a, b);
        assertEquals(result, 2);
    }

    @Test
    void shouldReturn0WhenTheTwoStringListAreEquals() {
        List<String> a = List.of("blue", "black", "grey");
        List<String> b = List.of("blue", "black", "grey");
        int result = UniqueCounter.compareUniqueCounts(a, b);
        assertEquals(result, 0);
    }

}