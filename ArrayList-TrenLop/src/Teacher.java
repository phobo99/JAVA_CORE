import java.util.Scanner;

public class Teacher {
    private String name, address, subject;
    private int age;
    Scanner scanner = new Scanner(System.in);

    public Teacher(String name, String address, String subject, int age) {
        this.name = name;
        this.address = address;
        this.subject = subject;
        this.age = age;
    }

    public Teacher() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void input() {
        System.out.println("Nhap ten giao vien: ");
        name = scanner.nextLine();
        System.out.println("Nhap tuoi: ");
        age = Integer.parseInt(scanner.nextLine());
        System.out.println("Dia chi: ");
        address = scanner.nextLine();
        System.out.println("Mon giang day: ");
        subject = scanner.nextLine();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return name + "\t" + age + "\t" + address + "\t" + subject;
    }
}
