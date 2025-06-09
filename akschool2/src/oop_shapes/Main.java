package oop_shapes;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(5);
        System.out.println(circle);
        Rectangle rectangle = new Rectangle(5, 7);
        System.out.println(rectangle);
        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println(triangle);
        RegularHexagon hexagon = new RegularHexagon(11);
        System.out.println(hexagon);
    }
}