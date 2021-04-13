public class PhoneBook extends Phone {
    private String id;

    public PhoneBook(String name, long phoneNumber, String id) {
        super(name, phoneNumber);
        this.id = id;
    }
    public PhoneBook(){

    }
    

    @Override
    public void input() {
        super.input();
        System.out.println("ID: ");
        id = scanner.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() + "ID: "+id;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
}
