package lanshan01;

import java.util.Scanner;

public class ReserveNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean isprime = false;
        if(n>=0)
        {
            int temp = n;
            int m = 0;
            while(n!=0)
            {
                m = m*10+n%10;
                n /= 10;
            }
            if(m == temp)
            {
                isprime = true;
            }
            System.out.println(isprime);
        }
        else
        {
            System.out.println(isprime);
        }
    }
}
