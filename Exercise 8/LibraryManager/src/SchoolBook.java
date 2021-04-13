public class SchoolBook extends Book implements IBorrow {
    private int numberOfPages, amountBorrowed;
    private String status;

    public SchoolBook(String id, String name, String publisher, int publishingYear, int amount, int numberOfPages, int amountBorrowed, String status) {
        super(id, name, publisher, publishingYear, amount);
        this.numberOfPages = numberOfPages;
        this.amountBorrowed = amountBorrowed;
        this.status = status;
    }

    public SchoolBook() {
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getAmountBorrowed() {
        return amountBorrowed;
    }

    public void setAmountBorrowed(int amountBorrowed) {
        this.amountBorrowed = amountBorrowed;
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
        System.out.println("Nhap so trang: ");
        numberOfPages = Integer.valueOf(scanner.nextLine());

        System.out.println("Nhap tinh trang: ");
        status = scanner.nextLine();

        System.out.println("Nhap so luong muon: ");
        amountBorrowed = Integer.valueOf(scanner.nextLine());
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "\nSo trang: " + numberOfPages + "\nTinh trang: " + status + "\nSo luong muon: " + amountBorrowed;
    }

    @Override
    public int getInventory() {
        return getAmount() - getAmountBorrowed();
    }
}
