public class ContactGenericExample {
    public static void main(String[] args) {
        Contact contact = new Contact("Pho", 123);
        String name = contact.getKey();
        int phoneNumber = contact.getValue();
        System.out.println("name: " + name + "phone number: " + phoneNumber);
    }
}
