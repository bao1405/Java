import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào một số hợp lệ (100-999): ");
        int number = scanner.nextInt();

        // Kiểm tra số nhập vào có hợp lệ không
        if (number < 100 || number > 999) {
            System.out.println("Số nhập vào không hợp lệ");
        } else {
            // Tách số thành hàng trăm, hàng chục, và hàng đơn vị
            int hundreds = number / 100;
            int tens = (number % 100) / 10;
            int units = number % 10;

            // In ra kết quả tương ứng
            System.out.print("Số bạn nhập là: ");

            // In phần hàng trăm
            switch (hundreds) {
                case 1:
                    System.out.print("Một trăm ");
                    break;
                case 2:
                    System.out.print("Hai trăm ");
                    break;
                case 3:
                    System.out.print("Ba trăm ");
                    break;
                case 4:
                    System.out.print("Bốn trăm ");
                    break;
                case 5:
                    System.out.print("Năm trăm ");
                    break;
                case 6:
                    System.out.print("Sáu trăm ");
                    break;
                case 7:
                    System.out.print("Bảy trăm ");
                    break;
                case 8:
                    System.out.print("Tám trăm ");
                    break;
                case 9:
                    System.out.print("Chín trăm ");
                    break;
            }

            // In phần hàng chục
            if (tens == 0) {
                // Nếu hàng chục = 0 thì không in gì
            } else if (tens == 1) {
                System.out.print("mười ");
            } else {
                switch (tens) {
                    case 2:
                        System.out.print("hai mươi ");
                        break;
                    case 3:
                        System.out.print("ba mươi ");
                        break;
                    case 4:
                        System.out.print("bốn mươi ");
                        break;
                    case 5:
                        System.out.print("năm mươi ");
                        break;
                    case 6:
                        System.out.print("sáu mươi ");
                        break;
                    case 7:
                        System.out.print("bảy mươi ");
                        break;
                    case 8:
                        System.out.print("tám mươi ");
                        break;
                    case 9:
                        System.out.print("chín mươi ");
                        break;
                }
            }

            // In phần hàng đơn vị
            if (tens != 0 && units == 0) {
                // Nếu hàng chục có chữ "mười", thì không in hàng đơn vị
            } else {
                switch (units) {
                    case 1:
                        System.out.print("một");
                        break;
                    case 2:
                        System.out.print("hai");
                        break;
                    case 3:
                        System.out.print("ba");
                        break;
                    case 4:
                        System.out.print("bốn");
                        break;
                    case 5:
                        System.out.print("năm");
                        break;
                    case 6:
                        System.out.print("sáu");
                        break;
                    case 7:
                        System.out.print("bảy");
                        break;
                    case 8:
                        System.out.print("tám");
                        break;
                    case 9:
                        System.out.print("chín");
                        break;
                }
            }

            System.out.println();  // In dòng mới sau khi in xong kết quả
        }

        // Đóng Scanner
        scanner.close();
    }
}