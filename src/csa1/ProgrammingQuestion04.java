package csa1;

import java.util.Scanner;

public class ProgrammingQuestion04 {
    public static void main(String[] args) {
        ShuiXianHua();
    }
    public static void ShuiXianHua() {
        for(Integer i = 100;i<999;i++)
        {
            String s = i.toString();
            int[] number =  new int[s.length()];
            for(int k = 0;k<s.length();k++)
            {
                Character ch = s.charAt(k);
                number[k] = Integer.parseInt(ch.toString());
            }
            double temp = Math.pow(number[0],3)+Math.pow(number[1],3)+Math.pow(number[2],3);
            if((int)temp==i)
            {
                System.out.print(i+" ");
            }
        }
    }
}
