import java.util.*;

public class Main {
    private static ArrayList<Student> list;

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student(1, "Pho", "CB"));
        list.add(new Student(2, "Dang", "HN"));
        list.add(new Student(3, "Luu", "SG"));
        list.add(new Student(4, "Hehe", "DN"));

        printElement(list);

        System.out.println("Danh sach sau khi sap xep: ");
        Collections.sort(list);
        printElement(list);

        System.out.println("Danh sach sau khi xao tron");
        Collections.shuffle(list);
        printElement(list);

        System.out.println("Danh sach theo chieu nguoc");
        Collections.reverse(list);
        printElement(list);

        System.out.println("Danh sach sau khi dao chieu");
        Collections.rotate(list, 2);
        printElement(list);

        System.out.println("Phan tu co gia tri lon nhat" + Collections.max(list));
        System.out.println("Phan tu co gia tri nho nhat" + Collections.min(list));

        System.out.println("TEACHER");
        ArrayList<Teacher> listTeacher = new ArrayList<Teacher>();
        listTeacher.add(new Teacher(1, "Pho", 22, "CB"));
        listTeacher.add(new Teacher(2, "Dang", 22, "HN"));
        listTeacher.add(new Teacher(3, "Luu", 21, "DN"));
        listTeacher.add(new Teacher(4, "Hehe", 25, "HCM"));
        listTeacher.add(new Teacher(5, "Haha", 23, "CB"));

        printElement(listTeacher);
        System.out.println("sap xep teacher theo ten: ");
        Collections.sort(listTeacher, new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        printElement(listTeacher);

        System.out.println("Sap xep teacher theo dia chi: ");
        Collections.sort(listTeacher, new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                return o1.getAddress().compareTo(o2.getAddress());
            }
        });
        printElement(listTeacher);

        System.out.println("Sap xep theo id: ");
        Collections.sort(listTeacher, new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                return o1.getId() > o2.getId() ? 1 : -1;
            }
        });
        printElement(listTeacher);

        System.out.println("-------------------EMPLOYEE--------------------------");
        ArrayList<Employee> listEmployeer = new ArrayList<Employee>();
        listEmployeer.add(new Employee("Luu", "Pho"));
        listEmployeer.add(new Employee("Nguyen", "A"));
        listEmployeer.add(new Employee("Tran", "Dan"));
        listEmployeer.add(new Employee("Kha", "Banh"));
        listEmployeer.add(new Employee("Dau", "Moi"));
        printElement(listEmployeer);

        System.out.println("Sap xep theo ho: ");
        Collections.sort(listEmployeer, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getHo().compareTo(o2.getHo());
            }
        });
        printElement(listEmployeer);

        System.out.println("Sap xep theo ten");
        Collections.sort(listEmployeer, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getTen().compareTo(o2.getTen());
            }
        });
        printElement(listEmployeer);

        System.out.println("Them ten vao dau va cuoi");
        Deque<Employee> deque = new ArrayDeque<Employee>();
        deque.addAll(listEmployeer);
        deque.push(new Employee("Hihi", "hehe"));
        deque.offer(new Employee("Hoho", "Hmmmm"));
        System.out.println(deque);

    }

    public static void printElement(List<?> list) {
        for (Object e : list) {
            System.out.println(e);
        }
    }
}
