package daily111;

import java.util.ArrayList;

public class ArraylistTest01 {
    public static void main(String[] args) {
//        ArrayList<String> array = new ArrayList<>();
        ArrayList<String> array = new ArrayList<String>();
//        System.out.println(array.add("hello"));
        array.add("hello");
        array.add("world");
        array.add("java");
        //array.add(1,"javase");
        array.add(4,"javaee");
        System.out.println(array);
    }
}
