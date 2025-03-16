import java.util.Scanner;

public class bai3 {
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
        }else if(average< 6.5){
            rank = "trung bình";
        }else if(average< 8.5){
            rank = "khá";
        }
        else{
            rank = "giỏi";
        }

        System.out.printf("điểm trung bình : %2f - xếp loại: %s",average,rank);
    }
}
