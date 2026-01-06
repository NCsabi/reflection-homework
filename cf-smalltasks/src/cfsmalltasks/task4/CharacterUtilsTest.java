package cfsmalltasks.task4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharacterUtilsTest {
    @Test
    void shouldReturnZeroWhenInputIsEmpty() {
        int result = CharacterUtils.countUniqueCharacter("");
        assertEquals(0, result);
    }

    @Test
    void shouldReturnZeroWhenAllCharacterAreDuplicate() {
        int result = CharacterUtils.countUniqueCharacter("abba");
        assertEquals(0, result);
    }

    @Test
    void shouldReturnLengthWhenAllCharactersAreUnique() {
        int result = CharacterUtils.countUniqueCharacter("one");
        assertEquals(3, result);
    }

    @Test
    void shouldReturnOneWhenOnlyOneCharacterIsUnique() {
        int result = CharacterUtils.countUniqueCharacter("banana");
        assertEquals(1, result);
    }

    @Test
    void shouldHandleSpecialCharacterCorrectly() {
        int result = CharacterUtils.countUniqueCharacter("a!a?");
        assertEquals(2, result);
    }

    @Test
    void shouldTreatUppercaseAndLowercaseAsDifferentCharacters() {
        int result = CharacterUtils.countUniqueCharacter("Aa");
        assertEquals(2, result);
    }
}
