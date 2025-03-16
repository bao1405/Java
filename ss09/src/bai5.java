import java.sql.SQLOutput;

class Vector2D{
    private double x;
    private double y;

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Double caculateMagnitude() {
        return Math.sqrt(x * x + y * y);
    }

    public Vector2D add(Vector2D v) {
        return new Vector2D(this.x + v.x, this.y + v.y);
    }

    public Vector2D subtract(Vector2D v) {
        return new Vector2D(this.x - v.x, this.y - v.y);
    }

    public double dotProduct(Vector2D v) {
        return this.x * v.x + this.y * v.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public void displayVector() {
        System.out.println("tạo độ vector là: x = " + x + ", y = " + y);
        System.out.println("độ dài của vector là :" + caculateMagnitude());
    }

}
public class bai5 {
    public static void main(String[] args) {
        Vector2D v1 = new Vector2D(1.1, 1.2);
        Vector2D v2 = new Vector2D(2.2, 2.3);
        System.out.print("Vector 1: ");
        v1.displayVector();
        System.out.print("Vector 2: ");
        v2.displayVector();

        Vector2D sum = v1.add(v2);
        System.out.print("Tổng của Vector 1 và Vector 2: ");
        sum.displayVector();

        Vector2D difference = v1.subtract(v2);
        System.out.print("Hiệu của Vector 1 và Vector 2: ");
        difference.displayVector();

        double dotProduct = v1.dotProduct(v2);
        System.out.println("Tích vô hướng của Vector 1 và Vector 2: " + dotProduct);
    }
}
