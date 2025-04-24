package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayFun4D {
    public static void main(String[] args) {
        String[][][][] fourDArray = {
                {
                        {
                                {"One", "Two"},
                                {"Three", "Four"}
                        },
                        {
                                {"five", "six"},
                                {"seven", "eight"}
                        }
                },
                {
                        {
                                {"NINE", "TN"},
                                {"ELEVEN", "TWELVE"}
                        },
                        {
                                {"Thirteen", "Fourteen"},
                                {"Fifteen", "Sixteen"}
                        }
                }
        };
        System.out.println(countLowercaseStrings(fourDArray));
        System.out.println(Arrays.deepToString(reverseStringsIn4DArray(fourDArray)));
        System.out.println(calculateAverageStringLength(fourDArray));
        System.out.println(filterByVowelCount(fourDArray));
        System.out.println(findShortestString(fourDArray));
    }

    //5, Write a method in which you return the shortest string across all dimensions.
    public static String findShortestString(String[][][][] fourDArray) {
        String shortestString = fourDArray[0][0][0][0];
        for (String[][][] threeDArray : fourDArray) {
            for (String[][] twoDArray : threeDArray) {
                for (String[] oneDArray : twoDArray) {
                    for (String text : oneDArray) {
                        if (text.length() < shortestString.length()) {
                            shortestString = text;
                        }
                    }
                }
            }
        }
        return shortestString;
    }

    //4, Write a method in which you return a list of all strings that contain more than two vowels.
    // (you don’t have to consider non-English vowels, only a, e, i, o and u).
    public static List<String> filterByVowelCount(String[][][][] fourDArray) {
        List<String> words = new ArrayList<>();
        String allVowels = "aeiouAEIOU";
        for (String[][][] threeDArray : fourDArray) {
            for (String[][] twoDArray : threeDArray) {
                for (String[] oneDArray : twoDArray) {
                    for (String text : oneDArray) {
                        int counter = 0;
                        for (char character : text.toCharArray()) {
                            if (allVowels.indexOf(character) != -1) {
                                counter++;
                            }
                        }
                        if (counter > 2) {
                            words.add(text);
                        }
                    }
                }
            }
        }
        return words;
    }

    //3, Write a method in which you return the average length of all strings, rounded down to the nearest integer.
    public static double calculateAverageStringLength(String[][][][] fourDArray) {
        double totalLength = 0;
        double count = 0;
        for (String[][][] threeDArray : fourDArray) {
            for (String[][] twoDArray : threeDArray) {
                for (String[] oneDArray : twoDArray) {
                    for (String text : oneDArray) {
                        totalLength += text.length();
                        count++;
                    }
                }
            }
        }
        return Math.floor(totalLength / count);
    }

    //2, Write a method in which you return a new 4D array with the same structure, where each string is reversed.
    public static String[][][][] reverseStringsIn4DArray(String[][][][] fourDArray) {
        String[][][][] strings = new String[fourDArray.length][][][];
        for (int i = 0; i < fourDArray.length; i++) {
            strings[i] = new String[fourDArray.length][][];
            for (int j = 0; j < fourDArray[i].length; j++) {
                strings[i][j] = new String[fourDArray[i][j].length][];
                for (int k = 0; k < fourDArray[i][j].length; k++) {
                    strings[i][j][k] = new String[fourDArray[i][j][k].length];
                    for (int l = 0; l < fourDArray[i][j][k].length; l++) {
                        strings[i][j][k][l] = reverseString(fourDArray[i][j][k][l]);
                    }
                }
            }
        }
        return strings;
    }

    public static String reverseString(String text) {
        return new StringBuilder(text).reverse().toString();
    }

    //1, Write a method in which you return the total count of strings that contain only lowercase letters. Note: you can use Character.isLowerCase()
    //to decide whether a character is lowercase or not.
    public static int countLowercaseStrings(String[][][][] fourDArray) {
        int counter = 0;
        for (String[][][] threeDArrays : fourDArray) {
            for (String[][] twoDArrays : threeDArrays) {
                for (String[] oneDArray : twoDArrays) {
                    for (String text : oneDArray) {
                        if (isLowercaseChars(text)) {
                            counter++;
                        }
                    }
                }
            }
        }
        return counter;
    }

    public static boolean isLowercaseChars(String text) {
        for (int i = 0; i < text.length(); i++) {
            if (!Character.isLowerCase(text.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}