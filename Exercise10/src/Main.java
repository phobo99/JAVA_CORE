import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student(01, "Pho", 22, "CB", 9.5f));
        students.add(new Student(02, "TranDan", 23, "CB", 4.5f));
        students.add(new Student(03, "TranDucBo", 24, "CB", 8.5f));
        students.add(new Student(04, "KhaBanh", 25, "CB", 5.5f));
        students.add(new Student(05, "HuanHoaHong", 26, "CB", 6.5f));
        printArray(students);

        List<Teacher> teachers = new ArrayList<Teacher>();
        teachers.add(new Teacher(01, "Pho", 25, "CB", 500000));
        teachers.add(new Teacher(02, "TranDan", 21, "CB", 1500000));
        teachers.add(new Teacher(03, "TranDucBo", 29, "CB", 2500000));
        teachers.add(new Teacher(04, "KhaBanh", 30, "CB", 3500000));
        teachers.add(new Teacher(05, "HuanHoaHong", 60, "CB", 7500000));
        printArray(teachers);

        System.out.println("-----SAP XEP HOC SINH THEO TEN-----");
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        printArray(students);

        System.out.println("-----SAP XEP HOC SINH THEO GPA-----");
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getGpa() > o2.getGpa() ? 1 : -1;
            }
        });
        printArray(students);

        System.out.println("-----HOC SINH CO DIEM CAO NHAT-----");
        System.out.println(students.get(students.size()-1));

        System.out.println("-----SAP XEP GIAO VIEN THEO TEN-----");
        Collections.sort(teachers, new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        printArray(teachers);

        System.out.println("-----SAP XEP GIAO VIEN THEO LUONG-----");
        Collections.sort(teachers, new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                return o1.getSalary() > o2.getSalary() ? 1 : -1;
            }
        });
        printArray(teachers);
        System.out.println("-----GIAO VIEN CO LUONG CAO NHAT-----");
        System.out.println(teachers.get(teachers.size()-1));
    }

    public static void printArray(List<?> list) {
        for (Object e : list) {
            System.out.println(e);
        }
    }
}
