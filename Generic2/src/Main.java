public class Main {


    public static void main(String[] args) {
        MyArrrayList<Integer> integers = new MyArrrayList<Integer>();
        MyArrrayList<Float> floats = new MyArrrayList<Float>();
        MyArrrayList<Boolean> booleans = new MyArrrayList<Boolean>();
        MyArrrayList<String> strings = new MyArrrayList<String>();
        integers.add(123);
        floats.add(123.53f);
        booleans.add(Boolean.TRUE);
        strings.add("Hello");
        integers.printElement();
        floats.printElement();
        booleans.printElement();
        strings.printElement();
    }
}

