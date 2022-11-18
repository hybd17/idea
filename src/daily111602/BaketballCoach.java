package daily111602;

public class BaketballCoach extends Coach{
    public BaketballCoach() {
    }

    public BaketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("篮球教练教");
    }

    @Override
    public void eat() {
        System.out.println("篮球");
    }

}
