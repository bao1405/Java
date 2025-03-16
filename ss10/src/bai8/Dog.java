package bai8;

public class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void makeMove() {
        System.out.println("Woof Woof ");
    }

    @Override
    public void display() {
        super.display();
    }
}
