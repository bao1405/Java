import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số nguyên");
        int a = sc.nextInt();
        if (a % 2 == 0 && a != 0) {
            System.out.printf("số %d là số chẵn",a);
        } else if (a % 2 != 0) {
            System.out.printf("số %d là số lẻ" ,a);
        }else {
            System.out.printf("số không phải số chẵn cũng không phải lẻ");
        }
    }
}
