import java.util.Scanner;

public class BaiTap2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap vao so phan tu mang: ");
        int n = scan.nextInt();
        //nếu n<=0 thì cho phép nhập lại từ đầu và hiện ra tbao
        while (n <= 0) {
            System.out.println("n phải lớn hơn 0! Nhập lại :");
            n = scan.nextInt();
        }
        //khai báo mảng 1 chiều và nhập phần tử cho nó
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập vào phần tử thứ " + (i + 1) + " : ");
            arr[i] = scan.nextInt();
        }
        //hiển thị ra màn hình mảng đã nhập
        System.out.print("Mảng đã nhập vào là : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < i; j++) {
                //so sánh xem tại vtri i có bé hơn j hay không. nếu bé hơn thì hoán đổi vị trí
                if (arr[i] < arr[j]) {
                    int x = arr[i];
                    arr[i] = arr[j];
                    arr[j] = x;
                }
            }
        }
        int max = arr[0];
        int max2 = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] > max2 && arr[i] < max) {
                max2 = arr[i];
            }
        }
        System.out.println("\nGiá trị lớn nhất là : " + max + " và giá trị lớn thứ 2 là: " + max2);
        scan.close();
    }
}
