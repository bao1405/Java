import java.util.Scanner;

class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
        this.length = 1;
        this.width = 1;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void setDimensions(Scanner scanner) {
        System.out.println("Nhập chiều dài hình chữ nhật mới:");
        this.length = scanner.nextDouble();
        System.out.println("Nhập chiều rộng hình chữ nhật mới:");
        this.width = scanner.nextDouble();
    }

    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        return 2 * (this.length + this.width);
    }

    public void display() {
        System.out.println("Chiều dài: " + this.length + " | Chiều rộng: " + this.width);
        System.out.println("Diện tích hình chữ nhật: " + getArea());
        System.out.println("Chu vi hình chữ nhật: " + getPerimeter());
    }
}

public class bai3 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        System.out.println("hình chữ nhật mặc định\n");
        r1.display();
        Scanner scanner = new Scanner(System.in);
        r1.setDimensions(scanner);
        System.out.println("hình chữ nhật mới\n");
        r1.display();
    }
}
