package oop_shapes;

public abstract class Shape {
    public abstract double calculatePerimeter();

    public abstract double calculateArea();

    @Override
    public String toString() {
        return String.format("%s Perimeter: %.2f, Area: %.2f",
                this.getClass().getSimpleName(), calculatePerimeter(), calculateArea());
    }
}
