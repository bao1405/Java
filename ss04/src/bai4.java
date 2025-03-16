import java.util.Scanner;
public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;
        do {
            System.out.print("Nhập một số (Nhập 0 để thoát): ");
            number = scanner.nextInt();
            sum += number;
        } while (number != 0);

        System.out.println("Tổng các số đã nhập: " + sum);
    }
}
