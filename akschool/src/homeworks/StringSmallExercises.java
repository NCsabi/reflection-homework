package homeworks;

public class StringSmallExercises {
    public static void main(String[] args) {
        String mixedString = "gjbnBnBBoijdBBsd";
        System.out.println(countOccurrencesOfB(mixedString));
    }

    public static int countOccurrencesOfB(String mixedString) {
        int counter = 0;
        for (int i = 0; i < mixedString.length(); i++) {
            if(mixedString.contains("B")){
                counter++;
            }
        }
        return counter;
    }
    //próba
    //stringből--> array tömb, bejárni ciklussal. irni egy metódust a .contains-ra majd
    //ahányszor true-val tér vissza növelni a számlálót.

}