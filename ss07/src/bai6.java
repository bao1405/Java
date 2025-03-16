public class bai6 {
    public static void main(String[] args) {
        String str = "Hello";
        StringBuilder sb = new StringBuilder(str);
        StringBuffer sb2 = new StringBuffer(str);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            str.concat("world");
        }
        long end = System.currentTimeMillis();
        System.out.println("String: " + (end - start));
        start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            sb.append("world");
        }
        end = System.currentTimeMillis();
        System.out.println("StringBuider: " + (end - start));
        start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            sb2.append("world");
        }
        end = System.currentTimeMillis();
        System.out.println("StringBuffer: " + (end - start));
    }
}
