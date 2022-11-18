package daily111602;

public class PingpongCoach extends Coach implements SpeakEnglish{
    public PingpongCoach() {
    }

    public PingpongCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("pingpong");
    }

    @Override
    public void eat() {
        System.out.println("chi");
    }

    @Override
    public void speak() {
        System.out.println("huishuo");
    }
}
