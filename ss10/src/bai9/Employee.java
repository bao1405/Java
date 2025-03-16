package bai9;
public class Employee {
    String name;
    String id;
    double salary;

    // Constructor không tham số
    public Employee() {
        this.name = "Unknown";
        this.id = "Unknown";
        this.salary = 0.0;
    }

    // Constructor đầy đủ tham số
    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Phương thức trả về lương cơ bản của nhân viên
    public double getSalary() {
        return salary;
    }

    public void increaseSalary(double amount) {
        this.salary += amount;
    }
    @Override
    public String toString() {
        return "Employee [Name: " + name + ", ID: " + id + ", Salary: " + salary + "]";
    }
}
