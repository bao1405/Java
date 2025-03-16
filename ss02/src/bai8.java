import java.util.Scanner;
public class bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------Nhập thông tin sinh viên--------");
        System.out.println("Nhập mã sinh viên:");
        String codeStudent = sc.nextLine();
        System.out.println("Nhập tên sinh viên:");
        String name = sc.nextLine();
        System.out.println("Nhập số điện thoại sinh viên:");
        String phone = sc.nextLine();
        System.out.println("Nhập ngày sinh sinh viên (dd/mm/yyyy):");
        String birthday = sc.nextLine();
        System.out.println("Nhập giới tính sinh viên (1:nam, 0:nữ):");
        int gender = sc.nextInt();

        System.out.println("--------nhập điểm sinh viên--------:");
        System.out.println("Nhập diểm toán: ");
        double math = sc.nextDouble();
        System.out.println("Nhập điểm lý: ");
        double physics = sc.nextDouble();
        System.out.println("Nhập điểm hóa: ");
        double chemistry = sc.nextDouble();
        System.out.println("Nhập điểm sinh học: ");
        double science = sc.nextDouble();
        System.out.println("Nhập điểm ngoại ngữ: ");
        double english = sc.nextDouble();
        double average = (math + physics + chemistry + science + english) / 5.0;

        System.out.println("---------Hiện thị thông tin sinh viên----------");
        System.out.println("Mã sinh viên : "+codeStudent+" |  Tên sinh viên : "+name+" |  Giới tính : "+ (gender == 1 ? "Nam" : "Nữ"));
        System.out.println("Ngày sinh : "+birthday+"    | Số diện thoại : "+phone);
        System.out.println("Điểm toán: "+math+"  | Điểm lý : "+physics+"  | Điểm hóa : "+chemistry+"  | Điểm sinh : "+science+"  | Điểm ngoại ngữ: "+english);
        System.out.println("Điểm trung bình : "+String.format("%.2f", average));
    }
}
