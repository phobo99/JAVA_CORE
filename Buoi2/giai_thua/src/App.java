import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào n!: ");
        int n = input.nextInt();
        int giaiThua = 1;

        for (int i = 1; i <= n; i++) {
            giaiThua *= i;
        }
        System.out.println(n + "! = " + giaiThua); // nếu để trong vòng lặp for thì sau 1 lần chạy nó sẽ in ra 1 lần
        input.close();
    }
}
