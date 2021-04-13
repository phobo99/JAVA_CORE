import java.util.Collections;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<String>();
        vector.add("S");
        vector.add("E");
        vector.add("A");
        vector.add("P");
        vector.add("Q");

        System.out.println(vector);
        Collections.sort(vector);               //sap xep
        System.out.println(vector);

        int index = Collections.binarySearch(vector, "E");          //tim kiem o vtri thu bao nhiu
        System.out.println(index);

        Collections.swap(vector,0,4);       //doi vi tri cua i voi j
        System.out.println(vector);

    }
}
