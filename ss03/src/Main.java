import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập điểm toán: ");
        float math = Float.parseFloat(sc.nextLine());
        System.out.println("nhập điểm lý: ");
        float  physical = Float.parseFloat(sc.nextLine());
        System.out.println("nhập điểm hóa: ");
        float chemiscall = Float.parseFloat(sc.nextLine());

        float average = (math+physical+chemiscall) / 3;
        String rank;
        if(average>10 || average<0){
            rank ="dữ liệu k hợp lệ";
        }else if(average< 5){
            rank = "yếu";
        }else if(average< 7){
            rank = "trung bình";
        }else if(average< 8){
            rank = "khá";
        }
        else if(average< 9){
            rank = "giỏi";
        }else{
            rank = "xuất sắc";
        }

        System.out.printf("điểm trung bình : %2f - xếp loại: %s",average,rank);
    }
}