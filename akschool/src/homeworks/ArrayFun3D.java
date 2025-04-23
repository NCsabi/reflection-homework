package homeworks;

import java.util.Arrays;

public class ArrayFun3D {
    public static void main(String[] args) {
        String[][][] words = {
                {
                        {"apple", "banana", "pear"},
                        {"lemon", "kiwi", "mango"},
                        {"orange", "strawberry", "watermelon"}
                },
                {
                        {"rotator", "level", "radar"},
                        {"building", "madam", "money"},
                        {"brick", "e", "plane"}
                }
        };
        System.out.println(countPalindromes(words));
        System.out.println(Arrays.toString(deepStringCounter(words)));
        System.out.println(concatenateLongStrings(words));
        System.out.println(findLongestStringLength(words));
        System.out.println(checkSEndingInNestedArrays(words));

    }

    //5, Write a method in which you return true if every subarray (3rd level) contains at least one string that ends with "s".
    public static boolean checkSEndingInNestedArrays(String[][][] words) {
        for (String[][] array2D : words) {
            for (String[] array : array2D) {
                boolean includedS = false;
                for (String text : array) {
                    if (text.charAt(text.length() - 1) == 's') {
                        includedS = true;
                        break;
                    }
                }
                if(!includedS) {
                    return false;
                }
            }
        }
        return true;
    }

    //4, Write a method in which you return the maximum length of a string in the entire 3D array.
    public static int findLongestStringLength(String[][][] words) {
        int maxLength = 0;
        for (String[][] array2D : words) {
            for (String[] array : array2D) {
                for (String text : array) {
                    if (text.length() > maxLength) {
                        maxLength = text.length();
                    }
                }
            }
        }
        return maxLength;
    }

    //3, Write a method in which you return the concatenation of all strings, but skip strings shorter than 2 characters.
    public static String concatenateLongStrings(String[][][] words) {
        StringBuilder concatenatedString = new StringBuilder();
        for (String[][] array2D : words) {
            for (String[] array : array2D) {
                for (String text : array) {
                    if (text.length() > 2) {
                        concatenatedString.append(text);
                    }
                }
            }
        }
        return concatenatedString.toString();
    }

    //2, Write a method in which you return a 1D array of integers representing the number of strings in each sub-subarray (3rd level).
    public static int[] deepStringCounter(String[][][] words) {
        int[] subArrays = new int[arrayCounter(words)];
        int index = 0;
        for (String[][] array2D : words) {
            for (String[] array : array2D) {
                subArrays[index++] = array.length;
            }
        }
        return subArrays;
    }

    //1, Write a method in which you return the number of strings that are palindromes.
    public static int countPalindromes(String[][][] words) {
        int counter = 0;
        for (String[][] array2D : words) {
            for (String[] array : array2D) {
                for (String text : array) {
                    if (isPalindrome(text)) {
                        counter++;
                    }
                }
            }
        }
        return counter;
    }

    public static boolean isPalindrome(String word) {
        return new StringBuilder(word).reverse().toString().equals(word);
    }

    public static int arrayCounter(String[][][] words) {
        int counter = 0;
        for (String[][] array2D : words) {
            for (String[] array : array2D) {
                counter++;
            }
        }
        return counter;
    }
}
