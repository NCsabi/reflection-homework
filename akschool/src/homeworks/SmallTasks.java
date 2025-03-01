package homeworks;

import java.math.BigDecimal;
import java.sql.SQLOutput;
import java.util.Scanner;

public class SmallTasks {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Task one: ");
        double numberA = 0.1;
        double numberB = 0.2;
        double sum = numberA + numberB;
        System.out.println(sum);
        //az eredmény: 0.3000004 = double precision problems (double pontossági problémák).
        BigDecimal correctedSum = BigDecimal.valueOf(numberA).add(BigDecimal.valueOf(numberB));// A big decimal osztály arra jó hogy teljes pontossággal lehessen ilyen müveleteket csinálni.
        System.out.println(correctedSum);

        System.out.println("Task two: ");
        System.out.println("Please enter the first number: ");
        int numberOne = sc.nextInt();
        System.out.println("Please enter the second number: ");
        int numberTwo = sc.nextInt();
        System.out.println("Please enter the third number: ");
        int numberThree = sc.nextInt();

        if (numberOne + numberTwo + numberThree == 180) {
            System.out.println("The sum is equals to 180");
        } else {
            System.out.println("The sum is not equals to 180");
        }
        //System.out.println(Long.MAX_VALUE); Long hosszának kiíratása.
        //System.out.println(Long.MIN_VALUE); Long hosszának kiíratása. A nulla miatt a max értékből veszünk el 1et
        System.out.println("Task three: ");
        System.out.println("Please enter a number: ");
        int oneNumber = sc.nextInt();
        if (oneNumber > 0) {
            System.out.println("The number is positive");
        } else if (oneNumber < 0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is equal 0");
        }

        System.out.println("Task four: ");
        System.out.println("Please enter the first number: ");
        int numberFirst = sc.nextInt();
        System.out.println("Please enter the second number: ");
        int numberSecond = sc.nextInt();
        System.out.println("Please enter the third number: ");
        int numberThird = sc.nextInt();
        System.out.println("Please enter the fourth number: ");
        int numberFourth = sc.nextInt();
        if (numberFirst + numberSecond + numberThird == numberFourth) {
            System.out.println("The sum of the three numbers is equal to the sum of the fourth number.");
        } else {
            System.out.println("The sum of the three numbers is equal to the sum of the fourth number.");
        }

        System.out.println("Task five: ");
        System.out.println("Please enter an integer: ");
        int integerForUser = sc.nextInt();
        if (integerForUser > 80) {
            System.out.println("The number greater than 80");
        } else if (integerForUser < 80) {
            System.out.println("The number smaller than 80");
        } else {
            System.out.println("The number and 80 are equals.");
        }

        System.out.println("Task six: ");
        System.out.println("Please enter an integer: ");
        int integerForUserAgain = sc.nextInt();
        if (integerForUserAgain % 7 == 0) {
            System.out.println("The number is divisible by 7");
        } else {
            System.out.println("The number is not divisible by 7");
        }

        System.out.println("Task seven: ");
        System.out.println("Please enter a floating-point number: ");
        double fPNumber = sc.nextDouble();
        if (fPNumber * 6 > 100) {
            System.out.println("The number is greater than 100");
        } else if (fPNumber * 6 < 100) {
            System.out.println("The number is smaller than 100");
        } else {
            System.out.println("The number is equals 100");
        }

        System.out.println("Task eight: ");
        System.out.println("Please enter a text: ");
        sc.nextLine();
        String text = sc.nextLine();
        System.out.println(text.length());

        System.out.println("Task nine: ");
        System.out.println("Please enter two texts: ");
        String textOne = sc.nextLine();
        String textTwo = sc.nextLine();
        System.out.println("The two string's length: " + (textOne.length() + textTwo.length()) + " character.");

        System.out.println("Task ten: ");
    }
}