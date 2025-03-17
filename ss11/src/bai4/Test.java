package bai4;

public class Test {
    public static void main(String[] args) {
        Electronic [] listElt = {new TV(),new Radio()};
        for(Electronic electronic : listElt) {
            electronic.turnOff();
            electronic.turnOn();
        }

    }
}
