package bai2;

public class Caculator {
    int add(int a,int b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Caculator c = new Caculator();
        System.out.println(c.add(1,2,3));
        System.out.println(c.add(1,2));
    }
}