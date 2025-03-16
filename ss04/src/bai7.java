import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương N: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Vui lòng nhập số nguyên dương!");
            return;
        }
        System.out.println("Các số Happy nhỏ hơn hoặc bằng " + n + " là:");

        for (int i = 1; i <= n; i++) {
            int slow = i, fast = i;
            do {
                int sum1 = 0, temp = slow;
                while (temp > 0) {
                    int digit = temp % 10;
                    sum1 += digit * digit;
                    temp /= 10;
                }
                slow = sum1;
                int sum2 = 0, temp2 = fast;
                while (temp2 > 0) {
                    int digit = temp2 % 10;
                    sum2 += digit * digit;
                    temp2 /= 10;
                }
                fast = sum2;
                sum2 = 0;
                temp2 = fast;
                while (temp2 > 0) {
                    int digit = temp2 % 10;
                    sum2 += digit * digit;
                    temp2 /= 10;
                }
                fast = sum2;
            } while (slow != fast);
            if (slow == 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
