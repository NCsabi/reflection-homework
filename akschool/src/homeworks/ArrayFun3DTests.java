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
        int[] expected = {5, 6, 4, 5, 4, 5, 6, 10, 10, 7, 5, 5, 8, 5, 5, 5, 1, 5};
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
                        {"apple", "banana", "pear"},
                        {"lemons", "kiwi", "mango"},
                        {"orange", "strawberry", "watermelon"}
                },
                {
                        {"rotator", "level", "radar"},
                        {"building", "madam", "money"},
                        {"brick", "e", "plane"}
                }
        };
        Assertions.assertTrue(ArrayFun3D.checkSEndingInNestedArrays(words));
    }
}
