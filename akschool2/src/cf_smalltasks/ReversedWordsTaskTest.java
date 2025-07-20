package cf_smalltasks;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ReversedWordsTaskTest {
    @Test
    public void testReverseWordsBasicWords() {
        List<String> input = Arrays.asList("one", "two", "three");
        List<String> expected = Arrays.asList("eno", "owt", "eerht");

        List<String> result = ReversedWordsTask.reverseWords(input);

        assertEquals(expected, result);
    }

    @Test
    public void testReverseWordsEmptyList() {
        List<String> input = List.of();
        List<String> expected = List.of();

        List<String> result = ReversedWordsTask.reverseWords(input);

        assertEquals(expected, result);
    }

    @Test
    public void testReverseWordsSingleLetterWords() {
        List<String> input = Arrays.asList("c", "f", "r");
        List<String> expected = Arrays.asList("c", "f", "r");

        List<String> result = ReversedWordsTask.reverseWords(input);

        assertEquals(expected, result);
    }

    @Test
    public void testReverseWordsPalindromeWords() {
        List<String> input = Arrays.asList("madam", "level");
        List<String> expected = Arrays.asList("madam", "level");

        List<String> result = ReversedWordsTask.reverseWords(input);

        assertEquals(expected, result);
    }
}
