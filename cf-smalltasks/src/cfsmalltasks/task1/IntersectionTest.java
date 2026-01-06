package cfsmalltasks.task1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IntersectionTest {
    @Test
    void testSimpleIntersection() {
        List<Integer> a = List.of(1, 2, 3, 4, 5);
        List<Integer> b = List.of(1, 2, 6, 7, 8);
        List<Integer> result = Intersection.findIntersection(a, b);
        assertEquals(List.of(1, 2), result);
    }

    @Test
    void noIntersection() {
        List<Integer> a = List.of(1, 2, 3, 4);
        List<Integer> b = List.of(5, 6, 7, 8);
        List<Integer> result = Intersection.findIntersection(a, b);
        assertTrue(result.isEmpty());
    }

    @Test
    void fullIntersection() {
        List<Integer> a = List.of(1, 2, 3, 4);
        List<Integer> b = List.of(1, 2, 3, 4);
        List<Integer> result = Intersection.findIntersection(a, b);
        assertEquals(List.of(1, 2, 3, 4), result);
    }

    @Test
    void testStringIntersectionSimple() {
        List<String> a = List.of("one", "two", "three", "four", "five");
        List<String> b = List.of("three", "six", "seven", "one", "eight");
        List<String> result = Intersection.findIntersection(a, b);
        assertEquals(List.of("one", "three"), result);
    }

    @Test
    void testStringNoIntersection() {
        List<String> a = List.of("apple", "banana", "mellone");
        List<String> b = List.of("pear", "cherry", "orange");
        List<String> result = Intersection.findIntersection(a, b);
        assertTrue(result.isEmpty());
    }

    @Test
    void testStringFullIntersection() {
        List<String> a = List.of("cat", "dog", "wolf");
        List<String> b = List.of("dog", "wolf", "cat");
        List<String> result = Intersection.findIntersection(a, b);
        assertEquals(List.of("cat", "dog", "wolf"), result);
    }
}
