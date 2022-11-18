package recent;

import java.math.BigDecimal;
import java.util.Scanner;

public class Level2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        BigDecimal fac1 = new BigDecimal(String.valueOf(1));
        BigDecimal fac2 = new BigDecimal(String.valueOf(1));
        BigDecimal fac3 = new BigDecimal(String.valueOf(1));
        for(int i = 1;i<=n;i++)
        {
            BigDecimal i1 = new BigDecimal(String.valueOf(i));
            fac1 = fac1.multiply(i1);
        }
        for(int i = 1;i<=m;i++)
        {
            BigDecimal i1 = new BigDecimal(String.valueOf(i));
            fac2 = fac2.multiply(i1);
        }
        for(int i = 1;i<=n-m;i++)
        {
            BigDecimal i1 = new BigDecimal(String.valueOf(i));
            fac3 = fac3.multiply(i1);
        }
        BigDecimal fac = new BigDecimal(String.valueOf(fac2));
        fac = fac.multiply(fac3);
        fac = fac.divide(fac1);
        System.out.println(fac);
    }

}
