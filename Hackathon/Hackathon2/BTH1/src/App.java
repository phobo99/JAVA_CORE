import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String n = "";

        while(!n.equalsIgnoreCase("q")){
            try{
                System.out.println("Nhập vào: ");
                n = scanner.nextLine();
                int x = Integer.parseInt(n);
                list.add(x);
            }catch (NumberFormatException e){
                System.out.println("Không phải là số");
            }finally {
                Collections.sort(list);
                System.out.println(list);
            }
        }
    }
}
