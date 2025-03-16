package bai8;

public class Cat extends Animal {
    private String furColor;

    public Cat(String name, int age, String furColor) {
        super(name, age);  // Gọi constructor của lớp cha (Animals)
        this.furColor = furColor;
    }

    @Override
    public void makeMove() {
        System.out.println("meow meow");
    }

    @Override
    public void display() {
        super.display();
    }
}
