package homeworks;

public class ExamPracticeMedium {
    public static void main(String[] args) {
        boolean[][][][] fourDArray = {
                {
                        {
                                {true, true},
                                {true, true}
                        },
                        {
                                {true, true},
                                {true, true}
                        }
                },
                {
                        {
                                {true, true},
                                {true, true}
                        },
                        {
                                {true, true},
                                {true, true}
                        }
                }
        };
        System.out.println(checkAllTrueValues(fourDArray));
        int[] numbers = {2, 4, 6};
        System.out.println(multiplyElementsByIndexAndSum(numbers));
        int[] array = {1, 2, 3, 4};
        System.out.println(applyRepeatingMultiplierAndSum(array));
        System.out.println(calculateOddEvenWeightedSum(array));
    }

    public static int calculateOddEvenWeightedSum(int[] array) {
        int odd = 0;
        int even = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 1) {
                odd += array[i] * 2;
            } else {
                even += array[i];
            }
        }
        return odd - even;
    }

    public static int applyRepeatingMultiplierAndSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 4 == 0) {
                sum += array[i];
            } else if (i % 4 == 1) {
                sum += array[i] * 2;
            } else if (i % 4 == 2) {
                sum -= array[i];
            } else {
                sum -= array[i] * 2;
            }
        }
        return sum;
    }

    public static int multiplyElementsByIndexAndSum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i] * i;
        }
        return sum;
    }

    public static boolean checkAllTrueValues(boolean[][][][] array) {
        for (boolean[][][] threeDArray : array) {
            for (boolean[][] twoDArray : threeDArray) {
                for (boolean[] oneDArray : twoDArray) {
                    for (boolean status : oneDArray) {
                        if (!status) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
