import java.util.Scanner;
public class bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập vào số phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int [n];
        System.out.println("Nhập vào các phần tử của mảng: ");
        for(int i = 0; i < n; i++){
            System.out.printf("arr[%d] : ",i);
            arr[i] = scanner.nextInt();
        }
        if(arr.length == 0){
            System.out.println("Mảng không hợp lệ");
        }else {
            int[] markingArray = new int[100];
            int index = 0;
            for (int i = 0; i < arr.length; i++) {
                int count = 0;
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }
                if (count == 1) {
                    markingArray[index] = arr[i];
                    index++;
                }
            }
            if(markingArray.length == 0){
                System.out.println("Không có phần tử duy nào duy nhất trong mảng");
            }else {
                for (int i = 0; i < index; i++) {
                    System.out.printf("%5d", markingArray[i]);
                }
            }
        }
    }
}
