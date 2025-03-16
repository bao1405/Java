import java.util.Scanner;
public class bai7 {
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
            System.out.println("Mảng không có phần tử");
        }else {
            for(int i = 0; i < arr.length; i++){
                for(int j = i+1; j < arr.length; j++){
                    if(arr[i] % 2 != 0 && arr[j] % 2 == 0){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
        System.out.println("Mảng sau khi sắp xếp: ");
        for(int i = 0; i < arr.length; i++){
            System.out.printf("%5d",arr[i]);
        }
    }
}