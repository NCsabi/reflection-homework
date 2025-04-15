package homeworks;

import java.util.Arrays;

public class ArrayFun {
    public static void main(String[] args) {
        int[] numbers = {10, 6, 9, 4, 55, 73, 14, 0};
        System.out.println(calculateEvenAverage(numbers));
        System.out.println(Arrays.toString(squareOdds(numbers)));
        String[] words = {"Apple", "almond", "door", "chair", "pea", "Africa"};
        System.out.println(countAStartingStrings(words));
        System.out.println(combineStringsOverThree(words));
        System.out.println(containsConsecutiveDuplicates(numbers));
        String[][] texts = {
                {"one", "two", "three"},
                {"four", "five"},
                {"six", "seven", "eight", "nine"}
        };
        System.out.println(getTotalVowels(texts));
        System.out.println(sumOfLongestString(texts));
        System.out.println(Arrays.toString(getFlattenedUppercaseStrings(texts)));
        System.out.println(Arrays.deepToString(isDigitInStrings2D(texts)));
        System.out.println(calculateAverageCharacters(texts));
    }

    //10, Write a method in which you return the average number of characters per string across all elements.
    public static double calculateAverageCharacters(String[][] texts) {
        double sum = 0;
        int counter = 0;
        for (String[] text : texts) {
            for (int j = 0; j < text.length; j++) {
                counter++;
            }
            sum = (double) calculateCharacters(texts) / counter;
        }
        return sum;
    }

    //9, Write a method in which you return a new 2D array of booleans where each element
    // is true if the corresponding string contains a digit.
    public static boolean[][] isDigitInStrings2D(String[][] texts) {
        boolean containsDigit = false;
        for (String[] text : texts) {
            for (String word : text) {
                for (char character : word.toCharArray()) {
                    if (Character.isDigit(character)) {
                        containsDigit = true;
                        break;
                    }
                }
                if (containsDigit)
                    break;
            }
            if (containsDigit)
                break;
        }
        boolean[][] isNumber = new boolean[texts.length][];
        for (int i = 0; i < texts.length; i++) {
            isNumber[i] = new boolean[texts[i].length];
            if (containsDigit) {
                Arrays.fill(isNumber[i], true);
            }
        }
        return isNumber;
    }

    //8, Write a method in which you return a one-dimensional (in other words: flattened) array of all strings in uppercase.
    public static String[] getFlattenedUppercaseStrings(String[][] texts) {
        int totalLength = 0;
        for (String[] text : texts) {
            totalLength += text.length;
        }
        String[] array = new String[totalLength];
        int index = 0;
        for (String[] text : texts) {
            for (String word : text) {
                array[index++] = word.toUpperCase();
            }
        }
        return array;
    }

    //7, Write a method in which you return the sum of the lengths of the longest string
    //from each row (subarray).
    public static int sumOfLongestString(String[][] texts) {
        int amount = 0;
        for (String[] text : texts) {
            int counter = 0;
            for (String word : text) {
                if (word.length() > counter) {
                    counter = word.length();
                }
            }
            amount += counter;
        }
        return amount;
    }

    //6, Write a method in which you return the total number of vowels in a 2D array of strings.
    // (you don’t have to consider non-English vowels, only a, e, i, o and u).
    public static int getTotalVowels(String[][] texts) {
        String allVowels = "aeiouAEIOU";
        int counter = 0;
        for (String[] text : texts) {
            for (String word : text) {
                for (char character : word.toCharArray()) {
                    if (allVowels.indexOf(character) != -1) {
                        counter++;
                    }
                }
            }
        }
        return counter;
    }

    //5, Write a method in which you return true if the array of integers contains any consecutive duplicates.
    public static boolean containsConsecutiveDuplicates(int... numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == numbers[i + 1]) {
                return true;
            }
        }
        return false;
    }

    //4, Write a method in which you return the concatenation of all strings that are longer than 3 characters.
    public static String combineStringsOverThree(String... words) {
        StringBuilder text = new StringBuilder();
        for (String word : words) {
            if (word.length() > 3) {
                text.append(word);
            }
        }
        return text.toString();
    }

    //3, Write a method in which you return the number of strings that start with the letter "a" or "A".
    public static int countAStartingStrings(String... words) {
        int counter = 0;
        for (String word : words) {
            if (word.charAt(0) == 'A' || word.charAt(0) == 'a')
                counter++;
        }
        return counter;
    }

    //2, Write a method in which you return a new array with each number squared only if the original
    // number was odd. If the original number was even, skip it from the new array.
    public static int[] squareOdds(int... array) {
        int[] squaredOddNumbers = new int[countOddNumbers(array)];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = (int) Math.pow(array[i], 2);
                squaredOddNumbers[index++] = array[i];
            }
        }
        return squaredOddNumbers;
    }

    //1, Write a method in which you Return the average of all even numbers in an array of integers.
    public static double calculateEvenAverage(int... array) {
        int sum = 0;
        int counter = 0;
        for (int number : array) {
            if (number % 2 == 0) {
                sum += number;
                counter++;
            }
        }
        return (double) sum / counter;
    }

    public static int countOddNumbers(int[] array) {
        int counter = 0;
        for (int number : array) {
            if (number % 2 != 0) {
                counter++;
            }
        }
        return counter;
    }

    public static int calculateCharacters(String[][] array) {
        int characters = 0;
        for (String[] text : array) {
            for (String word : text) {
                characters += word.length();
            }
        }
        return characters;
    }
}
