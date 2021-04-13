import java.util.StringTokenizer;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap mot chuo bat ky");
        String str = scanner.nextLine();
        StringTokenizer stringTokenizer = new StringTokenizer(str," "); //nếu xét dấu cách thì có thể không cần dùng " "
        System.out.println("So phan trong chuoi: "+stringTokenizer.countTokens());
    }
}
