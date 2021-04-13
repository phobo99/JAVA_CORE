public class QA extends Employee {

    public int errorNumber;

    public QA(String id, String name, int age, long phoneNumber, String email, long basicSalary) {
        super(id, name, age, phoneNumber, email, basicSalary);
        this.errorNumber = errorNumber;
    }

    public QA() {
    }

    // tinh luong
    public long totalSalary() {
        return this.getBasicSalary() + errorNumber * 50000;
    }

    @Override
    public void display() {
        super.display();
        System.out.print("\tSo loi : " + errorNumber);
        System.out.print("\tTong luong : " + totalSalary() + "\n");
    }
}
