import java.util.Scanner;
public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử trong mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = scanner.nextInt();
        }
        int countEvent = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                countEvent++;
            }
        }
        System.out.println("tổng số lượng chẵn là: " + countEvent);
    }
}
