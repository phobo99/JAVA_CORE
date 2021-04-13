import java.util.Scanner;

public class EmployeeManager {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong luong nhan vien: ");
        int n = scanner.nextInt();
        Employee[] employees = new Employee[n]; //Khoi tao mang

        //Nhap thong tin nhan vien
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap thong tin nhan vien thu %d", i);
            System.out.printf("Chon nhan vien can nhap: \nChon1: Nhap thong tin lap trinh vien \nChon2: Nhap thong tin kiem chung vien");
            int choose = scanner.nextInt();
            if (choose == 1) {
                employees[i] = new Developer();
            } else if (choose == 2) {
                employees[i] = new QA();
            }

            employees[i].display();
        }
        //In thong tin nhan vien ra man hinh
        for (int i = 0; i < n; i++) {
            employees[i].display();
        }
        scanner.close();
    }
}
