import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("nhập số nguyên dương N : ");
        int n = sc.nextInt();
        int sum = 0;
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            System.out.printf("tổng các số từ 1 tới %d là : %d",n,sum);
        }else {
            System.out.printf("số nhập không hợp lệ");
        }
    }
}
