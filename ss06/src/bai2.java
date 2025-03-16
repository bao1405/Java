import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập địa chỉ email: ");
        String email = scanner.nextLine().trim();
        String emailRegex = "^[a-zA-Z0-9._]+@[a-zA-Z.]+\\.[a-zA-Z]{2,6}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            System.out.println("Email hợp lệ.");
        } else {
            System.out.println("Email không hợp lệ.");
        }
    }
}