package bai9;

public class Developer extends Employee {
    private String programmingLanguage;

    public Developer() {
    }

    public Developer(String name, String id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public String toString() {
        return "Developer [Name: " + name + ", ID: " + id + ", Salary: " + salary + ", Programming Language: " + programmingLanguage + "]";
    }
}
