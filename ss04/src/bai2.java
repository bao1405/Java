import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên n :");
        int n = sc.nextInt();
        if (n<2){
            System.out.printf("%d Không phải là số nguyên tố",n);
        }else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    System.out.printf("%d không phải là số nguyên tố ", n);
                }
            }
            System.out.printf("%d là số nguyên tố",n);
        }
    }
}
