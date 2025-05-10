package homeworks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExamPracticeMediumTests {
    @Test
    void testCheckAllTrueValuesForTrue() {
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
        Assertions.assertTrue(ExamPracticeMedium.checkAllTrueValues(fourDArray));
    }

    @Test
    void testCheckAllTrueValuesForFalse() {
        boolean[][][][] fourDArray = {
                {
                        {
                                {true, true},
                                {false, true}
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
        Assertions.assertFalse(ExamPracticeMedium.checkAllTrueValues(fourDArray));
    }

    @Test
    void testMultiplyElementsByIndexAndSum() {
        int[] numbers = {2, 6, 11, 0};
        Assertions.assertEquals(28, ExamPracticeMedium.multiplyElementsByIndexAndSum(numbers));
    }

    @Test
    void testMultiplyElementsByIndexAndSum2() {
        int[] numbers = {0, -4, -12, 4, -3};
        Assertions.assertEquals(-28, ExamPracticeMedium.multiplyElementsByIndexAndSum(numbers));
    }

    @Test
    void testApplyRepeatingMultiplierAndSum() {
        int[] numbers = {2, -3, 4, 5, -6, 7};
        Assertions.assertEquals(-10, ExamPracticeMedium.applyRepeatingMultiplierAndSum(numbers));
    }

    @Test
    void testCalculateOddEvenWeightedSum() {
        int[] numbers = {2, 4, 6, 8, 10, 12};
        Assertions.assertEquals(30, ExamPracticeMedium.calculateOddEvenWeightedSum(numbers));
    }
}
