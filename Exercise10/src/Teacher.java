public class Teacher extends Person{
    private long salary;

    public Teacher(int id, String name, int age, String address, long salary) {
        super(id, age, name, address);
        this.salary = salary;
    }
    public Teacher(){
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "\tsalary= "+getSalary();
    }
}
