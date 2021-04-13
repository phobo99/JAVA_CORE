public class Developer extends Employee {

    public int overTime;

    public Developer(String id, String name, int age, long phoneNumber, String email, long salary) {
        super(id, name, age, phoneNumber, email, salary);
        this.overTime = overTime;

    }

    public Developer() {
    }

    // Tinh luong
    public long totalSalary() {
        return this.getBasicSalary() + overTime * 200000;
    }

    @Override
    public void display() {
        super.display();
        System.out.print("\tThoi gian tang ca: " + overTime);
        System.out.print("\tTong luong: " + totalSalary() + "\n");
    }


}
