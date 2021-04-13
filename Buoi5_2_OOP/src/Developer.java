public class Developer extends Employee {
    public int overTime;

    public Developer(String id, String name, int age, long phoneNumber, String email, long basicSalary, int overTime) {
        super(id, name, age, phoneNumber, email, basicSalary);
        this.overTime = overTime;
    }

    public Developer() {
    }

    //Phuong thuc tinh luong
    public long totalSalary() {
        return this.getBasicSalary() + overTime * 200000;
    }

    //Phuong thuc nhap thong tin

    @Override
    public void input() {
        super.input();
        System.out.print("Nhap so gio tang ca: ");
        overTime = scanner.nextInt();
    }

    //Phuong thuc xuat thong tin


    @Override
    public void display() {
        super.display();
        System.out.print("\tThoi gian tang ca: " + overTime);
        System.out.print("\tTong luong: " + totalSalary() + "\n");
    }

    //nguoi ta hay dung toString() nhieu hon la dung display()
    @Override
    public String toString() {
        // TODO Auto-generated method stub

        return super.toString() + "\t Thoi gian tang ca: " + overTime + "\tTong luong: " + totalSalary();

    }
}
