import java.util.Scanner;
public class NameCard {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("***************************************");
        System.out.println("  + NAME: Csaba Nagy                +");
        System.out.println("***************************************");
        System.out.println("  + Age: 47                         +");
        System.out.println("***************************************");
        System.out.println("  + E-mail: n.csabi1977@gmail.com   +");
        System.out.println("***************************************");
        System.out.println("  + Phone: +36302535768             +");
        System.out.println("***************************************");
        System.out.println("  + LinkedIn: https://olyanom.nincs +");
        System.out.println("***************************************");
        
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your age: ");
        byte age = Byte.parseByte(sc.nextLine());
        System.out.println("Enter your phone number: ");
        String phone = sc.nextLine();
        System.out.println("Enter your email: ");
        String email = sc.nextLine();
        System.out.println("Enter your LinkedIn: ");
        String linkedIn = sc.nextLine();
        String[] data = {name,phone,email,linkedIn};
        int maxLong = calculateMaxStringLength(data);
        String[] title = {"Name: ","Age: ","Phone: ","E-mail: ","LinkedIn"};
        int maxTitle = calculateMaxStringLength(title);
        int lineLength = maxTitle + maxLong + 7;
        String line = new String(new char[lineLength]).replace("\0", "-");
        String dot = new String(new char[lineLength]).replace("\0", ".");
        String nameCard = String.format("%s \n"+" * %-" + maxTitle + "s %-" + maxLong + "s *\n" + "%s \n"+
                        " * %-" + maxTitle + "s %-" + maxLong + "d *\n" + "%s \n"+
                        " * %-" + maxTitle + "s %-" + maxLong + "s *\n" + "%s \n"+
                        " * %-" + maxTitle + "s %-" + maxLong + "s *\n" + "%s \n"+
                        " * %-" + maxTitle + "s %-" + maxLong + "s *\n"+ "%s" ,
                line,title[0], name, dot, title[1], age, dot, title[2], phone, dot,
                title[3], email, dot, title[4], linkedIn, line);
        System.out.println();
        System.out.println(nameCard);
    }
    public static int calculateMaxStringLength(String[] counter) {
        int max = 0;
        for (int i = 0; i < counter.length; i++) {
            if (counter[i].length() > max) {
                max = counter[i].length();
            }
        }
        return max;
    }
}