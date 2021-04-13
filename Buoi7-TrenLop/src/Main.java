import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so nguoi trong danh ba: ");
        int n = scanner.nextInt();

        PhoneBook[] phoneBook = new PhoneBook[50];
        for (int i = 0; i < n; i++) {
            phoneBook[i] = new PhoneBook();
            phoneBook[i].input();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(phoneBook[i].toString());
        }

        // Sua sdt theo ten: 
        System.out.println("Nhap ten co so dien thoai can sua: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        changePhoneNumber(n, name, phoneBook);
        System.out.println("Mang sau khi can sua la : ");
        phoneBook.toString();
    }


    public static int addPhone(int n, PhoneBook phoneBook[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten lien he muon them: ");
        System.out.println("Nhap id: ");
        String newId = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Nhap ten: ");
        String newName = scanner.nextLine();
        System.out.print("Nhap so dien thoai: ");
        long newPhone = scanner.nextLong();

        phoneBook[n] = new PhoneBook();
        phoneBook[n].setId(newId);
        phoneBook[n].setName(newName);
        phoneBook[n].setPhoneNumber(newPhone);

        return n + 1;
    }

    public static void changePhoneNumber(int n, String name, PhoneBook phoneBook[]) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            if (name.equals(phoneBook[i].getName())) {
                System.out.println("Nhap so dien thoai moi: ");
                long changePhone = scanner.nextLong();
                phoneBook[i].setPhoneNumber(changePhone);
            }
        }
    }
    public static int deleteContact(int n, PhoneBook phoneBook[], String name){
        for(int i = 0; i<n;i++){
            if(name.equals(phoneBook[i].getName())){
                phoneBook[i] = phoneBook[i+1];
            }
        }
        return n-1;
    }
}
