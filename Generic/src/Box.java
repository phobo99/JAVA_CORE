public class Box<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void add(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        Box<Integer> intBox = new Box<Integer>();
        intBox.add(5);
        System.out.println(intBox.getT());
        Box<String> stringBox = new Box<String>();
        stringBox.add("Hahahaa");
        System.out.println(stringBox.getT());
    }
}
