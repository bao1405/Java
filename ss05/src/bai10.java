import java.util.Scanner;
public class bai10 {
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
        if(n <= 0){
            System.out.println("Mảng không hợp lệ");
        }else {
            int max_sum = Integer.MIN_VALUE;
            int begin = 0;
            int end = 0;
            for(int i = 0; i < n; i++){
                int current_sum = 0;
                for(int j = i; j < n; j++){
                    current_sum += arr[j];
                    if(current_sum > max_sum){
                        max_sum = current_sum;
                        begin = i;
                        end = j;
                    }
                }
            }
            System.out.printf("Tổng lớn nhất của dãy con liên tiếp là: %d\n",max_sum);
            System.out.println("Dãy con: ");
            for(int i = begin; i < end; i++){
                System.out.printf("%5d ",arr[i]);
            }
        }
    }
}
