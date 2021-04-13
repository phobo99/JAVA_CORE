import java.util.Scanner;

public class App {
    // Bài toán tính n số đầu tiên trong dãi Fibonacci
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào n số fibonacci muốn in ra: ");
        int n = input.nextInt();
        long f0 = 0, f1 = 1, fn = 0;                    // để kiểu long vì nếu mà nhập n khoảng 50 đổ đi thì sẽ không hiển thị đủ
        for (int i = 1; i <= n; i++) {
            if (i < 2) {                                // Nếu mà i<2 thì đã được gán ban đầu sẵn rồi nên chỉ in ra thôi
                System.out.println(i);
            } else {
                fn = f0 + f1;
                f0 = f1;                                // nếu không có 2 dòng f0=f1 và f1 =fn thì khi in ra sẽ chỉ có kết quả là 2,2,2,2,2,2,2...
                f1 = fn;                                // Đây là cách chúng ta cập nhật..
                System.out.println(fn);
            }
        }
        input.close();
    }
}
