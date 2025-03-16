import java.util.Scanner;
public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi: ");
        String str = scanner.nextLine();
        System.out.print("Nhập từ cần tìm: ");
        String word = scanner.nextLine();
        int position = str.indexOf(word);
        if (position != -1) {
            System.out.println("Từ '" + word + "' xuất hiện ở vị trí " + position + " trong chuỗi");
        } else {
            System.out.println("Không tìm thấy từ '" + word + "' trong chuỗi" );
        }
    }
}