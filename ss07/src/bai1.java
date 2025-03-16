import java.util.Scanner;
public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi thứ nhất");
        String str1 = scanner.nextLine();
        System.out.println("Nhập chuỗi thứ 2");
        String str2 = scanner.nextLine();
        System.out.println("Nhập chuỗi thứ 3");
        String str3 = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        sb.append(str1).append(" ").append(str2).append(" ").append(str3);
        System.out.println(sb.toString().toUpperCase());
    }
}