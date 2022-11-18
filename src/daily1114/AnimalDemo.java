package daily1114;


public class AnimalDemo {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.setName("加菲");
        a.setAge(30);
        a.eat();
        a = new Cat("加菲",20);
    }
}
