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
        System.out.printf("Hi, my name is %s. I am %d. I am %s and a chef.%n",
                getName(), getAge(), getGender());
        ;
    }

    public String cook(String food) {
        return String.format("%s has cooked some %s.", getName(), food);
    }
}
