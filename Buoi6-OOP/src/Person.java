import java.util.Scanner;

public class Person {
    private String name, address, gender, dateOfBirth;

    Scanner scanner = new Scanner(System.in);

    public Person(String name, String address, String gender, String dateOfBirth) {
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    public Person() {
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    // Phuong thuc nhap thong tin
    public void input() {
        System.out.println("Nhap ten: ");
        name = scanner.nextLine();
        System.out.println("Dia chi: ");
        address = scanner.nextLine();
        System.out.println("Gioi tinh: ");
        gender = scanner.nextLine();
        System.out.println("Ngay sinh: ");
        dateOfBirth = scanner.nextLine();
    }

    //Phuong thuc xuat thuong tin ra man hinh
    public String toString() {
        return "\tTen: " + getName() + "\tDia chi: " + getAddress() + "\tGioi tinh: " + getGender() + "\tNgay sinh: " + getDateOfBirth();
    }
}
