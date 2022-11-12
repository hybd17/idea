package daily;

public class StudentDemo {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.setAge(18);
        s1.setName("张三");
        s1.show();
        Student s2 = new Student("张三",18);
        s2.show();
    }
}

