public class Animal {
    public String name, gender, color;
    public int age;
    public double weight;
    public Animal(){

    }
    public Animal (String name, String gender, int age, double weight, String color){
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }
    public void eat(String food){
        System.out.println(food);
    }
    public void run(int speed){
        System.out.println(speed + " km/h");
    }
    public void sleep(int hours){
        System.out.println(hours +" h");
    }
    public void display(){
        System.out.printf("%1s\t %5s %5d %7.2f %10s \n",name,gender,age,weight,color);
    }
}
