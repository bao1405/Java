import java.util.Scanner;
public class bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String str1 = str.trim().replaceAll("\\s+", " ");
        String[] words = str1.split(" ");
        StringBuilder reverseWord = new StringBuilder();
        for (int i = words.length - 1; i >= 0 ; i--) {
            reverseWord.append(words[i]).append(" ");
        }
        System.out.println(reverseWord);
    }
}