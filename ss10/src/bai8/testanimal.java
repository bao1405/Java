package bai8;

public class testanimal {
    public static void main(String[] args) {
        // Tạo danh sách các động vật (bao gồm Dog và Cat)
        Animal[] animals = new Animal[4];

        // Thêm các đối tượng vào danh sách
        animals[0] = new Dog("Buddy", 3, "Golden Retriever");
        animals[1] = new Dog("Max", 2, "Bulldog");
        animals[2] = new Cat("Whiskers", 1, "Gray");
        animals[3] = new Cat("Mittens", 4, "White");

        for (Animal animal : animals) {
            animal.display();
            animal.makeMove();
            System.out.println();
        }
    }
}
