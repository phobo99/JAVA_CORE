public class GenericArrayExample {
    public static void main(String[] args) {
        String[] names = new String[]{"Luu", "Dang", "Pho"};
        GenericArray<String> genericArray = new GenericArray<String>(names);
        String lastElement = genericArray.getLastElement();
        System.out.println(lastElement);
    }
}
