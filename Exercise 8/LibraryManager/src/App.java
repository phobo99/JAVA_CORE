import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong sach: ");

        int n = scanner.nextInt();

        ArrayList<Book> books = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Chon loai sach muon nhap: \n1: Sach giao khoa\n2: Do an\n3: Tai lieu dien tu: ");
            switch (scanner.nextInt()) {
                case 1:
                    SchoolBook schoolbook = new SchoolBook();
                    schoolbook.input();
                    books.add(schoolbook);
                    break;
                case 2:
                    GraduationThesis GBook = new GraduationThesis();
                    GBook.input();
                    books.add(GBook);
                    break;
                case 3:
                    ElectronicDocuments EBook = new ElectronicDocuments();
                    EBook.input();
                    books.add(EBook);
                    break;
                default:
                    System.out.println("Dữ liệu nhập vào không chính xác: ");
                    System.exit(0);
            }

        }

        System.out.println("\nDanh Sách tài liệu vừa nhập là: ");
        for (int i = 0; i < n; i++) {
            System.out.println(books.get(i).toString());
        }
        scanner.close();

        File schoolbookList = new File("C:\\Users\\ADMIN\\Desktop\\Baitap_JAVA\\File\\Fileschoolbook.txt");
        File GraduationBookList = new File("C:\\Users\\ADMIN\\Desktop\\Baitap_JAVA\\File\\FilegraduationThesis.txt");
        File EBook = new File("C:\\Users\\ADMIN\\Desktop\\Baitap_JAVA\\File\\FileEBook.txt");

        schoolbookList.createNewFile();
        GraduationBookList.createNewFile();
        EBook.createNewFile();

        FileWriter myPen1 = new FileWriter(schoolbookList);
        FileWriter myPen2 = new FileWriter(GraduationBookList);
        FileWriter myPen3 = new FileWriter(EBook);
        try {
            for (int i = 0; i < books.size(); i++) {
                if (books.get(i) instanceof SchoolBook) {
                    myPen1.write(books.get(i).toString() + "\n");
                } else if (books.get(i) instanceof GraduationThesis) {
                    myPen2.write(books.get(i).toString() + "\n");
                } else {
                    myPen3.write(books.get(i).toString() + "\n");
                }
                System.out.println("Write information successfully to Files");
            }

        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("Error:" + e);
        } finally {
            myPen1.close();
            myPen2.close();
            myPen3.close();
        }

        Scanner myReader1 = new Scanner(schoolbookList);
        Scanner myReader2 = new Scanner(GraduationBookList);
        Scanner myReader3 = new Scanner(EBook);

        System.out.println("Sach Giao khoa");
        while (myReader1.hasNext()) {
            System.out.println(myReader1.nextLine());
        }
        myReader1.close();

        System.out.println("Luan van tot nghiep");
        while (myReader2.hasNext()) {
            System.out.println(myReader2.nextLine());
        }
        myReader2.close();

        System.out.println("Sach dien tu");
        while (myReader3.hasNext()) {
            System.out.println(myReader3.nextLine());
        }
        myReader3.close();
    }
}

