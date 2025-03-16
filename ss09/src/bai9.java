class Fraction{
    public int numerator;
    public int denominator;
    public Fraction(int numerator, int denominator){
        if (denominator == 0) {
            System.out.println("Mẫu số ko thể bằng 0");
            System.exit(0);
        }
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }
    // Phương thức cộng phân số hiện tại với phân số khác
    public Fraction add(Fraction other) {
        return new Fraction(this.numerator * other.denominator + other.numerator * this.denominator, this.denominator * other.denominator);
    }
    // Phương thức trừ phân số hiện tại với phân số khác
    public Fraction subtract(Fraction other) {
        return new Fraction( this.numerator * other.denominator - other.numerator * this.denominator, this.denominator * other.denominator);
    }
    // Phương thức nhân phân số hiện tại với phân số khác
    public Fraction multiply(Fraction other) {
        return new Fraction(this.numerator * other.numerator, this.denominator * other.denominator);
    }
    // Phương thức chia phân số hiện tại cho phân số khác
    public Fraction divide(Fraction other) {
        return new Fraction(this.numerator * other.denominator, this.denominator * other.numerator);
    }
    // tìm ước chung lớn nhất
    private int gcd(int a, int b) {
        while(b != 0){
            int temp = a;
            a = b;
            b = temp % b;
        }
        return a;
    }

    private void simplify() {
        int gcd = gcd(this.numerator, this.denominator);
        numerator /= gcd;
        denominator /= gcd;
        System.out.println("phân số được rút gọn là :" + numerator + "/"+denominator);
    }
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
public class bai9 {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(3, 6);
        Fraction f2 = new Fraction(2, 5);
        System.out.println("Phân số 1: " + f1);
        System.out.println("Phân số 2: " + f2);
        System.out.println("cộng phân số 1 với phân số 2 : " + f1.add(f2).toString());
        System.out.println("trừ phân số 1 với phân số 2 : " + f1.subtract(f2).toString());
        System.out.println("nhân phân số 1 với phân số 2: " + f1.multiply(f2).toString());
        System.out.println("chia phân số 1 với phân số 2 : " + f1.divide(f2).toString());
    }
}
