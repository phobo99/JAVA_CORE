import java.util.Scanner;

public class Employee {
    Scanner scanner = new Scanner(System.in);
    private String id, name, email;
    private int age;
    private long phoneNumber, basicSalary;

    public Employee(String id, String name, int age, long phoneNumber, String email, long basicSalary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.basicSalary = basicSalary;
    }

    public Employee() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(long basicSalary) {
        this.basicSalary = basicSalary;
    }

    public void display() {
        System.out.print("\nMa nhan vien: " + getId() + "\tHo ten: " + getName() + "\tTuoi: " + getAge() + "\tSDT: " + getPhoneNumber() + "\tEmail: " + getEmail() + "\tLuong co ban: " + getBasicSalary());
    }

}
