import java.util.Scanner;
public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi: ");
        String str = scanner.nextLine();
        String newStr = str.replaceAll("[0-9]","*");
        System.out.println("Kết quả: ");
        System.out.println(newStr);
    }
}