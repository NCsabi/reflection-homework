package oop_occupations;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        Person person5 = new Person();
        Person person6 = new Person(30, "Jenő", Gender.MAN);
        Person person7 = new Person(25, "Jolán", Gender.WOMAN);
        Person person8 = new Person(40, "Kristóf", Gender.UNDEFINED);
        Person person9 = new Person(18, "Gizi", Gender.WOMAN);
        Person person10 = new Person(56, "Józsi", Gender.MAN);

        Chef chef1 = new Chef();
        Chef chef2 = new Chef();
        Chef chef3 = new Chef();
        Chef chef4 = new Chef();
        Chef chef5 = new Chef();
        Chef chef6 = new Chef(60, "Béla", Gender.MAN);
        Chef chef7 = new Chef(22, "Klaudia", Gender.WOMAN);
        Chef chef8 = new Chef(27, "Lecsó", Gender.UNDEFINED);
        Chef chef9 = new Chef(40, "Ica", Gender.WOMAN);
        Chef chef10 = new Chef(36, "Karcsi", Gender.MAN);

        person1.introduce();
        person1.printGoal();
        person6.introduce();
        person6.printGoal();
        person8.introduce();
        person8.printGoal();
        chef1.introduce();
        chef1.printGoal();
        chef6.introduce();
        chef6.printGoal();
        chef8.introduce();
        chef8.printGoal();
        System.out.println(chef6.cook("pizza"));
        System.out.println(chef8.cook("fish"));
    }
}
