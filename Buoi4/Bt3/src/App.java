public class App {
    public static void main(String[] args) throws Exception {
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            System.out.println(i);
        }
    }
}
