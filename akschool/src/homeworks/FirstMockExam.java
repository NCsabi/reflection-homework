package homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class FirstMockExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(calculatePowerDifference(scanner));
        int[] array = {-1, -1, 5, 0};
        System.out.println(sumAbsoluteValues(array));
        boolean[][][] threeDArray = {
                {
                        {true, false, true},
                        {false, false, true},
                },
                {
                        {true, true},
                        {false, true},
                }
        };
        System.out.println(countFalseElements(threeDArray));
        long[] numbers = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(calculateAlternatingSum(numbers));
        System.out.println(getUserInput(scanner));
        System.out.println(Arrays.toString(generateFibonacciNumber(getUserInput(scanner))));
        scanner.close();

    }
    //Fifth task
    //Ez hibásan van megírva és befejeznem sem sikerült :(

    //Fourth task
    public static long calculateAlternatingSum(long[] numbers) {
        long value = 0;
        for (int i = 0; i < numbers.length; i++) {
            long temp = 0;
            if (i % 3 == 0) {
                temp = numbers[i] *= -1;
            } else if (i % 3 == 1) {
                temp = numbers[i];
            }
            value += temp;
        }
        return value;
    }

    //Third task
    public static int countFalseElements(boolean[][][] threeDArray) {
        int counter = 0;
        for (boolean[][] twoDArray : threeDArray) {
            for (boolean[] oneDArray : twoDArray) {
                for (boolean isBoolean : oneDArray) {
                    if (!isBoolean) {
                        counter++;
                    }
                }
            }
        }
        return counter;
    }

    //Second task
    public static int sumAbsoluteValues(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] *= -1;
            }
            sum += array[i];
        }
        return sum;
    }

    // First task
    public static double calculatePowerDifference(Scanner scanner) {
        int[] numbers = new int[6];
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter the " + (i + 1) + " number: ");
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }
        double average = (double) sum / numbers.length;
        return Math.pow(findLargestNumber(numbers), findSmallestNumber(numbers)) - average;
    }

    public static int findLargestNumber(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int findSmallestNumber(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int getUserInput(Scanner scanner) {
        int number;
        System.out.println("Please enter a number between 10 and 1_000_000");
        do {
            number = scanner.nextInt();
        } while (number < 10 || number > 1_000_000);
        return number;
    }

    public static long[] generateFibonacciNumber(int number) {
        long[] array = new long[number];
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                array[i] = 0;
            } else if (i == 1 || i == 2) {
                array[i] = 1;
            } else {
                array[i] = array[i - 2] + array[i - 1];
            }
        }
        return array;
    }
}
