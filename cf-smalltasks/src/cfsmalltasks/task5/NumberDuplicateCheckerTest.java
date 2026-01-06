package cfsmalltasks.task5;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NumberDuplicateCheckerTest {
    @Test
    void ShouldReturnTrueWhenTheListContainsDuplicateNumbers() {
        List<Integer> input = List.of(1, 2, 2, 3);
        boolean result = NumberDuplicateChecker.hasDuplicates(input);
        assertTrue(result);
    }

    @Test
    void ShouldReturnFalseWhenTheListContainsNoDuplicateNumbers() {
        List<Integer> input = List.of(1, 2, 3, 4);
        boolean result = NumberDuplicateChecker.hasDuplicates(input);
        assertFalse(result);
    }

    @Test
    void ShouldReturnFalseWhenTheListIsEmpty() {
        List<Integer> input = List.of();
        boolean result = NumberDuplicateChecker.hasDuplicates(input);
        assertFalse(result);
    }

    @Test
    void shouldReturnFalseWhenTheListHasSingleElement() {
        List<Integer> input = List.of(1);
        boolean result = NumberDuplicateChecker.hasDuplicates(input);
        assertFalse(result);
    }

    @Test
    void shouldReturnTrueWhenTheListHasTwoIdenticalElements() {
        List<Integer> input = List.of(7, 7);
        boolean result = NumberDuplicateChecker.hasDuplicates(input);
        assertTrue(result);
    }

    @Test
    void shouldReturnTrueWhenTheListContainsNegativeDuplicate() {
        List<Integer> input = List.of(-1, -2, -1);
        boolean result = NumberDuplicateChecker.hasDuplicates(input);
        assertTrue(result);
    }
}
