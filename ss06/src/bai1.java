import java.util.Scanner;
public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào chuỗi: ");
        String Str = scanner.nextLine();
        String[] strArr = Str.split("\\s");
        int count = 0;
        for(int i = 0 ; i < strArr.length ; i++){
            count++;
        }
        System.out.println("Số từ trong màng: " + count);
    }
}