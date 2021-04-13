public class Waiter extends Employee {
    private long compensate;

    public Waiter(String id, String name, int age, long basicSalary, long compensate) {
        super(id, name, age, basicSalary);
        this.compensate = compensate;
    }

    public Waiter() {
    }

    public long getCompensate() {
        return compensate;
    }

    public void setCompensate(long compensate) {
        this.compensate = compensate;
    }

    public long calculatorSalary() {
        return compensate + getBasicSalary();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
