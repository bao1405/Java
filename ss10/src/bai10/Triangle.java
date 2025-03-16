package bai10;

public class Triangle extends Shape {
    double a, b, c;

    public Triangle(String name, double a, double b, double c) {
        super(name);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calculateArea() {
        double p = calculatePerimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }

    @Override
    public String toString() {
        return "Triangle [Name: " + name + ", Side a: " + a + ", Side b: " + b + ", Side c: " + c + ", Area: " + calculateArea() + ", Perimeter: " + calculatePerimeter() + "]";
    }
}
