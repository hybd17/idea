package daily1113;

import daily1111.Cat;
//多态 成员变量 编译看左边，执行看左边
//     成员方法 编译看左边 执行看右边
public class AnimalDemo {
    public static void main(String[] args) {
//        Animal a = new Cat();
//        System.out.println(a.age);
//        System.out.println(a.weight);
//        a.eat();
        AnimalOperator ao = new AnimalOperator();
        Cat c = new Cat();
        ao.useAnimal(c);
    }
}
