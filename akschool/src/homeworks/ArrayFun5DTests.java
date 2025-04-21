package homeworks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayFun5DTests {
    @Test
    void testConcatenateALLStrings() {
        String[][][][][] fiveDArray = {
                {
                        {
                                {
                                        {"HELLO", "WORLD"},
                                        {"java", "Backend"}
                                },
                                {
                                        {"FruIt", "TREE"},
                                        {"MI", "isCool"}
                                }
                        },
                        {
                                {
                                        {"KOTLIN", "android"},
                                        {"WINTER", "dirt"}
                                },
                                {
                                        {"sTriNg", "ARRAY"},
                                        {"COMPLEX", "System"}
                                }
                        }
                },
                {
                        {
                                {
                                        {"DIMENSIONS", "five"},
                                        {"ONLY", "practice"}
                                },
                                {
                                        {"Learn", "MORE"},
                                        {"structure", "types"}
                                }
                        },
                        {
                                {
                                        {"UPPER", "refer"},
                                        {"FORMAT", "level"}
                                },
                                {
                                        {"radar", "METHODS"},
                                        {"Objects", "flow"}
                                }
                        }
                }
        };
        String expected = "HELLOWORLDjavaBackendFruItTREEMIisCoolKOTLINandroidWINTERdirtsTriNgARRAYCOMPLEXSystemDIMENSIONSfiveONLYpracticeLearnMOREstructuretypesUPPERreferFORMATlevelradarMETHODSObjectsflow";
        Assertions.assertEquals(expected, ArrayFun5D.concatenateAllStrings(fiveDArray));
    }

    @Test
    void testCountCharactersInMatchingStrings() {
        String[][][][][] fiveDArray = {
                {
                        {
                                {
                                        {"HELLO", "WORLD"},
                                        {"java", "Backend"}
                                },
                                {
                                        {"FruIt", "TREE"},
                                        {"MI", "isCool"}
                                }
                        },
                        {
                                {
                                        {"KOTLIN", "android"},
                                        {"WINTER", "dirt"}
                                },
                                {
                                        {"sTriNg", "ARRAY"},
                                        {"COMPLEX", "System"}
                                }
                        }
                },
                {
                        {
                                {
                                        {"DIMENSIONS", "five"},
                                        {"ONLY", "practice"}
                                },
                                {
                                        {"Learn", "MORE"},
                                        {"structure", "types"}
                                }
                        },
                        {
                                {
                                        {"UPPER", "refer"},
                                        {"FORMAT", "level"}
                                },
                                {
                                        {"radar", "METHODS"},
                                        {"Objects", "flow"}
                                }
                        }
                }
        };
        Assertions.assertEquals(15, ArrayFun5D.countCharactersInMatchingStrings(fiveDArray));
    }

    @Test
    void testReplaceStringsWithLengths5D() {
        String[][][][][] fiveDArray = {
                {
                        {
                                {
                                        {"HELLO", "WORLD"},
                                        {"java", "Backend"}
                                },
                                {
                                        {"FruIt", "TREE"},
                                        {"MI", "isCool"}
                                }
                        },
                        {
                                {
                                        {"KOTLIN", "android"},
                                        {"WINTER", "dirt"}
                                },
                                {
                                        {"sTriNg", "ARRAY"},
                                        {"COMPLEX", "System"}
                                }
                        }
                },
                {
                        {
                                {
                                        {"DIMENSIONS", "five"},
                                        {"ONLY", "practice"}
                                },
                                {
                                        {"Learn", "MORE"},
                                        {"structure", "types"}
                                }
                        },
                        {
                                {
                                        {"UPPER", "refer"},
                                        {"FORMAT", "level"}
                                },
                                {
                                        {"radar", "METHODS"},
                                        {"Objects", "flow"}
                                }
                        }
                }
        };
        int[][][][][] expected = {
                {
                        {
                                {
                                        {5, 5},
                                        {4, 7}
                                },
                                {
                                        {5, 4},
                                        {2, 6}
                                }
                        },
                        {
                                {
                                        {6, 7},
                                        {6, 4}
                                },
                                {
                                        {6, 5},
                                        {7, 6}
                                }
                        }
                },
                {
                        {
                                {
                                        {10, 4},
                                        {4, 8}
                                },
                                {
                                        {5, 4},
                                        {9, 5}
                                }
                        },
                        {
                                {
                                        {5, 5},
                                        {6, 5}
                                },
                                {
                                        {5, 7},
                                        {7, 4}
                                }
                        }
                }
        };
        Assertions.assertArrayEquals(expected, ArrayFun5D.replaceStringsWithLengths5D(fiveDArray));
    }

    @Test
    void testCountStringsWithoutEOrR() {
        String[][][][][] fiveDArray = {
                {
                        {
                                {
                                        {"HELLO", "WORLD"},
                                        {"java", "Backend"}
                                },
                                {
                                        {"FruIt", "TREE"},
                                        {"MI", "isCool"}
                                }
                        },
                        {
                                {
                                        {"KOTLIN", "android"},
                                        {"WINTER", "dirt"}
                                },
                                {
                                        {"sTriNg", "ARRAY"},
                                        {"COMPLEX", "System"}
                                }
                        }
                },
                {
                        {
                                {
                                        {"DIMENSIONS", "five"},
                                        {"ONLY", "practice"}
                                },
                                {
                                        {"Learn", "MORE"},
                                        {"structure", "types"}
                                }
                        },
                        {
                                {
                                        {"UPPER", "refer"},
                                        {"FORMAT", "level"}
                                },
                                {
                                        {"radar", "METHODS"},
                                        {"Objects", "flow"}
                                }
                        }
                }
        };
        Assertions.assertEquals(9, ArrayFun5D.countStringsWithoutEOrR(fiveDArray));
    }
}