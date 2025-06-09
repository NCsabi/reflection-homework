package oop_shapes;

public class Circle extends Shape {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        return Math.PI * 2 * radius;
    }

    @Override
    public double calculateArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}