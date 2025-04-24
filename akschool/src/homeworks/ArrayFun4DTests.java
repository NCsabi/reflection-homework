package homeworks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ArrayFun4DTests {
    @Test
    void testCountLowercaseStrings() {
        String[][][][] fourDArray = {
                {
                        {
                                {"One", "Two"},
                                {"Three", "Four"}
                        },
                        {
                                {"five", "six"},
                                {"seven", "eight"}
                        }
                },
                {
                        {
                                {"NINE", "TN"},
                                {"ELEVEN", "TWELVE"}
                        },
                        {
                                {"Thirteen", "Fourteen"},
                                {"Fifteen", "Sixteen"}
                        }
                }
        };
        Assertions.assertEquals(4, ArrayFun4D.countLowercaseStrings(fourDArray));
    }

    @Test
    void testReverseStringsIn4DArray() {
        String[][][][] fourDArray = {
                {
                        {
                                {"One", "Two"},
                                {"Three", "Four"}
                        },
                        {
                                {"five", "six"},
                                {"seven", "eight"}
                        }
                },
                {
                        {
                                {"NINE", "TN"},
                                {"ELEVEN", "TWELVE"}
                        },
                        {
                                {"Thirteen", "Fourteen"},
                                {"Fifteen", "Sixteen"}
                        }
                }
        };

        String[][][][] expected = {
                {
                        {
                                {"enO", "owT"},
                                {"eerhT", "ruoF"}
                        },
                        {
                                {"evif", "xis"},
                                {"neves", "thgie"}
                        }
                },
                {
                        {
                                {"ENIN", "NT"},
                                {"NEVELE", "EVLEWT"}
                        },
                        {
                                {"neetrihT", "neetruoF"},
                                {"neetfiF", "neetxiS"}
                        }
                }
        };
        Assertions.assertArrayEquals(expected, ArrayFun4D.reverseStringsIn4DArray(fourDArray));
    }

    @Test
    void testCalculateAverageStringLength() {
        String[][][][] fourDArray = {
                {
                        {
                                {"One", "Two"},
                                {"Three", "Four"}
                        },
                        {
                                {"five", "six"},
                                {"seven", "eight"}
                        }
                },
                {
                        {
                                {"NINE", "TN"},
                                {"ELEVEN", "TWELVE"}
                        },
                        {
                                {"Thirteen", "Fourteen"},
                                {"Fifteen", "Sixteen"}
                        }
                }
        };
        Assertions.assertEquals(5, ArrayFun4D.calculateAverageStringLength(fourDArray));
    }

    @Test
    void testFilterByVowelCount() {
        String[][][][] fourDArray = {
                {
                        {
                                {"aaaaaaaaa", "ee"},
                                {"ooo", "oue"}
                        },
                        {
                                {"five", "six"},
                                {"seven", "eight"}
                        }
                },
                {
                        {
                                {"NINE", "TN"},
                                {"ELEVEN", "TWELVE"}
                        },
                        {
                                {"Thirteen", "Fourteen"},
                                {"Fifteen", "Sixteen"}
                        }
                }
        };
        List<String> expected = new ArrayList<>(List.of("aaaaaaaaa", "ooo", "oue", "ELEVEN", "Thirteen", "Fourteen", "Fifteen", "Sixteen"));
        Assertions.assertEquals(expected, ArrayFun4D.filterByVowelCount(fourDArray));
    }

    @Test
    void testFindShortestString() {
        String[][][][] fourDArray = {
                {
                        {
                                {"One", "Two"},
                                {"Three", "Four"}
                        },
                        {
                                {"five", "six"},
                                {"seven", "eight"}
                        }
                },
                {
                        {
                                {"NINE", "TN"},
                                {"ELEVEN", "TWELVE"}
                        },
                        {
                                {"Thirteen", "Fourteen"},
                                {"Fifteen", "Sixteen"}
                        }
                }
        };
        Assertions.assertEquals("TN", ArrayFun4D.findShortestString(fourDArray));
    }
}