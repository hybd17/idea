package daily1121;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class train {
//    public static void main(String[] args) throws CrazyThursdayException{
//        throw new CrazyThursdayException();
//    }
//    public static class CrazyThursdayException extends Exception{
//        public CrazyThursdayException() {
//            super("疯狂星期四v我50");
//        }
//    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        generatePermutation(s);
    }

    public static void generatePermutation (String s) {
        for(int i =0;i<s.length();i++)
        {
            for(int k = i+1;k<=s.length();k++)
            {
                System.out.println(s.substring(i,k));
            }
        }
    }
}
