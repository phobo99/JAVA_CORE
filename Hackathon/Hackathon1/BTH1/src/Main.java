import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        //Vì còn phải xem xem n có phải số không nên t khai báo n là String trước.
        String n = "";

        File myfile = new File("C:\\Users\\ADMIN\\Desktop\\JAVA\\nguyenTo.txt");
        myfile.createNewFile();

        FileWriter myPen = new FileWriter(myfile);
        String result = "";
        //Bằng vòng lặp while chúng ta có thể kiểm tra số nguyên tố và out cuối cùng trong 1 vòng lặp
        while (!"X".equals(n) && !"Q".equals(n) && !"x".equals(n) && !"q".equals(n)) {
            //khi kiểm tra không phải kí tự X và Q rồi thì ta mới check tiếp số nguyên tố hoặc kí tự
            try {
                System.out.print("Nhập vào số nguyên bất kì : ");
                n = scan.nextLine();

                int x = Integer.parseInt(n);

                if (checkPrime(x)) {
                    result = x + " là số nguyên tố";
                } else {
                    result = x + " không phải số nguyên tố";
                }

            } catch (NumberFormatException e) {
                //vì vòng lặp while lặp ít nhất một lần nên dù có nhập X, Q thì vẫn sẽ hiện là không phải số ít nhất 1 lần
                result = n + " không phải là số";
            } finally {
                System.out.println(result);
                myPen.write(result + "\n");
            }
        }
        myPen.close();


    }

    public static boolean checkPrime(int n) {
        if (n <= 1) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}