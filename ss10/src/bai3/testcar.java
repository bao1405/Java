package bai3;

public class testcar {
    public static void main(String[] args) {
        car car = new car();
        car.setMake("Toyota");
        car.setModel("BMW");
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        car.setYear(5000);

    }
}
