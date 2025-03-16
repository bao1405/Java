import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập văn bản:");
        String inputText = scanner.nextLine();
        if (inputText.isEmpty()) {
            System.out.println("Không có văn bản để xử lý.");
            return;
        }
        String cleanedText = inputText.replaceAll("[^a-zA-Z0-9\\s]", "");
        cleanedText = cleanedText.toLowerCase().trim();
        cleanedText = cleanedText.replaceAll("\\s+", " ");
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(cleanedText);
        System.out.println("Văn bản đã được chuẩn hóa: " + cleanedText.replaceAll("\\d+", ""));
        System.out.print("Danh sách các số trích xuất được: ");
        boolean hasNumbers = false;
        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
            hasNumbers = true;
        }
        if (!hasNumbers) {
            System.out.println("Không có số nào được trích xuất.");
        }
    }
}