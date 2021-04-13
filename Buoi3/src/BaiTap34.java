import java.util.Scanner;

public class BaiTap34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Khai báo số hàng và số cột
        System.out.println("Nhập vào số hàng và số cột");
        int n = scanner.nextInt();
        //Khởi tạo và cấp phát bộ nhớ cho mảng
        int A[][] = new int[n][n];
        int B[][] = new int[n][n];
        System.out.println("Nhập mảng A");
        nhapMang(n, A);
        System.out.println("Nhập mảng B");
        nhapMang(n, B);
        System.out.println("Mảng A sau khi nhập là: ");
        xuatMang(n, A);
        System.out.println("Mảng B sau khi nhập là: ");
        xuatMang(n, B);
        //Cộng hai ma trận vuông A và B
        //Khởi tạp mảng C trước là tổng của 2 mảng A và B
        int C[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; i < n; i++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        System.out.println("\nMảng sau khi cộng là: ");
        xuatMang(n, C);
        System.out.println("\nMa trận chuyển vị của A là: ");
        maTranChuyenVi(n, A);
        xuatMang(n, A);
        System.out.println("\nMa trận chuyển vị của B là: ");
        maTranChuyenVi(n, B);
        xuatMang(n, B);
        tongPhanTuChiaHet5(A, n);
    }

    // Phuong thức nhập mảng
    public static void nhapMang(int n, int arr[][]) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Nhap vao phan tu vi tri arr[%d][%d]: ", i, j);
                arr[i][j] = scanner.nextInt();
            }
        }
    }

    //Phương thức xuất mảng
    public static void xuatMang(int n, int arr[][]) {
        for (int i = 0; i < n; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
            }
        }
    }

    // Phương thức tìm ma trận chuyển vị
    public static void maTranChuyenVi(int n, int arr[][]) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; i < n; i++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    //Phương thức tính tổng các phần tử chia hết cho 5
    public static void tongPhanTuChiaHet5(int arr[][], int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] % 5 == 0) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("\nTổng các phần tử chia hết cho 5 là: " + sum);
    }
}
