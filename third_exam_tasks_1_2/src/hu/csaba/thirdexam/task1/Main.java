package hu.csaba.thirdexam.task1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> input = List.of(
                "one", "two", "three",
                "four", "five", "six",
                "seven", "eight", "nine"
        );
        List<String> output = StringReverser.reverseEveryThirdString(input);
        System.out.println(output);
    }
}
