import java.util.Scanner;
enum Gender {
    MALE, FEMALE,OTHER;
}
class Student {
    private int id;
    private String name;
    private Gender gender;
    private int age;
    private String address;
    private String phoneNumber;

    public Student() {

    }

    public Student(int id, String name, int age, Gender gender, String address, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public void inputData(Scanner scanner) {
        System.out.print("Nhập ID: ");
        this.id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập tên: ");
        this.name = scanner.nextLine();
        System.out.print("Nhập địa chỉ: ");
        this.address = scanner.nextLine();
        System.out.print("Nhập số điện thoại: ");
        this.phoneNumber = scanner.nextLine();
        this.gender = inputGender(scanner);
        System.out.print("Nhập tuổi: ");
        this.age = scanner.nextInt();
        scanner.nextLine();
    }

    public void displayData() {
        System.out.println("ID: " + this.id);
        System.out.println("Tên: " + this.name);
        System.out.println("Địa chỉ: " + this.address);
        System.out.println("Số điện thoại: " + this.phoneNumber);
        System.out.println("Giới tính: " + this.gender);
        System.out.println("Tuổi: " + this.age);
    }

    public void updateStudent(Scanner scanner) {
        System.out.println("Cập nhật thông tin sinh viên (Bỏ trống nếu không muốn thay đổi)");
        System.out.print("Nhập tên mới: ");
        String newName = scanner.nextLine();
        if (!newName.isEmpty()) this.name = newName;
        System.out.print("Nhập địa chỉ mới: ");
        String newAddress = scanner.nextLine();
        if (!newAddress.isEmpty()) this.address = newAddress;
        System.out.print("Nhập số điện thoại mới: ");
        String newPhone = scanner.nextLine();
        if (!newPhone.isEmpty()) this.phoneNumber = newPhone;
        System.out.println("Nhập giới tính mới (Nam/Nữ/Khác): ");
        this.gender = inputGender(scanner);
        System.out.print("Nhập tuổi mới: ");
        String newAge = scanner.nextLine();
        if (!newAge.isEmpty()) this.age = Integer.parseInt(newAge);
        System.out.println("Cập nhật thành công!");
    }

    public static void deleteStudent(Student[] students, int index, int count) {
        for (int i = index; i < count - 1; i++) {
            students[i] = students[i + 1];
        }
        students[count - 1] = null;
        System.out.println("Xóa sinh viên thành công!");
    }

    private static Gender inputGender(Scanner scanner) {
        while (true) {
            System.out.print("Nhập giới tính (Nam/Nữ/Khác): ");
            String genderInput = scanner.nextLine().trim().toLowerCase();
            if (genderInput.equals("nam")) return Gender.MALE;
            if (genderInput.equals("nữ") || genderInput.equals("nu")) return Gender.FEMALE;
            if (genderInput.equals("khác")) return Gender.OTHER;
            System.out.println("Lỗi: Chỉ nhập 'Nam', 'Nữ' hoặc 'Khác'. Vui lòng nhập lại!");
        }
    }
    public int getId() {
        return id;
    }
}
public class bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int max_student = 100;
        Student[] students = new Student[max_student];
        int studentCount = 0;
        int choice;

        do {
            System.out.println("\n--- QUẢN LÝ SINH VIÊN ---");
            System.out.println("1. Hiển thị danh sách tất cả sinh viên");
            System.out.println("2. Thêm mới sinh viên");
            System.out.println("3. Sửa thông tin sinh viên");
            System.out.println("4. Xóa sinh viên");
            System.out.println("5. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    if (studentCount == 0) {
                        System.out.println("Danh sách sinh viên trống.");
                    } else {
                        for (int i = 0; i < studentCount; i++) {
                            students[i].displayData();
                        }
                    }
                    break;
                case 2:
                    if (studentCount < max_student) {
                        students[studentCount] = new Student();
                        students[studentCount].inputData(scanner);
                        studentCount++;
                        System.out.println("Thêm mới 1 sinh viên thành công!");
                    } else {
                        System.out.println("Danh sách đã đầy, không thể thêm!");
                    }
                    break;
                case 3:
                    System.out.print("Nhập ID sinh viên cần sửa: ");
                    int editId = scanner.nextInt();
                    scanner.nextLine();
                    boolean found = false;
                    for (int i = 0; i < studentCount; i++) {
                        if (students[i].getId() == editId) {
                            students[i].updateStudent(scanner);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Không tìm thấy sinh viên có ID: " + editId);
                    }
                    break;
                case 4:
                    System.out.print("Nhập ID sinh viên cần xóa: ");
                    int deleteId = scanner.nextInt();
                    scanner.nextLine();
                    boolean deleted = false;
                    for (int i = 0; i < studentCount; i++) {
                        if (students[i].getId() == deleteId) {
                            Student.deleteStudent(students, i, studentCount);
                            studentCount--;
                            deleted = true;
                            break;
                        }
                    }
                    if (!deleted) {
                        System.out.println("Không tìm thấy sinh viên có ID: " + deleteId);
                    }
                    break;
                case 5:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng chọn từ 1-5.");
            }
        } while (choice != 5);
    }
}
