import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số nguyên dương N : ");
        int n = sc.nextInt();
        if (n > 0) {
            System.out.printf("bảng cứu chương %d là:\n", n);
            for (int i = 1; i <= 10; i++) {
                System.out.println(n+"x"+i +"="+(n*i));
            }
        }else {
            System.out.printf("số nhập không hợp lệ");
        }
    }
}
