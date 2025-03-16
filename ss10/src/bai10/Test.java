package bai10;

public class Test {
    public static void main(String[] args) {
        Shape circle = new Circle("Circle", 5.0);
        Shape rectangle = new Rectangle("Rectangle", 4.0, 6.0);
        Shape triangle = new Triangle("Triangle", 3.0, 4.0, 5.0);
        Shape[] shapes = new Shape[3];
        shapes[0] = circle;
        shapes[1] = rectangle;
        shapes[2] = triangle;

        for (Shape shape : shapes) {
            System.out.println(shape.toString());
        }
    }
}
