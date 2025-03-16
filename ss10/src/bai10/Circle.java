package bai10;

public class Circle extends Shape {
    double radius;
    static final double PI = 3.14159;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }


    @Override
    public double calculateArea() {
        return PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public String toString() {
        return "Circle [Name: " + name + ", Radius: " + radius + ", Area: " + calculateArea() + ", Perimeter: " + calculatePerimeter() + "]";
    }
}
