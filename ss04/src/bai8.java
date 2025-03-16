import java.util.Scanner;
public class bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        do {
            System.out.print("Nhập số nguyên dương N: ");
            if (n <= 0) {
                System.out.println("Số nhập vào không hợp lệ! Vui lòng nhập lại.");
            }
        } while (n <= 0);

        System.out.println("Các số Armstrong từ 1 đến " + n + " là:");
        for (int num = 1; num <= n; num++) {
            int temp = num, sum = 0, count = 0;
            int tempCount = num;
            while (tempCount > 0) {
                count++;
                tempCount /= 10;
            }
            temp = num;
            while (temp > 0) {
                int digit = temp % 10;
                int power = 1;
                for (int i = 0; i < count; i++) {
                    power *= digit;
                }
                sum += power;
                temp /= 10;
            }
            if (sum == num) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}
