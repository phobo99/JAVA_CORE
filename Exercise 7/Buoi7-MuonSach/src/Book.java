import java.util.Scanner;

public class Book {
    private String id,name,publisher;
    private int publishingYear;
    private int amount;
    Scanner scanner = new Scanner(System.in);

    public Book(String id, String name, String publisher, int publishingYear, int amount, Scanner scanner) {
        this.id = id;
        this.name = name;
        this.publisher = publisher;
        this.publishingYear = publishingYear;
        this.amount = amount;
        this.scanner = scanner;
    }
    public Book(){
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

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPublisherYear() {
        return publishingYear;
    }

    public void setPublisherYear(int publisherYear) {
        this.publishingYear = publisherYear;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public void input(){
        System.out.print("Nhap ma sach: ");
        id = scanner.nextLine();

        System.out.print("Nhap ten sach: ");
        name = scanner.nextLine();

        System.out.print("Nhap nha xuat ban: ");
        publisher = scanner.nextLine();

        System.out.print("Nhap nam xuat ban: ");
        publishingYear = Integer.valueOf(scanner.nextLine());

        System.out.print("Nhap so luong ");
        amount = Integer.valueOf(scanner.nextLine());
    }
    @Override
    public String toString() {
        return id + "\t"+ name + "\t" + publisher + "\t" + publishingYear + "\t" + amount;
    }
}
