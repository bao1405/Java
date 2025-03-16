package bai10;

public class Shape {
    String name;

    public Shape(String name) {
        this.name = name;
    }

    public double calculateArea() {
        return 0.0;
    }

    public double calculatePerimeter() {
        return 0.0;
    }

    @Override
    public String toString() {
        return "Shape [Name: " + name + ", Area: " + calculateArea() + ", Perimeter: " + calculatePerimeter() + "]";
    }
}
