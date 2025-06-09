package oop_shapes;

public class RegularHexagon extends Shape {
    private double side;

    public RegularHexagon() {
    }

    public RegularHexagon(double side) {
        this.side = side;
    }

    @Override
    public double calculatePerimeter() {
        return side * 6;
    }

    @Override
    public double calculateArea() {
        return (3 * Math.sqrt(3) / 2) * Math.pow(side, 2);
    }

    public void setSide(double side) {
        this.side = side;
    }
}