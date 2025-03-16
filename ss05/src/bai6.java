import java.util.Scanner;
public class bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhập số lượng phần tử của mảng (1 - 1000): ");
            n = scanner.nextInt();
            if (n < 1 || n > 1000) {
                System.out.println("Vui lòng nhập số lượng phần tử hợp lệ (1 - 1000)!");
            }
        } while (n < 1 || n > 1000);
        int[] originalArray = new int[n];
        System.out.println("Nhập " + n + " số nguyên trong khoảng từ 1 đến 1000:");
        for (int i = 0; i < n; i++) {
            do {
                System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
                originalArray[i] = scanner.nextInt();
                if (originalArray[i] < 1 || originalArray[i] > 1000) {
                    System.out.println("Vui lòng nhập số từ 1 đến 1000!");
                }
            } while (originalArray[i] < 1 || originalArray[i] > 1000);
        }

        int[] markingArray = new int[1001];

        for (int num : originalArray) {
            markingArray[num]++;
        }

        int maxCount = 0;
        for (int count : markingArray) {
            if (count > maxCount) {
                maxCount = count;
            }
        }

        System.out.println("\nCác phần tử xuất hiện nhiều nhất:");
        for (int i = 1; i <= 1000; i++) {
            if (markingArray[i] == maxCount) {
                System.out.println("Số " + i + " xuất hiện " + maxCount + " lần");
            }
        }

        scanner.close();
    }
}
