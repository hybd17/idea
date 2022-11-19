package lanshan02;

public abstract class Pet {
    private String name;
    private String sex;

    public Pet() {
    }

    public Pet(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public abstract void talk();
    public abstract void eat();
}
