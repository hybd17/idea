package csa03;

public class Homework04 {
    public static void main(String[] args) {

    }
}
class Employee extends MyDate{
    private String name;
    private int number;
    private MyDate birthday;

    public Employee(int birthday, String name, int number, MyDate birthday1) {
        super(birthday);
        this.name = name;
        this.number = number;
        this.birthday = birthday1;
    }

    @Override
    public void earnings() {
        System.out.println("余额为"+number+"元");
    }
    public String toString(){
        return this.name+" "+this.number+" "+this.birthday;
    }
}
abstract class MyDate{
    private int birthday;

    public MyDate(int birthday) {
        this.birthday = birthday;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }
    public abstract void earnings();
}
