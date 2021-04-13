package Example.SetInterface;

import java.util.HashSet;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(9);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(2);
        hashSet.add(7);

        System.out.println("Danh sach HashSet: ");
        System.out.println(hashSet);        //khong cho phep cac phan tu trung nhau
        hashSet.remove(4);
        System.out.println(hashSet);
        System.out.println(hashSet.size());
        hashSet.clear();
        System.out.println(hashSet.size());

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(4);
        treeSet.add(7);
        treeSet.add(9);
        treeSet.add(3);
        treeSet.add(4);
        System.out.println("Danh sach TreeSet");
        System.out.println(treeSet);        // sap xep va loai bo ptu trung lap

    }
}
