public class bai2 {
    public static void main(String[] args) {
        String str = "Hello, Java World!";
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb);
        sb.delete(5, 9);
        System.out.println(sb);
        sb.replace(8,12, "Universe");
        System.out.println(sb);
    }
}