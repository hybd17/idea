package daily111;

import java.util.Scanner;

public class StringTest04 {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        String line = in.nextLine();
        String s = reverse(line);
        System.out.println(s);
    }
    public static String reverse(String s){
        String ss = "";
        for(int i = s.length()-1;i>=0;i--)
        {
            ss += s.charAt(i);
        }
        return ss;
    }
}
