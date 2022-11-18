package daily1114;

public class Demo {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.setName("张三");
        t1.setAge(30);
        t1.teach();
        Teacher t2 = new Teacher("李四",40);
        t2.teach();
    }
}
