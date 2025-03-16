import java.util.Scanner;
public class bai9{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào kích thước ma trận vuông: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Ma trận không hợp lệ");
        }else {
            int[][] matrix = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.printf("matrix[%d][%d] = ",i,j);
                    matrix[i][j] = scanner.nextInt();
                }
            }
            for (int i = 0; i < n / 2; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[n - 1 - j][i];
                    matrix[n - 1 - j][i] = matrix[n - 1 - i][n - 1 - j];
                    matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - i];
                    matrix[j][n - 1 - i] = temp;
                }
            }
            System.out.println("Mảng sau khi xoay:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.printf("%5d",matrix[i][j]);
                }
                System.out.println();
            }
        }
    }
}
