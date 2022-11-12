package daily111;

import java.util.Scanner;

public class StringTest07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String line = myReverse(s);
        System.out.println(line);
    }
    public static String myReverse(String s){
//        StringBuilder sb = new StringBuilder(s);
//        sb.reverse();
//        String ss = sb.toString();
//        return ss;
        return new StringBuilder(s).reverse().toString();
    }
}
