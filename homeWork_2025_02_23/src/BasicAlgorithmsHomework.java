public class BasicAlgorithmsHomework {
    public static void main(String[] args) {
        int[] array = {3, 100, 7, 1, -51, 4, 101, 73};
        System.out.println("Min/max" + "\n");
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("The smallest element in the array is: " + min);
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("The biggest element in the array is: " + max + "\n");
        System.out.println("Counting" + "\n");
        byte counter = 0;
        byte counter2 = 0;
        byte counter3 = 0;
        byte counter4 = 0;
        byte counter5 = 0;
        for (int number : array) {
            if (number > 100) {
                counter++;
            }
            if (number > -50 && number < 78) {
                counter2++;
            }
            if (number % 2 == 0) {
                counter3++;
            }
            if (number % 3 != 0) {
                counter4++;
            }
            if (number == 73) {
                counter5++;
            }
        }
        System.out.println("There are " + counter + " elements greater than 100 in the array.");
        System.out.println("There are " + counter2 + " elements between -50 and 78 in the array.");
        System.out.println("There are " + counter3 + " elements are divisible by 2 in the array.");
        System.out.println("There are " + counter4 + " elements are not divisible by 3 in the array.");
        System.out.println("The number 73 appears " + counter5 + " in the array.");
        System.out.println();
        System.out.println("Search" + "\n");
        boolean found = false;
        for (int number : array) {
            if (number == 100) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("The value 100 is found in the array.");
        } else {
            System.out.println("The value 100 is not found in the array.");
        }
        System.out.print("There is a number greater than 100 in the array: ");
        boolean hasNumberGreaterThan100 = false;
        for (int number : array) {
            if (number > 100) {
                hasNumberGreaterThan100 = true;
                break;
            }
        }
        System.out.println(hasNumberGreaterThan100);
        boolean foundSeven = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 7) {
                System.out.println("The index of the number: " + i);
                foundSeven = true;
                break;
            }
        }
        if (!foundSeven) {
            System.out.println("-1");
        }
        System.out.println();
        System.out.println("Sum/prod" + "\n");
        int sum = 0;
        long product = 1;
        for (int number : array) {
            sum += number;
            product *= number;
        }
        System.out.println("The sum of the elements in the array is: " + sum);
        System.out.println("The product of the elements in the array is: " + product);
        int strangeSum = 0;
        for (int i = 0; i < array.length; i++) {
            if ((i + 1) % 4 == 0) {
                strangeSum -= array[i];
            } else {
                strangeSum += array[i];
            }
        }
        System.out.println("The following sum is: " + strangeSum);
    }
}
