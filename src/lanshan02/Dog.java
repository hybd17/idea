package lanshan02;

public class Dog extends Pet{
    private String color;

    public Dog() {
    }

    public Dog(String name, String sex, String color) {
        super(name, sex);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void talk() {
        System.out.println("修勾🐕汪汪");
    }

    @Override
    public void eat() {
        System.out.println("修勾🐕干饭");
    }
    public void introduce(){
        System.out.println("我是菜狗！！！");
    }
}
