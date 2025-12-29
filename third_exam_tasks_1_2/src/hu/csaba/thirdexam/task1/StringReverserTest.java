package hu.csaba.thirdexam.task1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringReverserTest {
    @Test
    void shouldReturnSameListWhenLessThanThreeElements() {
        List<String> input = List.of("one", "two");
        List<String> output = StringReverser.reverseEveryThirdString(input);
        assertEquals(input, output);
    }

    @Test
    void shouldReverseOnlyThirdElementWhenExactlyThreeElements() {
        List<String> input = List.of("one", "two", "three");
        List<String> output = StringReverser.reverseEveryThirdString(input);
        assertEquals(List.of("one", "two", "eerht"), output);
    }

    @Test
    void shouldHandleEmptyStringCorrectly() {
        List<String> input = List.of("", "", "");
        List<String> output = StringReverser.reverseEveryThirdString(input);
        assertEquals(List.of("", "", ""), output);
    }

    @Test
    void shouldReverseEveryThirdAndReverseTheirOrder() {
        List<String> input = List.of(
                "one", "two", "three",
                "four", "five", "six",
                "seven", "eight", "nine"
        );
        List<String> output = StringReverser.reverseEveryThirdString(input);
        assertEquals(List.of(
                "one", "two", "enin",
                "four", "five", "xis",
                "seven", "eight", "eerht"
        ), output);
    }

    @Test
    void shouldReturnSameListWhenEmptyList() {
        List<String> input = List.of();
        List<String> output = StringReverser.reverseEveryThirdString(input);
        assertEquals(input, output);
    }
}
