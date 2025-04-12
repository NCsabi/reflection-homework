package homeworks;

import java.util.Arrays;

public class MethodsPractice2 {
    public static void main(String[] args) {

        printMyIdentify();
        displayWelcomeMessage();
        System.out.println(calculateThirtyPercent(100));
        String[] words = {"one", "two", "three", "four"};
        System.out.println(returnEmptyString(words));
        System.out.println(calculateFortyTwoPointEightPercent(200));
        String word = "Java";
        System.out.println(doubleStringLength(word));
        System.out.println("The difference between the first and second number: " + calculateDifferenceToTarget(10, 15));
        System.out.println(calculateSquareRootOfLength("Java"));
        System.out.println(calculateFactorialOfLength("Java"));
        System.out.println(calculateHundredDividedByNumber(40));
        System.out.println(processNumberByRules(12));
        System.out.println(Arrays.toString(calculateStringLength(words)));
        System.out.println(calculateNetSalary(100000));
        boolean[] array = new boolean[]{false, true, true, false};
        System.out.println(calculateXor(array));
        int[] numbers = {12, 33, 42, 23, -22, -8, -5, -19, 7, 2};
        System.out.println(Arrays.toString(filterNegativeNumbers(numbers)));
    }

    //15, Write a method that gets in an array of numbers and returns a new array with all the negative numbers in from the original array
    public static int[] filterNegativeNumbers(int... numbers) {
        int[] negativeNumbers = new int[countNegativeNumbers(numbers)];
        int index = 0;
        for (int number : numbers) {
            if (number < 0) {
                negativeNumbers[index++] = number;
            }
        }
        return negativeNumbers;
    }

    //14, Write a method that gets in an array of booleans and returns a1 XOR a2 XOR a3 … XOR an
    public static boolean calculateXor(boolean[] array) {
        boolean result = false;
        for (boolean value : array) {
            result ^= value;
        }
        return result;
    }

    //13, Write a method that gets in a gross salary and calculates the net salary according to the Hungarian rules in the following way:
    //a. deduces 15% as SZJA (personal income tax) and 18.5% as TBJ (social security tax)
    //b. the remaining amount is going to be the net salary
    //c. So if someone earns 100 000 HUF gross per month, their net salary is going to be 66500 HUF
    //d. Use separate methods to calculate SZJA and TBJ.
    public static double calculateNetSalary(int salary) {
        return salary - calculatePersonalIncomeTax(salary) - calculateTbjRate(salary);
    }

    //12, Write a method that gets in an array of Strings and returns a new array of numbers of each String’s length
    public static int[] calculateStringLength(String... words) {
        int[] length = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            length[i] = words[i].length();
        }
        return length;
    }

    //11, Write a method that gets in a number and
    //a. returns the square of it if it is prime
    //b. returns the double of it if it is not a prime and is divisible by 4
    //c. returns the triple of it if it is not a prime and is not divisible by 4
    public static int processNumberByRules(int num) {
        int result;
        if (isPrime(num)) {
            result = num * num;
        } else if (num % 4 == 0) {
            result = num * 2;
        } else {
            result = num * 3;
        }
        return result;
    }

    //10, Write a method that gets in a number and returns 100 divided by that number
    public static double calculateHundredDividedByNumber(int num) {
        return (double) 100 / num;
    }

    //9, Write a method that gets in a String and returns the factorial of its length
    public static int calculateFactorialOfLength(String word) {
        int value = 1;
        for (int i = 1; i < word.length() + 1; i++) {
            value *= i;
        }
        return value;
    }

    //8, Write a method that gets in a String and returns the square root of its length
    public static int calculateSquareRootOfLength(String word) {
        return (int) Math.pow(word.length(), 2);
    }

    //7, Write a method that gets in two numbers and returns how much you would need to add to the first number to get the second one
    public static int calculateDifferenceToTarget(int firstNumber, int secondNumber) {
        return secondNumber - firstNumber;
    }

    //6, Write a method that gets in a String and returns the double of its length
    public static int doubleStringLength(String word) {
        return word.length() * 2;
    }

    //5, Write a method that gets in a number and returns its 42.8%
    public static double calculateFortyTwoPointEightPercent(int num) {
        return (num * 42.8) / 100;
    }

    //4, Write a method that gets in an array of Strings and returns an empty String
    public static String returnEmptyString(String[] array) {
        return "";
    }

    //3, Write a method that gets in a number and returns its 30%
    public static double calculateThirtyPercent(double number) {
        return (number * 30) / 100;
    }

    //2, Write a method that writes a welcome message to the console
    public static void displayWelcomeMessage() {
        System.out.println("Welcome");
    }

    //1, Write a method that writes your own name to the console
    public static void printMyIdentify() {
        System.out.println("Nagy Csaba");
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double calculatePersonalIncomeTax(int salary) {
        return (double) (salary * 15) / 100;
    }

    public static double calculateTbjRate(int salary) {
        return (salary * 18.5) / 100;
    }

    public static int countNegativeNumbers(int[] numbers) {
        int counter = 0;
        for (int number : numbers) {
            if (number < 0) {
                counter++;
            }
        }
        return counter;
    }
}