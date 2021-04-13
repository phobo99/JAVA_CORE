import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String id, name, email;
        long phoneNumber, basicSalary;
        int age, overTime, errorNumber;

        // tao doi tuong Developer
        Developer developer = new Developer();
        System.out.println("Nhap thong tin lap trinh vien");

        //nhap thong tin
        System.out.print("Nhap ma nhan vien: ");
        id = scanner.nextLine();
        System.out.print("Nhap ho ten: ");
        name = scanner.nextLine();
        System.out.print("Nhap tuoi: ");
        age = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap so dien thoai: ");
        phoneNumber = Long.valueOf(scanner.nextLine());
        System.out.print("Nhap email: ");
        email = scanner.nextLine();
        System.out.print("Nhap luong co ban: ");
        basicSalary = scanner.nextLong();
        System.out.print("Nhap so gio tang ca: ");
        overTime = scanner.nextInt();

        // cung cap thong tin thuoc tinh
        developer.setId(id);
        developer.setName(name);
        developer.setAge(age);
        developer.setPhoneNumber(phoneNumber);
        developer.setEmail(email);
        developer.setBasicSalary(basicSalary);
        developer.overTime = overTime;

        // in thong tin ra man hinh
        developer.display();

        System.out.println("Nhap thong tin kiem chung vien");

        //tao doi tuong QA
        QA qa = new QA();
        //Nhap thong tin kiem chung vien
        System.out.print("Nhap ma nhan vien: ");
        id = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Nhap ho ten: ");
        name = scanner.nextLine();
        System.out.print("Nhap tuoi: ");
        age = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap sdt: ");
        phoneNumber = Long.valueOf(scanner.nextLine());
        System.out.print("Nhap email: ");
        email = scanner.nextLine();
        System.out.print("Nhap luong co ban: ");
        basicSalary = scanner.nextLong();
        System.out.print("Nhap so loi tim duoc: ");
        errorNumber = scanner.nextInt();

        //Cung cap thong tin cho thuoc tinh
        qa.setId(id);
        qa.setName(name);
        qa.setAge(age);
        qa.setPhoneNumber(phoneNumber);
        qa.setEmail(email);
        qa.setBasicSalary(basicSalary);
        qa.errorNumber = errorNumber;

        qa.display();//Hien thi thong tin ra man hinh

        scanner.close();
    }


}

