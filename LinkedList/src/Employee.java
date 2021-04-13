public class Employee {
    private String ho, ten;

    public Employee(String ho, String ten) {
        this.ho = ho;
        this.ten = ten;
    }

    public Employee() {
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ho='" + ho + '\'' +
                ", ten='" + ten + '\'' +
                '}';
    }
}
