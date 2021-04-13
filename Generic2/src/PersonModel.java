import java.util.ArrayList;

public class PersonModel<T> {
    private ArrayList<T> al = new ArrayList<T>();

    public void add(T obj){
        al.add(obj);
    }
    public void display(){
        for (T object : al){
            System.out.println(object);
        }
    }

    public static void main(String[] args) {
        PersonModel<Student> studentPersonModel = new PersonModel<Student>();
        PersonModel<Employee> employeePersonModel = new PersonModel<Employee>();
        studentPersonModel.add(new Student(1, "Pho" ,22));
        studentPersonModel.add(new Student(2,"Dang",24));
        studentPersonModel.display();
        employeePersonModel.add(new Employee(3,"Luu",200000f));
        employeePersonModel.add(new Employee(4, "hehe",123123123f));
        employeePersonModel.display();
    }
}
