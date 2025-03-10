import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[size];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < size; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = Integer.parseInt(scanner.next());
        }
        System.out.print("Nhập giá trị phần tử cần chèn: ");
        int value = Integer.parseInt(scanner.next());
        System.out.print("nhập vaof chỉ số chần chèn");
        int pos = Integer.parseInt(scanner.next());
        if (pos < 0 || pos > size) {
            System.out.println("Vị trí không hợp lệ!");
        } else {
            int[] newArr = new int[size + 1];
            for (int i = 0; i < newArr.length; i++) {
                if (i < pos) {
                    newArr[i] = arr[i];
                } else if (i == pos) {
                    newArr[i] = value;
                }else {
                    newArr[i] = arr[i-1];
                }
            }

        }

        scanner.close();
    }
}
