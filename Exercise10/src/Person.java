public class Person {
    private int id, age;
    private String name, address;

    public Person(int id, int age, String name, String address) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.address = address;
    }

    public Person() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "id= " + getId() + "\tage= " + getAge() + "\tname= " + getName() + "\taddress= " + getAddress();
    }
}
