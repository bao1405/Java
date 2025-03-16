import java.util.Scanner;
import java.util.regex.*;
public class bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi: ");
        String str = scanner.nextLine();
        String[] word = str.split("\\s");
        Pattern pattern = Pattern.compile(".*[^a-zA-Z0-9].*");
        int count = 0;
        for (int i = 0; i < word.length; i++) {
            Matcher matcher = pattern.matcher(word[i]);
            if (matcher.matches()) {
                count++;
            }
        }
        if (count == word.length) {
            System.out.print("Số từ có chứ ký tự đặc biệt: ");
            System.out.printf("%d\n",count);
            for (int i = 0; i < word.length; i++) {
                Matcher matcher = pattern.matcher(word[i]);
                if (matcher.matches()) {
                    System.out.println("'" + word[i] + "'");
                }
            }
        }else {
            System.out.print("Không có ký tự đặc biệt");
        }
    }
}