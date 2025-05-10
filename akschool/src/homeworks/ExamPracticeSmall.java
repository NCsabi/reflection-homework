package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ExamPracticeSmall {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Task 1: ");
        System.out.println(Arrays.toString(isPerfectSquareAndEven(getFiveNumbers())));
        System.out.println("Task2: ");
        System.out.println(calculateSqrtDifference(getSixNumbers()));
        System.out.println("Task3: ");
        System.out.println(calculateEvenOddDifference(getSixNumbersInList()));
        System.out.println("Task4: ");
        int[] numbers = {6, 1, 4};
        System.out.println(findMaxDifference(numbers));
    }

    public static int findMaxDifference(int[] numbers) {
        return findLargestNumber(numbers) - findSmallestNumber(numbers);
    }

    public static int calculateEvenOddDifference(List<Integer> numbers) {
        int sumOfEven = 0;
        int sumOfOdd = 0;
        for (Integer num : numbers) {
            if (num % 2 == 0) {
                sumOfEven += num;
            } else {
                sumOfOdd += num;
            }
        }
        return sumOfEven - sumOfOdd;
    }

    public static double calculateSqrtDifference(int[] array) {
        int[] numbers = new int[6];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = array[i];
        }
        return Math.sqrt(findLargestNumber(numbers) - findSmallestNumber(numbers));
    }

    public static boolean[] isPerfectSquareAndEven(int[] numbers) {
        boolean[] isNumber = new boolean[5];
        for (int i = 0; i < numbers.length; i++) {
            isNumber[i] = numbers[i] % 2 == 0 && Math.sqrt(numbers[i]) % 1 == 0;
        }
        return isNumber;
    }

    public static int findLargestNumber(int[] array) {
        int max = array[0];
        for (int number : array) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static int findSmallestNumber(int[] array) {
        int min = array[0];
        for (int number : array) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    public static int[] getFiveNumbers() {
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter the " + (i + 1) + " number: ");
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }

    public static int[] getSixNumbers() {
        int[] numbers = new int[6];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter the " + (i + 1) + " number: ");
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }

    public static List<Integer> getSixNumbersInList() {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            numbers.add(scanner.nextInt());
        }
        return numbers;
    }
}
