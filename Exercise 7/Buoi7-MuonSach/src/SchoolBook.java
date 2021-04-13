import java.util.Scanner;

public class SchoolBook extends Book implements IBorrow {
    private int numberOfPages;
    private String status;
    private int amountBorrowed;

    public SchoolBook(String id, String name, String publisher, int publishingYear, int amount, Scanner scanner, int numberOfPages, String status, int amountBorrowed) {
        super(id, name, publisher, publishingYear, amount, scanner);
        this.numberOfPages = numberOfPages;
        this.status = status;
        this.amountBorrowed = amountBorrowed;
    }

    public SchoolBook() {
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getAmountBorrowed() {
        return amountBorrowed;
    }

    public void setAmountBorrowed(int amountBorrowed) {
        this.amountBorrowed = amountBorrowed;
    }

    @Override
    public void input() {
        super.input();
        System.out.print("Nhap so trang: ");
        numberOfPages = Integer.valueOf(scanner.nextLine());

        System.out.print("Nhap tinh trang: ");
        status = scanner.nextLine();

        System.out.print("Nhap so luong muon: ");
        amountBorrowed = Integer.valueOf(scanner.nextLine());
    }

    @Override
    public String toString() {
        return super.toString() + "\t" + numberOfPages + "\t" + status + "\t" + amountBorrowed;
    }

    @Override
    public double getInventory() {
        return getAmount() - getAmountBorrowed();
    }
}
