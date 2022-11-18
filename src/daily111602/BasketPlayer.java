package daily111602;

public class BasketPlayer extends Player{
    public BasketPlayer() {
    }

    public BasketPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println(" ");
    }

    @Override
    public void eat() {
        System.out.println();
    }

}
