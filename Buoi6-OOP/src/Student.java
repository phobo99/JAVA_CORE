public class Student extends Person {
    public int id;
    public float cpa;
    public String email;

    public Student(String name, String address, String gender, String dateOfBirth, int id, float cpa, String email) {
        super(name, address, gender, dateOfBirth);
        this.id = id;
        this.cpa = cpa;
        this.email = email;
    }

    public Student() {
    }

    @Override
    public void input() {
        super.input();
        System.out.println("Nhap id: ");
        id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap diem trung binh: ");
        cpa = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhap email: ");
        email = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "\tId: " + id + super.toString() + "\tDiem trung binh: " + cpa + "\tEmail: " + email;
    }
}
