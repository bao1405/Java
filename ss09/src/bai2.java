class Employee {
    private int id;
    private String name;
    private String department;
    private int salary;

    public Employee() {
    }

    public Employee(int id, String name, String department, int salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("ID: " + id+"\nName: " + name+"\nDepartment: " + department+"\nSalary: " + salary);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void increaseSalary(double percentage) {
        if (percentage > 0) {
            this.salary += this.salary * (percentage / 100);
        } else {
            System.out.println("Phần trăm tăng lương phải lớn hơn 0!");
        }
    }
}

public class bai2 {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Nguyen Van A", "AB10", 100);
        emp1.displayInfo();

        emp1.increaseSalary(100);
        System.out.println("\nThông tin nhân viên sau khi tăng lương:");
        emp1.displayInfo();
    }
}