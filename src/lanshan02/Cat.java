package lanshan02;

public class Cat extends Pet{
    private int weight;

    public Cat() {
    }

    public Cat(String name, String sex, int weight) {
        super(name, sex);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void eat() {
        System.out.println("小猫🐱干饭");
    }

    @Override
    public void talk() {
        System.out.println("小猫🐱喵喵");
    }
    public void destroy(){
        System.out.println("打碎你的杯子😏");
    }
}
