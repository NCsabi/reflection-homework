package cfsmalltasks.task4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharacterUtilsTest {
    @Test
    void shouldReturnZeroWhenInputIsEmptyDistinct() {
        int result = CharacterUtils.countDistinctCharacters("");
        assertEquals(0, result);
    }

    @Test
    void shouldReturnTwoWhenAllCharactersAreDuplicateDistinct() {
        int result = CharacterUtils.countDistinctCharacters("abba");
        assertEquals(2, result);
    }

    @Test
    void shouldReturnLengthWhenAllCharactersAreUniqueDistinct() {
        int result = CharacterUtils.countDistinctCharacters("one");
        assertEquals(3, result);
    }

    @Test
    void shouldReturnHandleSpecialCharactersCorrectlyDistinct() {
        int result = CharacterUtils.countDistinctCharacters("a!a?");
        assertEquals(3, result);
    }

    @Test
    void shouldTreatUppercaseAndLowercaseAsDifferentCharactersDistinct() {
        int result = CharacterUtils.countDistinctCharacters("Aa");
        assertEquals(2, result);
    }

    @Test
    void shouldReturnZeroWhenInputIsEmpty() {
        int result = CharacterUtils.countCharactersOccurringOnce("");
        assertEquals(0, result);
    }

    @Test
    void shouldReturnZeroWhenAllCharacterAreDuplicate() {
        int result = CharacterUtils.countCharactersOccurringOnce("abba");
        assertEquals(0, result);
    }

    @Test
    void shouldReturnLengthWhenAllCharactersAreUnique() {
        int result = CharacterUtils.countCharactersOccurringOnce("one");
        assertEquals(3, result);
    }

    @Test
    void shouldReturnOneWhenOnlyOneCharacterIsUnique() {
        int result = CharacterUtils.countCharactersOccurringOnce("banana");
        assertEquals(1, result);
    }

    @Test
    void shouldHandleSpecialCharacterCorrectly() {
        int result = CharacterUtils.countCharactersOccurringOnce("a!a?");
        assertEquals(2, result);
    }

    @Test
    void shouldTreatUppercaseAndLowercaseAsDifferentCharacters() {
        int result = CharacterUtils.countCharactersOccurringOnce("Aa");
        assertEquals(2, result);
    }
}
