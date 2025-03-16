package bai7;

public class testStudent {
    public static void main(String[] args) {
        Student[] students = new Student[4];

        students[0] = new Student("Alice", "S001", 3.5);
        students[1] = new Student("Bob", "S002", 3.7);
        students[2] = new GraduateStudent("Charlie", "S003", 3.8, "AI Research", "Dr. Smith");
        students[3] = new GraduateStudent("David", "S004", 3.9, "Quantum Computing", "Prof. Johnson");

        for (Student student : students) {
            student.getDetails();
            System.out.println();
        }
    }
}
