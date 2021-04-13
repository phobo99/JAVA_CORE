import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Cat");
        list.add("Dog");
        list.add("Butterfly");
        list.add("Puppy");
        System.out.println(list);
        System.out.println(list.size());

        System.out.println("Phan tu dau tien: " + list.getFirst());
        System.out.println("Phan tu cuoi cung: " + list.getLast());

        list.addFirst("Java");
        list.addLast("Python");
        System.out.println(list);
        System.out.println(list.size());

        System.out.println("Phan tu Dog o vi tri: " + list.indexOf("Dog"));
    }
}
