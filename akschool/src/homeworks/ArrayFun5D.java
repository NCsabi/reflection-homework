package homeworks;

import java.util.Arrays;

public class ArrayFun5D {
    public static void main(String[] args) {
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

        System.out.println(countStringsWithoutEOrR(fiveDArray));
        System.out.println(Arrays.deepToString(replaceStringsWithLengths5D(fiveDArray)));
        System.out.println(countCharactersInMatchingStrings(fiveDArray));
        System.out.println(concatenateAllStrings(fiveDArray));
    }

    //4, Write a method in which you return one big string, which is the concatenation of all strings.
    public static String concatenateAllStrings(String[][][][][] fiveDArray) {
        StringBuilder concatenatedStrings = new StringBuilder();
        for (String[][][][] fourDArray : fiveDArray) {
            for (String[][][] threeDArray : fourDArray) {
                for (String[][] twoDArray : threeDArray) {
                    for (String[] oneDArray : twoDArray) {
                        for (String text : oneDArray) {
                            concatenatedStrings.append(text);
                        }
                    }
                }
            }
        }
        return concatenatedStrings.toString();
    }

    //3, Write a method in which you return the total number of characters across all strings that start and end with the same letter.
    public static int countCharactersInMatchingStrings(String[][][][][] fiveDArray) {
        int counter = 0;
        for (String[][][][] fourDArray : fiveDArray) {
            for (String[][][] threeDArray : fourDArray) {
                for (String[][] twoDArray : threeDArray) {
                    for (String[] oneDArray : twoDArray) {
                        for (String text : oneDArray) {
                            if (text.charAt(text.length() - 1) == text.charAt(0)) {
                                counter += text.length();
                            }
                        }
                    }
                }
            }
        }
        return counter;
    }

    //2, Write a method in which you return a new 5D array with all strings replaced by their lengths.
    public static int[][][][][] replaceStringsWithLengths5D(String[][][][][] fiveDArray) {
        int[][][][][] lengths = new int[fiveDArray.length][][][][];
        for (int i = 0; i < fiveDArray.length; i++) {
            lengths[i] = new int[fiveDArray.length][][][];
            for (int j = 0; j < fiveDArray[i].length; j++) {
                lengths[i][j] = new int[fiveDArray[i][j].length][][];
                for (int k = 0; k < fiveDArray[i][j].length; k++) {
                    lengths[i][j][k] = new int[fiveDArray[i][j][k].length][];
                    for (int l = 0; l < fiveDArray[i][j][k].length; l++) {
                        lengths[i][j][k][l] = new int[fiveDArray[i][j][k][l].length];
                        for (int m = 0; m < fiveDArray[i][j][k][l].length; m++) {
                            lengths[i][j][k][l][m] = fiveDArray[i][j][k][l][m].length();
                        }
                    }
                }
            }
        }
        return lengths;
    }

    //1, Write a method in which you return the number of strings that do not contain the letters “e”, “E”, or “r”.
    public static int countStringsWithoutEOrR(String[][][][][] fiveDArray) {
        int counter = 0;
        for (String[][][][] fourDArray : fiveDArray) {
            for (String[][][] threeDArray : fourDArray) {
                for (String[][] twoDArray : threeDArray) {
                    for (String[] oneDArray : twoDArray) {
                        for (String text : oneDArray) {
                            if (isExcluded(text)) {
                                counter++;
                            }
                        }
                    }
                }
            }
        }
        return counter;
    }

    public static boolean isExcluded(String text) {
        return !(text.contains("e") || text.contains("E") || text.contains("r"));
    }
}