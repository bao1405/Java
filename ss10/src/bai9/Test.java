package bai9;
public class Test {
    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", "E001", 5000);
        Manager mgr = new Manager("Alice Smith", "M001", 7000, 2000);
        Developer dev = new Developer("Bob Brown", "D001", 6000, "Java");

        System.out.println(emp.toString());
        System.out.println("Salary: " + emp.getSalary());
        System.out.println();

        System.out.println(mgr.toString());
        System.out.println("Salary: " + mgr.getSalary());
        System.out.println();

        System.out.println(dev.toString());
        System.out.println("Salary: " + dev.getSalary());
        System.out.println();

        emp.increaseSalary(500);
        System.out.println("After increase, " + emp.toString());
        System.out.println("Salary: " + emp.getSalary());
    }
}
