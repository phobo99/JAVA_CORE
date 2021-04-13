public class ElectronicDocuments extends Book implements IDownload{
    private double capacity, price;
    private int downloads;

    public ElectronicDocuments() {
    }

    public ElectronicDocuments(double capacity, double price, int downloads) {
        this.capacity = capacity;
        this.price = price;
        this.downloads = downloads;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDownloads() {
        return downloads;
    }

    public void setDownloads(int downloads) {
        this.downloads = downloads;
    }

    @Override
    public void input() {
        super.input();
        System.out.print("Nhap dung luong ");
        capacity = Double.valueOf(scanner.nextLine());

        System.out.print("Nhap so luot tai: ");
        downloads = Integer.valueOf(scanner.nextLine());

        System.out.print("Nhap gia thanh: ");
        price = Double.valueOf(scanner.nextLine());
    }

    @Override
    public String toString() {
        return super.toString() + "\t" + capacity + "\t" + downloads + "\t" + price;
    }

    @Override
    public double getTotalPrice() {
        return downloads * price;
    }
}
