import java.util.Arrays;

public class AlternatingCalculations {
    public static void main(String[] args) {
        int[] array = {3, 5, 7, 2, 6, -2, 1, 8, 1, 4};

        System.out.println("1. Alternating Sum with Stepwise Subtraction: ");
        byte stepwiseSum = 0;
        for (int i = 0; i < array.length; i++) {
            if ((i + 1) % 3 == 0) {
                stepwiseSum -= (byte) array[i];
            } else {
                stepwiseSum += (byte) array[i];
            }
        }
        System.out.println(stepwiseSum);
        System.out.println();
        System.out.println("2. Alternating Multiplication and Division: ");
        double multAndDivResults = 1; //3 15
        for (int i = 0; i < array.length; i++) {
            if ((i + 1) % 3 == 0) {
                multAndDivResults /= array[i];
            } else {
                multAndDivResults *= array[i];
            }
        }
        System.out.println(multAndDivResults);
        System.out.println();
        System.out.println("3. Sum of Even Indexed Numbers Minus Odd Indexed Numbers: ");
        byte sumEvenMinusSumOddIndexed = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                sumEvenMinusSumOddIndexed += (byte) array[i];
            } else {
                sumEvenMinusSumOddIndexed -= (byte) array[i];
            }
        }
        System.out.println(sumEvenMinusSumOddIndexed);
        System.out.println();
        System.out.println("4. Sum of Numbers Skipping Every Fourth Element: ");
        byte sumSkipFourth = 0;
        for (int i = 0; i < array.length; i++) {
            sumSkipFourth += (i % 4 == 0) ? 0 : (byte) array[i];
        }
        System.out.println(sumSkipFourth);
        System.out.println();
        System.out.println("5. Alternating Power and Division: ");
        int[] collector = new int[array.length / 2];
        int j = 0;
        for (int i = 0; i < array.length - 1; i += 2) {
            collector[j] = (int) Math.pow(array[i], array[i + 1]);
            j++;
        }
        System.out.println(Arrays.toString(collector));
        double sum = 1;
        for (int i = 0; i < collector.length; i++) {
            if ((i + 1) % 2 == 0) {
                sum /= collector[i];
            } else {
                sum *= collector[i];
            }
        }
        System.out.println(sum);
        System.out.println();
        System.out.println("6. Sum of Numbers, Doubling Every Third Number: ");
        int[] arrayCopy = Arrays.copyOf(array, array.length);
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if ((i + 1) % 3 == 0) {
                arrayCopy[i] *= 2;
            }
            counter += arrayCopy[i];
        }
        System.out.println(counter);
        System.out.println();
        System.out.println("7. Sum Where Multiples of 3 Are Skipped: ");
        byte counter2 = 0;
        for (int number : array) {
            if (number % 3 != 0) {
                counter2 += (byte) number;
            }
        }
        System.out.println(counter2);
        System.out.println();
        System.out.println("8. Sum Where Prime Numbers Are Squared: ");
        int counter3 = 0;
        for (int number : array) {
            if (isPrime(number)) {
                counter3 += (int) Math.pow(number, 2);
            } else {
                counter3 += number;
            }
        }
        System.out.println(counter3);
        System.out.println();
        System.out.println("9. Count of Even and Odd Numbers: ");
        byte evenCount = 0;
        byte oddCount = 0;
        for (int number : array) {
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Even count: " + evenCount);
        System.out.println("Odd count: " + oddCount);
        System.out.println();
        System.out.println("10. Sum Where Negative Numbers Are Ignored: ");
        byte counter4 = 0;
        for (int number : array) {
            if (number > 0) {
                counter4 += (byte) number;
            }
        }
        System.out.println(counter4);
        System.out.println();
        System.out.println("11. Product of Positive Numbers Divided by Negative Numbers: ");
        int positiveCounter = 1;
        int negativeCounter = 1;
        double finalResult = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                negativeCounter *= array[i];
            } else {
                positiveCounter *= array[i];
            }
        }
        finalResult = (double) positiveCounter / negativeCounter;
        System.out.println(finalResult);
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

