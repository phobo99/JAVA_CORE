import java.util.Scanner;

public class App {
    //Bài tập tính diện tích hình tròn với r được nhập vào từ bàn phím.
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        double dienTich, chuVi, r;
        System.out.println("Mời bạn nhập vào bán kính: ");
        r = input.nextDouble();
        dienTich = r* r* Math.PI;
        chuVi = 2 * Math.PI * r;
        System.out.println("Chu vi của hình tròn là: "+chuVi + "\nVà diện tích là: "+dienTich);
        input.close();
    }
}
