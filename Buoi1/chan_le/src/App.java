import java.util.Scanner;

public class App {
    //Bài tập: Nhập vào 1 số bất kỳ và kiểu tra xem số là số chẵn hay số lẻ (Sử dụng toán tử điều kiện)
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int a;
        System.out.println("Xin vui lòng nhập vào");
        a = input.nextInt();
        String s = (a % 2 == 0) ? a + " là số chẵn" : a + " là số lẻ";
        System.out.println(s);
        input.close();
    }
}
