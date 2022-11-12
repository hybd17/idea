package csa1;

import java.util.Scanner;

//颠倒字符串
public class ProgrammingQuestion02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        reverseString(s);
    }
    public static void reverseString(String s) {

        char[] chars = s.toCharArray();
        char temp;
        for(int i = 0;i<chars.length/2;i++)
        {
            temp = chars[i];
            chars[i] = chars[chars.length-i-1];
            chars[chars.length-i-1] = temp;
        }
        String s1 = String.valueOf(chars);
        System.out.println(s1);
    }
}
