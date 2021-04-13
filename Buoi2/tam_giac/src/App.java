import java.util.Scanner;

public class App {
    //Bài toán kiểm tra xem 3 số có phải cạnh của tam giác không
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        System.out.println("nhập vào 3 cạn a, b, c \nCạnh a: ");            // Nhập 3 cạnh a, b và c
        float a = input.nextFloat();
        System.out.println("Cạnh b: ");
        float b = input.nextFloat();
        System.out.println("Cạnh c: ");
        float c = input.nextFloat();
        
        if ((a + b >c) && (b + c >a) && (a + c >b )) {                      //Nếu a+b>c và b+c>a và a+c>b thì in ra màn hình a,b,c tạo nên một tam giác
            System.out.println("a, b, c tạo nên một tam giác!");
        } else {                                                            // Còn không thì in ra a,b,c không tạo nên một tam giác
            System.out.println("a, b, c không tạo nên một tam giác!");
        }
        input.close();
    }
}
