package daily111602;

public class Cat extends Animal implements Jumpping{
    public Cat(){

    }

    public Cat(String name,int age){
        super(name,age);
    }
    @Override
    public void jump() {
        System.out.println("猫");
    }

    @Override
    public void eat() {
        System.out.println("moa");
    }

}
