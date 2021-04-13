import java.util.Scanner;

public class Book {
    private String id, name, publisher;
    private int publishingYear, amount;

    Scanner scanner = new Scanner(System.in);

    public Book(String id, String name, String publisher, int publishingYear, int amount) {
        this.id = id;
        this.name = name;
        this.publisher = publisher;
        this.publishingYear = publishingYear;
        this.amount = amount;
    }

    public Book() {

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

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void input() {
        System.out.println("Nhap ma sach: ");
        id = scanner.nextLine();
        System.out.println("Ten sach: ");
        name = scanner.nextLine();
        System.out.println("Nha xuat ban: ");
        publisher = scanner.nextLine();
        System.out.println("Nam xuat ban: ");
        publishingYear = Integer.parseInt(scanner.nextLine());
    }

    public String toString() {
        return "\nMa sach: " + id + "\nTen sach: " + name + "\nNha xuat ban: " + publisher + "\nNam xuat ban: " + publishingYear;
    }
}
