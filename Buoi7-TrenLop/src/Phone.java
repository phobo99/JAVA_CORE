import java.util.Scanner;

public abstract class Phone {
    private String name;
    private long phoneNumber;
    Scanner scanner = new Scanner(System.in);

    public Phone(String name, long phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    public Phone(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void input(){
        System.out.println("Nhap vao ten dien thoai: ");
        name = scanner.nextLine();
        System.out.println("Nhap vao so dien thoai: ");
        phoneNumber = Long.valueOf(scanner.nextLine());
    }
    public String toString(){
        return "Ten dien thooai: "+getName() +"SDT: "+getPhoneNumber();
    }
    
}
