package daily113;

import java.util.ArrayList;

public class Arraylist03 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("张三");
        array.add("李四");
        array.add("王五");
//        System.out.println(array.get(0));
        for(int i = 0;i<array.size();i++)
        {
            String s = array.get(i);
            System.out.println(s);
        }
    }
}
