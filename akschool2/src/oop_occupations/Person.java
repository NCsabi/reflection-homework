package oop_occupations;

public class Person {
    private int age;
    private String name;
    private Gender gender;

    public void introduce() {
        System.out.printf("Hi, my name is %s. I am %d. I am %s. %n",
                name, age, gender);
    }

    public void printGoal() {
        System.out.println("My goal is to be happy in the future");
    }

    public Person() {
        this.name = "Unknown";
        this.age = 0;
        this.gender = Gender.UNDEFINED;
    }

    public Person(int age, String name, Gender gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }
}
