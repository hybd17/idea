package lanshan02;

public class PetDemo {
    public static void main(String[] args) {
        Dog d = new Dog("小黑","公","白色");
        System.out.println("我是一名"+d.getColor()+"修勾，我叫"+d.getName());
        d.talk();
        d.eat();
        d.introduce();
        Cat c = new Cat("瘦瘦","母",8);
        System.out.println("我是一名"+c.getWeight()+"kg的小猫，我叫"+c.getName());
        c.talk();
        c.eat();
        c.destroy();
    }
}
