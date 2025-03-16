import java.util.Scanner;
public class bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb =  new StringBuilder();
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (i < str.length() - 1 && str.charAt(i + 1) == c) {
                count++;
            }
            else {
                sb.append(c).append(count);
                count = 1;
            }
        }
        System.out.println(sb.toString());
    }
}