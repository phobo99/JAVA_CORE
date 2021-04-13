package Example.QueueExample;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;


public class App {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("A");
        queue.add("R");
        queue.add("E");
        queue.add("N");
        queue.add("G");
        System.out.println(queue);
        System.out.println(queue.element());    // neu khong co gi thi thong bao Exception
        System.out.println(queue.peek());       // neu khong co gi thi bao null
        queue.poll();                           // xoa phan tu dau tien va cuoi cung
        System.out.println(queue);

        Deque<String> deque = new ArrayDeque<String>();
        deque.add("Java");
        deque.add("Python");
        deque.add("C++");
        deque.add("Flutter");
        deque.add("Golang");

        System.out.println(deque);
        deque.pollFirst();
        System.out.println(deque);
        deque.pollLast();
        System.out.println(deque);

        deque.offer("Kotlin");          // day vao cuoi
        deque.offer("C#");
        System.out.println(deque);

        deque.push("PHP");              // day len dau
        deque.push("HTML");
        System.out.println(deque);


    }

}
