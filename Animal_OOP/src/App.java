public class App {
    public static void main(String[] args) {
        Animal anm1 = new Animal("Belgan","Male",3,5.5,"White");
        anm1.eat("Com");
        anm1.run(30);
        anm1.sleep(999);
        Animal anm2= new Animal("Haha","Female",5,2.5,"Yellow");
        anm2.eat("Cut");
        anm2.run(50);
        anm2.sleep(1999);
        Animal anm3 = new Animal("Hehe","Male",6,6.5,"Pink");
        anm3.eat("Awwww");
        anm3.run(930);
        anm3.sleep(9999);
        System.out.printf("%3s %10s %5s %7s %10s \n","name","gender","age","weight","color");
        anm1.display();
        anm2.display();
        anm3.display();
    }
}
