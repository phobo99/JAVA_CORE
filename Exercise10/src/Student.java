public class Student extends Person{
    private float gpa;

    public Student(int id,  String name,int age, String address, float gpa) {
        super(id, age, name, address);
        this.gpa = gpa;
    }
    public Student(){
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return super.toString() + "\tgpa= "+getGpa();
    }
}
