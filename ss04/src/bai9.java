import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhập số nguyên dương n:");
            n= scanner.nextInt();
            if (n<= 0) {
                System.out.println("Số nhập vào không hợp lệ! Vui lòng nhập lại.");
            }
        } while (n<= 0);
        System.out.println("Các số Palindrome từ 1 đến " +n + " là:");

        for (int num = 1; num <=n; num++) {
            int original = num, reversed = 0, temp = num;

            while (temp > 0) {
                int digit = temp % 10;
                reversed = reversed * 10 + digit;
                temp /= 10;
            }

            if (original == reversed) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}
