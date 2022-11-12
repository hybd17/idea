package daily;
//this 成员变量 当局部变量和成员变量同名时使用
public class Student {
    private String name;
    private int age;
    public Student(){}
    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
//    public Student(){
//        System.out.println("无参构造方法");
//    }
//    public void study(){
//        System.out.println("好好学习，天天向上");
//    }
    public void show(){
        System.out.println(name+","+age);
    }
}
