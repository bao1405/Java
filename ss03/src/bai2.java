import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất: ");
        int a = sc.nextInt();
        System.out.print("Nhập số thứ hai: ");
        int b = sc.nextInt();
        System.out.print("Nhập số thứ ba: ");
        int c = sc.nextInt();

        // Kiểm tra nếu cả ba số bằng nhau
        if (a == b && b == c) {
            System.out.println("Ba số nguyên bằng nhau");
        } else {
            int max;
            if (a >= b && a >= c) {
                max = a;
            } else if (b >= a && b >= c) {
                max = b;
            } else {
                max = c;
            }
            System.out.println("Số lớn nhất là: " + max);
        }
    }
}
