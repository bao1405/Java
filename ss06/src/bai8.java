import java.util.Scanner;
public class bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng số điện thoại: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập số điện thoại " + (i + 1) + ": ");
            String phone = scanner.nextLine().replaceAll("[ .-]", "");
            if (phone.matches("0\\d{9}")) {
                phone = "+84" + phone.substring(1);
                System.out.println("Số hợp lệ: " + phone);
            } else if (phone.matches("\\+84\\d{9}")) {
                System.out.println("Số hợp lệ: " + phone);
            } else {
                System.out.println("Số điện thoại không hợp lệ");
            }
        }
    }
}