import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Waiter> listWaiters = new ArrayList<Waiter>();
        listWaiters.add(new Waiter("1", "Luu", 22, 1230000 , 3000000));
        listWaiters.add(new Waiter("2", "Dang", 23, 3450000 , 4000000));
        listWaiters.add(new Waiter("3", "Pho", 24, 4560000 , 1500000));

        printArray(listWaiters);

        List<Kitchen> kitchens = new ArrayList<Kitchen>();
        kitchens.add(new Kitchen("1", "Luu", 22, 1230000 , 3000000));
        kitchens.add(new Kitchen("2", "Dang", 23, 3450000 , 4000000));
        kitchens.add(new Kitchen("3", "Pho", 24, 4560000 , 1500000));
        printArray(kitchens);
    }
    public static void printArray(List<?> lists){
        for(Object e : lists){
            System.out.println(e);
        }
    }
}
