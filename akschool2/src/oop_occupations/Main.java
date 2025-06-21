package oop_occupations;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person(),
                new Person(),
                new Person(),
                new Person(),
                new Person(),
                new Person(30, "Jenő", Gender.MAN),
                new Person(25, "Jolán", Gender.WOMAN),
                new Person(40, "Kristóf", Gender.UNDEFINED),
                new Person(18, "Gizi", Gender.WOMAN),
                new Person(56, "Józsi", Gender.MAN),
                new Chef(),
                new Chef(),
                new Chef(),
                new Chef(),
                new Chef(),
                new Chef(60, "Béla", Gender.MAN),
                new Chef(22, "Klaudia", Gender.WOMAN),
                new Chef(27, "Lecsó", Gender.UNDEFINED),
                new Chef(40, "Ica", Gender.WOMAN),
                new Chef(36, "Karcsi", Gender.MAN)
        );
        for (Person person : people) {
            person.introduce();
            person.printGoal();

            if (person instanceof Chef chef) {  //tipus ellenőrzés, azt vizsgálja, hogy az objektum egy adott osztály példánya-e
                System.out.println(chef.cook("broccoli"));
            }
        }

    }
}
