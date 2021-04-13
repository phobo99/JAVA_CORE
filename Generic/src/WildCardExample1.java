import java.util.ArrayList;
import java.util.List;

public class WildCardExample1 {
    public static void main(String[] args) {
        List<String> name = new ArrayList<String>();
        name.add("Ngoc");
        name.add("huy");
        name.add("Linh");
        System.out.println("In ten: ");
        printElement(name);

        List<Integer> number = new ArrayList<Integer>();
        number.add(5);
        number.add(7);
        number.add(0);
        System.out.println("In so: ");
        printElement(number);

    }
    public static void printElement(List<?> list){
        for(Object e : list){
            System.out.println(e);
        }
    }
}
