import java.util.Scanner;
public class bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui lòng nhập chuỗi");
        String str = scanner.nextLine();
        StringBuilder sb = new StringBuilder(str);
        do {
            int a = 0, b = 0;
            String str2;
            System.out.println("=== MENU QUẢN LÝ CHUỖI ===");
            System.out.println("1. Đảo ngược chuỗi");
            System.out.println("2. Chèn chuỗi vào vị trí bất kì");
            System.out.println("3. Xóa 1 đoạn trong chuỗi");
            System.out.println("4. Thay thế 1 đoạn trong chuỗi");
            System.out.println("5. Chuyển đổi toàn bộ chuỗi thành chữ hoa/chữ thường");
            System.out.println("6. Thoát chương trình");
            System.out.println("Chọn chức năng (1-6)");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    sb.reverse();
                    System.out.println(sb.toString());
                    break;
                case 2:
                    System.out.println("nhập chuỗi con");
                    str2 = scanner.nextLine();
                    System.out.println("Nhập vị trí cần chèn");
                    int x =  Integer.parseInt(scanner.nextLine());
                    sb.insert(x, str2);
                    System.out.println(sb.toString());
                    break;
                case 3:
                    System.out.println("Nhập vị trí bắt đầu");
                    a = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập vị trí kết thúc");
                    b = Integer.parseInt(scanner.nextLine());
                    sb.delete(a, b);
                    System.out.println(sb.toString());
                    break;
                case 4:
                    System.out.println("Nhập vị trí bắt đầu");
                    a = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập vị trí kết thúc");
                    b = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập chuỗi thay thế");
                    str2 = scanner.nextLine();
                    sb.replace(a, b, str2);
                    System.out.println(sb.toString());
                    break;
                case 5:
                    boolean z = true;
                    do {
                        System.out.println("chọn 1 để chuyển thành chữ hoa");
                        System.out.println("chọn 2 để chuyển thành chữ thường");
                        System.out.println("lựa chọn của bạn:");
                        int choice5 = Integer.parseInt(scanner.nextLine());
                        switch (choice5) {
                            case 1:
                                sb = new StringBuilder(sb.toString().toUpperCase());
                                System.out.println(sb.toString());
                                z = false;
                                break;
                            case 2:
                                sb= new StringBuilder(sb.toString().toLowerCase());
                                System.out.println(sb.toString());
                                z = false;
                                break;
                            default:
                                System.err.println("vui lòng nhập lại từ (1-2)");
                        }
                    }while (z);
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.err.println("vui lòng nhập lại từ (1-6)");
            }
        }while(true);
    }
}