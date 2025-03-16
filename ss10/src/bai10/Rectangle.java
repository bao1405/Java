package bai10;

public class Rectangle extends Shape {
    double width;
    double height;

    public Rectangle(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "Rectangle [Name: " + name + ", Width: " + width + ", Height: " + height + ", Area: " + calculateArea() + ", Perimeter: " + calculatePerimeter() + "]";
    }
}

