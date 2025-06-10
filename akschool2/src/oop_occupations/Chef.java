package oop_occupations;

public class Chef extends Person {
    public Chef() {
        super(); //Meghívja a szülő konstruktorát
    }

    public Chef(int age, String name, Gender gender) {
        super(age, name, gender);
    }

    @Override
    public void introduce() {
        System.out.println("Hi, my name is " + getName() + ". I am " + getAge() + ". I am " + getGender() + " and a chef.");
        ;
    }

    public String cook(String food) {
        return getName() + " has cooked some" + food + ".";
    }
}
