import java.util.Scanner;

public class GraduationThesis extends Book implements ILibrary {
    private int numberOfPages, yearOfProtection;
    private String status;

    public GraduationThesis(String id, String name, String publisher, int publishingYear, int amount, Scanner scanner, int numberOfPages, int yearOfProtection, String status) {
        super(id, name, publisher, publishingYear, amount, scanner);
        this.numberOfPages = numberOfPages;
        this.yearOfProtection = yearOfProtection;
        this.status = status;
    }

    public GraduationThesis() {
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getYearOfProtection() {
        return yearOfProtection;
    }

    public void setYearOfProtection(int yearOfProtection) {
        this.yearOfProtection = yearOfProtection;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void input() {
        super.input();
        System.out.print("Nhap so trang ");
        numberOfPages = Integer.valueOf(scanner.nextLine());

        System.out.print("Nhap tinh trang ");
        status = scanner.nextLine();

        System.out.print("Nhap nam bao ve ");
        yearOfProtection = Integer.valueOf(scanner.nextLine());
    }

    @Override
    public String toString() {
        return super.toString() + "\t" + numberOfPages + "\t" + status + "\t" + yearOfProtection;
    }

    @Override
    public String getLocation(String location) {
        return location;
    }
}
