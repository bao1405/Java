import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Kiểm tra số nguyên tố");
            System.out.println("2. Kiểm tra số hoàn hảo");
            System.out.println("3. Tìm và tính tổng các ước của một số");
            System.out.println("4. Thoát chương trình");
            System.out.print("Chọn chức năng (1-4): ");
            if (choice >= 1 && choice <= 3) {
                System.out.print("Nhập một số nguyên dương: ");
                int num = scanner.nextInt();
                if (num <= 0) {
                    System.out.println("Số nhập không hợp lệ!");
                    continue;
                }
                switch (choice) {
                    case 1:
                        boolean isPrime = true;
                        if (num < 2) {
                            isPrime = false;
                        } else {
                            for (int i = 2; i * i <= num; i++) {
                                if (num % i == 0) {
                                    isPrime = false;
                                    break;
                                }
                            }
                        }
                        if (isPrime) {
                            System.out.println(num + " là số nguyên tố.");
                        } else {
                            System.out.println(num + " không phải là số nguyên tố.");
                        }
                        break;
                    case 2:
                        int sumPerfect = 0;
                        for (int i = 1; i <= num / 2; i++) {
                            if (num % i == 0) {
                                sumPerfect += i;
                            }
                        }
                        if (sumPerfect == num) {
                            System.out.println(num + " là số hoàn hảo.");
                        } else {
                            System.out.println(num + " không phải là số hoàn hảo.");
                        }
                        break;
                    case 3:
                        int sumDivisors = 0;
                        System.out.print("Các ước của " + num + " là: ");
                        for (int i = 1; i <= num; i++) {
                            if (num % i == 0) {
                                System.out.print(i + " ");
                                sumDivisors += i;
                            }
                        }
                        System.out.println("\nTổng các ước của " + num + " là: " + sumDivisors);
                        break;
                }
            } else if (choice == 4) {
                System.out.println("Thoát chương trình. Tạm biệt!");
            } else {
                System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại!");
            }
        } while (choice != 4);
    }
}
