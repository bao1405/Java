import java.util.Scanner;
public class bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        if (n < 1 || n > 1000) {
            System.out.println("Độ dài từ 1-1000");
        }
        String character = "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm1234567890";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int index = (int) (Math.random() * character.length());
            sb.append(character.charAt(index));
        }
        System.out.println(sb.toString());
    }
}