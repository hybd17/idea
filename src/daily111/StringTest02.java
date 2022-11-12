package daily111;

import java.util.Scanner;

public class StringTest02 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
//        System.out.println(line.charAt(0));
        for(int i = 0;i<line.length();i++)
        {
            System.out.println(line.charAt(i));
        }
    }
}
