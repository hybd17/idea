package recent;

import java.util.Scanner;

public class new1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int b = 1;
        for(int a = 1;a<=9 && b<=a;a++)
        {
            while(b<a)
            {
                System.out.print(a+"*"+b+"="+a*b+" ");
                b++;
            }
            if(a == b)
            {
                System.out.println(a+"*"+b+"="+a*b);
                b = 1;
            }
        }
    }
}
