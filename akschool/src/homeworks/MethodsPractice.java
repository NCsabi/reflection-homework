package homeworks;

import java.sql.SQLOutput;
import java.util.Arrays;

public class MethodsPractice {
    public static void main(String[] args) {
        System.out.println("1 Write a method that decides whether a number is greater than 50: ");
        System.out.println("The number is greater than 50: " + isGreaterThanFifty(55));
        System.out.println();
        System.out.println("2 Write a method that takes in two numbers and returns the greater one: ");
        System.out.println("The greatest number is: " + findGreaterNumber(10, 20));
        System.out.println();
        System.out.println("3 Write a method that takes in two numbers and returns a String:  ");
        System.out.println(getWhichNumberIsGreater(11, 22));
        System.out.println();
        System.out.println("4 Write a method that writes all the numbers from 1 to 100 to the console: ");
        printNumbersFromOneToHundred();
        System.out.println("\n");
        System.out.println("5 Write a method that gets in a number as an input parameter and writes all numbers that are divisible by 5 from 1 up to that number: ");
        printNumbersDivisibleByFive(200);
        System.out.println();
        System.out.println("6 Write a method that gets in a number and returns whether that number is a prime number: ");
        System.out.println("The number is a prime: " + isCheckPrime(7));
        System.out.println();
        System.out.println("7 Write a method that gets in two numbers and returns whether the first is divisible by the second one: ");
        checkDivisibility(10, 5);
        System.out.println();
        System.out.println("8 Write a method that gets in three numbers and returns whether the product of the first and second numbers is equal to the third one: ");
        checkProductEquality(6, 6, 36);
        System.out.println();
        System.out.println("9 Write a method that gets in a number (n) and writes the first n cubic numbers to the console: ");
        printCubicNumbers(5);
        System.out.println();
        System.out.println("10 Write a method that gets in a number (n) and writes the cubic numbers to the console up to that number: ");
        printCubesUpToN(64);
        System.out.println();
        System.out.println("11 Write a method that gets in an array and a number and returns whether the sum of any two numbers at different indexes can add up to that number: ");
        int[] numbers = {2, 11, 7, 15};
        System.out.println("The sum of numbers at different indexes is equal to the requested number is: " + isSumOfTwoNumbers(numbers, 9));
        System.out.println();
        System.out.println("12 Write a method that gets in a String and a positive number and returns the String repeated n times. " +
                "If the number is smaller than 1, return an empty String. Don’t use the string’s in-built repeat method!");
        repeatStringNTimes("text", 7);
        System.out.println();
        System.out.println("13 Write a method that gets in an array of Strings and concatenates them into one String: ");
        String[] words = {"It ", "is ", "a ", "good ", "day ", "to ", "learn ", "Java!"};
        System.out.print(concatenateStrings(words));
        System.out.println();
        System.out.println("14 Write a method that gets in a two-dimensional array and returns the sum of all of the numbers: ");
        int[][] matrix = {
                {1, 44, 66, 88},
                {77, 49, 93, 11}
        };
        System.out.println(getTotalFromMatrix(matrix));
        System.out.println();
        System.out.println("15 Write a method that gets in a two-dimensional array and returns a one-dimensional one with the sum of the sub arrays:  ");
        int[][] matrix2 = {
                {1, 44, 66, 88},
                {77, 49, 93},
                {2, 52, 17},
                {4, 39, 10, 8}
        };
        System.out.println(Arrays.toString(subArraySumsToArray(matrix2)));
        System.out.println();
        System.out.println("16 Write a method that takes in a 2-d array and returns the sum of its main diagonal: ");
        System.out.println(calculateMainDiagonalSum(matrix2));
        System.out.println();
        System.out.println(" 16 Write a method that in a 2-d array and returns its diagonal difference, so in the case of the previous array: ");
        System.out.println(calculateDiagonalDifference(matrix2));
    }

    public static boolean isGreaterThanFifty(int number) {
        return number > 50;
    }

    public static int findGreaterNumber(int num1, int num2) {
        return Math.max(num1, num2);
    }

    public static String getWhichNumberIsGreater(int num1, int num2) {
        if (num1 > num2) {
            return "The first number is greater";
        } else if (num1 < num2) {
            return "The second number is greater";
        }
        return "The two numbers are equal";
    }

    public static void printNumbersFromOneToHundred() {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
    }

    public static void printNumbersDivisibleByFive(int num) {
        for (int i = 1; i <= num; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isCheckPrime(int num) {
        boolean isPrime = true;
        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        return isPrime;
    }

    public static void checkDivisibility(int num1, int num2) {
        if (num1 % num2 == 0) {
            System.out.println("The first number is divisible by second one without a remainder");
        } else {
            System.out.println("The first number is not divisible by second one without a remainder");
        }
    }

    public static void checkProductEquality(int num1, int num2, int num3) {
        if ((num1 * num2) == num3) {
            System.out.println("The product of the first two numbers is equal to the sum of the third number");
        } else {
            System.out.println("The product of the first two numbers is not equal to the sum of the third number");
        }
    }

    public static void printCubicNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print((int) Math.pow(i, 3) + " ");
        }
    }

    public static void printCubesUpToN(int n) {
        for (int i = 1; Math.pow(i, 3) <= n; i++) {
            System.out.print((int) Math.pow(i, 3) + " ");
        }
    }

    public static boolean isSumOfTwoNumbers(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == number) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void repeatStringNTimes(String text, int number) {
        if (number < 1) {
            System.out.println("");
        } else {
            for (int i = 0; i < number; i++) {
                System.out.print(text + " ");
            }
        }
    }

    public static String concatenateStrings(String[] words) {
        String text = "";
        for (String word : words) {
            text = text.concat(word);
        }
        return text;
    }

    public static int getTotalFromMatrix(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    public static int[] subArraySumsToArray(int[][] matrix) {
        int[] array = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                array[i] += matrix[i][j];
            }
        }
        return array;
    }

    public static int calculateMainDiagonalSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }

    public static int calculateDiagonalDifference(int[][] matrix) {
        int sum = 0;
        int diagonalSum = calculateMainDiagonalSum(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i + j == matrix.length - 1) {
                    sum += matrix[i][j];
                }
            }
        }
        return diagonalSum - sum;
    }
}
