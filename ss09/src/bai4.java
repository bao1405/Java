import java.util.Scanner;

class Circle{
    private double radius;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(Scanner scanner) {
        System.out.println("nhap ban kinh cho hinh tron moi: ");
        this.radius = scanner.nextDouble();
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public void display() {
        System.out.println("bán kính : " + radius);
        System.out.println("diện tích hình tròn : "+getArea());
        System.out.println("chu vi hình tròn : "+getCircumference());
    }
}

public class bai4 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("hình tròn mặc định");
        c1.display();
        Scanner scanner = new Scanner(System.in);
        c1.setRadius(scanner);
        System.out.println("hình tròn mới");
        c1.display();
    }
}
