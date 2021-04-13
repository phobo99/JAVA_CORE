import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n, soDu,tong=0;
        System.out.println("Nhap n: ");
        n = scanner.nextInt();

        while (n>0){
            soDu = n%10;
            System.out.println("So du: "+soDu);
            n = n/10;
            tong+=soDu;
        }
        System.out.println("Tong cua cac so nguyen vua nhap : "+tong);
    }
}
