package hu.csaba.thirdexam.task2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> input = List.of("eat", "Tea", "tan", "ate", "Nat", "bat");
        List<List<String>> result = AnagramGrouper.groupAnagrams(input);
        System.out.println(result);
    }
}
