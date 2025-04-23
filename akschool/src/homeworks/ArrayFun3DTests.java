package homeworks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayFun3DTests {
    @Test
    void testCountPalindromes() {
        String[][][] words = {
                {
                        {"apple", "banana", "pear"},
                        {"lemon", "kiwi", "mango"},
                        {"orange", "strawberry", "watermelon"}
                },
                {
                        {"rotator", "level", "radar"},
                        {"building", "madam", "money"},
                        {"brick", "e", "plane"}
                }
        };
        Assertions.assertEquals(5, ArrayFun3D.countPalindromes(words));
    }

    @Test
    void testDeepStringCounter() {
        String[][][] words = {
                {
                        {"apple", "banana", "pear"},
                        {"lemon", "kiwi", "mango"},
                        {"orange", "strawberry", "watermelon"}
                },
                {
                        {"rotator", "level", "radar"},
                        {"building", "madam", "money"},
                        {"brick", "e", "plane"}
                }
        };
        int[] expected = {3, 3, 3, 3, 3, 3};
        Assertions.assertArrayEquals(expected, ArrayFun3D.deepStringCounter(words));
    }

    @Test
    void testConcatenateLongStrings() {
        String[][][] words = {
                {
                        {"apple", "banana", "pear"},
                        {"lemon", "kiwi", "mango"},
                        {"orange", "strawberry", "watermelon"}
                },
                {
                        {"rotator", "level", "radar"},
                        {"building", "madam", "money"},
                        {"brick", "e", "plane"}
                }
        };
        String expected = "applebananapearlemonkiwimangoorangestrawberrywatermelonrotatorlevelradarbuildingmadammoneybrickplane";
        Assertions.assertEquals(expected, ArrayFun3D.concatenateLongStrings(words));
    }

    @Test
    void testFindLongestStringLength() {
        String[][][] words = {
                {
                        {"apple", "banana", "pear"},
                        {"lemon", "kiwi", "mango"},
                        {"orange", "strawberry", "watermelon"}
                },
                {
                        {"rotator", "level", "radar"},
                        {"building", "madam", "money"},
                        {"brick", "e", "plane"}
                }
        };
        Assertions.assertEquals(10, ArrayFun3D.findLongestStringLength(words));
    }

    @Test
    void testCheckSEndingInNestedArraysFalse() {
        String[][][] words = {
                {
                        {"apple", "banana", "pear"},
                        {"lemon", "kiwi", "mango"},
                        {"orange", "strawberry", "watermelon"}
                },
                {
                        {"rotator", "level", "radar"},
                        {"building", "madam", "money"},
                        {"brick", "e", "plane"}
                }
        };
        Assertions.assertFalse(ArrayFun3D.checkSEndingInNestedArrays(words));
    }

    @Test
    void testCheckSEndingInNestedArraysTrue() {
        String[][][] words = {
                {
                        {"apple", "bananas", "pear"},
                        {"lemons", "kiwi", "mango"},
                        {"orange", "strawberrys", "watermelon"}
                },
                {
                        {"rotators", "level", "radar"},
                        {"building", "madams", "money"},
                        {"brick", "es", "plane"}
                }
        };
        Assertions.assertTrue(ArrayFun3D.checkSEndingInNestedArrays(words));
    }
}
