import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int[] numbers = new int[10];
//
//        int[] numbers2 = {1, 2, 3, 4, 5};
//
//        System.out.println(numbers.length);
//        System.out.println(numbers2.length);
//
//        int firstNumber = numbers2[0];
//        int secondNumber = numbers2[1];
//        int thirdNumber = numbers2[2];
//        int fourthNumber = numbers2[3];
//        int fifthNumber = numbers2[4];
//
//        System.out.println(secondNumber);
//        System.out.println(Arrays.toString(numbers));
//        System.out.println(Arrays.toString(numbers2));
//
//        int[][] matrix = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//
//        };
//
//        System.out.println(matrix[0][0]);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 12: ");
        byte number = scanner.nextByte();

        switch (number) {
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Az adott hónap 30 napos");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Az adott hónap 31 napos");
                break;
            case 2:
                System.out.println("Az adott hónap 28/29 napos");
                break;
            default:
                System.out.println("Hibás értéket adott meg");
        }

//        Kérj be egy user inputot, és döntsd el róla, hogy mennyei szám-e! A mennyei számok a következőek:
//
//        100-nál kisebb páros számok, melyek nem oszthatóak 7-tel (negatív számok is!)
///       300-nál nagyobb 13-mal osztható számok, amelyeknek 8-nál több darab osztójuk van
//        Példák az elvárt kimenetre:
//        n = 3 → ,,A(z) 3 nem mennyei szám!”
//        n = 20 → ,,A(z) 20 mennyei szám!”
//        n = 28 → ,,A(z) 28 nem mennyei szám!”
//        n = 250 → ,,A(z) 250 nem mennyei szám!”
//        n = 520 → ,,A(z) 520 mennyei szám!”
//        n = 521 → ,,A(z) 521 nem mennyei szám!”
//        n = -20 → ,,A(z) -20 mennyei szám!”
//        n = 4200 → ,,A(z) 4200 nem mennyei szám!”
//        n = 307 → ,,A(z) 307 nem mennyei szám!”
//        n = 2197 → ,,A(z) 2197 nem mennyei szám!”




    }
}