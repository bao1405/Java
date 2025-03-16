import java.util.Scanner;
public class bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số n: ");
        int n = scanner.nextInt();
        System.out.println("Các số hoàn hảo nhỏ hơn " + n + " là:");
        boolean found = false;
        for (int num = 1; num < n; num++) {
            int sum = 0;
            for (int i = 1; i <= num / 2; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }
            if (sum == num) {
                System.out.println(num);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không có số hoàn hảo nào nhỏ hơn " + n);
        }
    }
}
