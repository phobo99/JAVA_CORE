import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int k = 0;
        int n = 5;
        int size = 20;
        int arr[] = new int[size];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap phan tu thu arr[%d]: ", i);
            arr[i] = sc.nextInt();
        }
        System.out.println("Mang vua nhap la: ");
        xuatMang(n, arr);

        // Them phan tu vao mang
        System.out.println("\nNhap phan tu muon them: ");
        int x = sc.nextInt();
        n = insert(arr, n, size, x);
        System.out.println("Mang sau khi them la: ");
        xuatMang(n, arr);

        // Sua phan tu trong mang
        System.out.println("\nNhap vi tri can sua: ");
        k = sc.nextInt();
        if (k < 0 || k >= n) {
            System.out.println("Vi tri khong hop le");
            System.exit(0);
        } else {
            System.out.println("Nhap phan tu: ");
            x = sc.nextInt();
            arr[k] = x;
        }
        System.out.println("Mang sau khi sua la: ");
        xuatMang(n, arr);

        // Chen phan tu trong mang
        System.out.println("\nNhap vi tri can chen: ");
        k = sc.nextInt();
        System.out.println("Nhap phan tu muon chen: ");
        x = sc.nextInt();

        n = insertToPops(arr, n, size, x, k);
        System.out.println("Mang sau khi chen la : ");
        xuatMang(n, arr);

        // Xoa phan tu trong mang
        System.out.println("\nNhạp vi tri can xoa: ");
        k = sc.nextInt();
        n = delete(arr, n, size, k);
        System.out.println("Mang sau khi xoa la: ");
        xuatMang(n, arr);

    }

    public static void xuatMang(int n, int arr[]) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    public static int insert(int arr[], int n, int size, int x) {
        if (n >= size) {
            return n;
        }
        arr[n] = x;
        return n + 1;
    }

    public static int insertToPops(int arr[], int n, int size, int x, int k) {
        if (n >= size) {
            return n;
        }
        if (k < 0 || k >= n) {
            return n;
        } else {
            for (int i = n; i > k; i--) {
                arr[i] = arr[i - 1];
            }
            arr[k] = x;
        }
        return n + 1;
    }

    public static int delete(int arr[], int n, int size, int k) {
        if (k < 0 || k >= n) {
            return n;
        } else {
            for (int i = k; i < n; i++) {
                arr[i] = arr[i + 1];
            }
        }
        return n - 1;
    }
}
