import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so hoc sinh: ");
        int n = scanner.nextInt();
        Student[] students = new Student[n];    //khoi tao mang

        //Nhap thong tin hoc sinh
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin hoc sinh thu " + (i + 1) + ":");
            students[i] = new Student();
            students[i].input();
        }
        //In thong tin hoc sinh ra man hinh
        for (int i = 0; i < n; i++) {
            System.out.println(students[i].toString());
        }
        scanner.close();
    }
}
