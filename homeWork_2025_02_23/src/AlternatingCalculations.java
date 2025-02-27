public class AlternatingCalculations {
    public static void main(String[] args) {
        int[] array = {3, 5, 7, 2, 6, 9, 1, 8, 1, 4};

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
        System.out.println("2. Alternating Multiplication and Division: ");
        double multAndDivResults = 1;
        for (int i = 0; i < array.length; i++) {
            if((i+1) % 3 == 0){
                multAndDivResults /= array[i];
            }else{
                multAndDivResults *= array[i];
            }
        }
        System.out.println(multAndDivResults);
    }
}
