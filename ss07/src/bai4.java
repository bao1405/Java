import java.util.Scanner;
public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringBuilder sb = new StringBuilder(str);
        String str2 = sb.reverse().toString().toLowerCase();
        if (str.toLowerCase().equals(str2))  {
            System.out.println("Chuỗi đối xứng.");
        }else {
            System.out.println("Chuỗi không đối xứng.");
        }
    }
}
