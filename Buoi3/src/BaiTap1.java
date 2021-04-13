import java.util.Scanner;

public class BaiTap1 {
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
        System.out.println("---------------------------------------------");
        //hiển thị ra màn hình mảng đã nhập
        System.out.print("Mảng đã nhập vào là : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        //gán giá trị max và min
        int max = arr[0];
        int min = arr[0];
        //vòng lặp tính max và min
        for (int i = 0; i < n; i++) {
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];
        }
        //in kết quả ra màn hình max, min
        System.out.println("\nPhần tử lớn nhất của mảng là : " + max);
        System.out.println("Phần tử nhỏ nhất của mảng là : " + min);

        // tạp biến count để tính xem có bao nhiêu số chẵn
        int count = 0;
        System.out.print("Các số chẵn trong mảng là : ");
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                count++;
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println("và có " + count + " số chẵn trong mảng");

        //Các số nguyên tố trong mảng
        System.out.print("Các phần tử là số nguyên tố: ");
        for (int i = 0; i < n; i++) {
            if (kiemTraSoNguyenTo(arr[i])) {    //kiemTraSoNguyen được khai báo bên dưới
                System.out.print(arr[i] + " \n");
            }
        }

        //vòng lặp sắp xếp theo thứ tự từ bé tới lớn.
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < i; j++) {
                //so sánh xem tại vtri i có lớn hơn j hay không. nếu lớn hơn thì hoán đổi vị trí
                if (arr[i] > arr[j]) {
                    int x = arr[i];
                    arr[i] = arr[j];
                    arr[j] = x;
                }
            }
        }
        System.out.println("Mảng theo thứ tự tăng dần là : ");
        /*for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }*/
        xuatMang(arr);

        //vòng lặp sắp xếp theo thứ tự từ lớn tới bé
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                //so sánh xem tại vtri i có bé hơn j hay không. nếu bé hơn thì hoán đổi vị trí
                if (arr[i] < arr[j]) {
                    int x = arr[i];
                    arr[i] = arr[j];
                    arr[j] = x;
                }
            }
        }
        System.out.println("\nMảng theo thứ tự giảm dần là : \n");
        /*for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }*/
        xuatMang(arr);

        System.out.println("Kết thúc chương trình");
        scan.close();
    }

    public static boolean kiemTraSoNguyenTo(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void xuatMang(int a[]){
        for (int i= 0; i<a.length;i++){
            System.out.println(a[i]+"\t");
        }
    }
}
