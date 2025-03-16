import java.util.Scanner;
import java.util.regex.*;
public class bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập URL cần kiểm tra: ");
        String url = scanner.nextLine();
        String regex = "^(https?)://([^/]+)(/.*)?$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(url);
        if (matcher.find()) {
            String protocol = matcher.group(1);
            String domain = matcher.group(2);
            String path = matcher.group(3) != null ? matcher.group(3) : "/";
            System.out.println("Giao thức: " + protocol);
            System.out.println("Tên miền: " + domain);
            System.out.println("Đường dẫn: " + path);
        } else {
            System.out.println("URL không hợp lệ");
        }
    }
}