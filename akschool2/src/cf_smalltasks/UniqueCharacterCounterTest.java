package cf_smalltasks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UniqueCharacterCounterTest {
    @Test
    public void shouldReturnFiveWhenTypicalDuplicatesArePresent() {
        String input = "aabbbbcccdf";
        int expected = 5;

        int result = UniqueCharacterCounter.countUniqueCharacters(input);

        assertEquals(expected, result);
    }

    @Test
    public void shouldReturnZeroWhenInputIsEmpty() {
        String input = "";
        int expected = 0;

        int result = UniqueCharacterCounter.countUniqueCharacters(input);

        assertEquals(expected, result);
    }

    @Test
    public void shouldReturnFiveWhenAllCharactersAreUnique() {
        String input = "abcde";
        int expected = 5;

        int result = UniqueCharacterCounter.countUniqueCharacters(input);

        assertEquals(expected, result);
    }

    @Test
    public void shouldReturnOneWhenAllCharactersAreTheSame() {
        String input = "aaaaa";
        int expected = 1;

        int result = UniqueCharacterCounter.countUniqueCharacters(input);

        assertEquals(expected, result);
    }
}
