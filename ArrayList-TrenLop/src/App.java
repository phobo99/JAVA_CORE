import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so giao vien: ");
        int n = scanner.nextInt();
        ArrayList<Teacher> teachers = new ArrayList<Teacher>();
        for (int i = 0; i < n; i++) {
            Teacher teacher = new Teacher();
            teacher.input();
            teachers.add(teacher);
        }
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
        String newName = scanner.nextLine();
        for (int i = 0; i < teachers.size(); i++) {
            if(teachers.get(i).getName().equals(newName)){
                teachers.remove(i);
            }
        }

    }
}
