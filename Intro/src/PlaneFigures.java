

public class PlaneFigures {

    public static void main(String[] args) {

        char mark = '*';
        String repeatedChar = Character.toString(mark).repeat(10);

        System.out.println();

        String formattedSquare = String.format("%s\n%s\n%s\n%s\n", repeatedChar, repeatedChar, repeatedChar, repeatedChar);
        System.out.println("Print square: ");
        System.out.println(formattedSquare);

        String formattedRectangle = String.format("%s\n%s\n%s\n", repeatedChar, repeatedChar, repeatedChar);
        System.out.println("Print rectangle: ");
        System.out.println(formattedRectangle);

        String formattedParallelogram = String.format("%13s\n%12s\n%11s\n%10s\n", repeatedChar, repeatedChar, repeatedChar, repeatedChar);
        System.out.println("Print parallelogram: ");
        System.out.println(formattedParallelogram);

        String formatedTrapeze = String.format("%9s\n%10s\n%11s\n%12s\n", "*".repeat(6), "*".repeat(8), "*".repeat(10), "*".repeat(12));
        System.out.println("Print trapeze: ");
        System.out.println(formatedTrapeze);

        String formatedDiamond = String.format("%4s\n%6s\n%7s\n%6s\n%4s\n",
                "*".repeat(1),"*".repeat(5), "*".repeat(7), "*".repeat(5), "*".repeat(1));
        System.out.println("Print diamond: ");
        System.out.println(formatedDiamond);

        String formatedDeltoid = String.format("%5s\n%7s\n%1s\n%8s\n%6s\n%5s"
                , "*".repeat(1),"*".repeat(5),"*".repeat(9), "*".repeat(7), "*".repeat(3),"*".repeat(1));
        System.out.println("Print deltoid: ");
        System.out.println(formatedDeltoid);

        String formatedTriangle = String.format("%5s\n%6s\n%7s\n%8s\n%9s"
                , "*".repeat(1), "*".repeat(3), "*".repeat(5),"*".repeat(7),"*".repeat(9));
        System.out.println("Print triangle: ");
        System.out.println(formatedTriangle);


    }
}
