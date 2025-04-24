package homeworks;

public class StringSmallExercises {
    public static void main(String[] args) {
        String mixedString = "gjbnBnBBoijdBBsd";
        String mixedHelloString = "ahElloeorldhelloaworldHELLOhello"; //"EZEN MÉG DOLGOZOM"
        System.out.println(countOccurrencesOfB(mixedString));
    }

//returns how many times “hello” is repeated in that String. Check how the substring method works to solve this exercise. For example:
//”lovely string” → should return 0
//”helloabcdhelloasvbhellogdvmhello” ->should return 4
 //
 //Megszámolja, hányszor ismétlődik a "hello" szó az adott sztringben. Ehhez használd a substring metódust a feladat megoldásához. Példa:
 //"lovely string" → 0-t kell visszaadnia.
 //"helloabcdhelloasvbhellogdvmhello" → 4-et kell visszaadnia.
    public static int countOccurrencesOfB(String mixedString) {
        int counter = 0;
        for (int i = 0; i < mixedString.length(); i++) {
            if(mixedString.charAt(i)== 'B'){
                counter++;
            }
        }
        return counter;
    }
}