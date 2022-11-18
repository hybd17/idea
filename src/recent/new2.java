package recent;

import java.util.Scanner;

public class new2 {
    public static void select(int[] pay){
        for(int i =0;i<pay.length;i++)
        {
            int min = pay[i];
            for(int k  =i+1;k<pay.length;k++)
            {
             if(pay[k]<min)
             {
                 min = pay[k];
                 pay[k] = pay[i];
                 pay[i] = min;
             }
            }
        }
        for(int i= 0;i<pay.length;i++)
        {
            System.out.print(pay[i]+" ");
        }
    }
    public static void bubble(int[] pay){
        for(int i = 0;i<pay.length;i++)
        {
            for(int k = 0;k<(pay.length)-i-1;k++)
            {
                int max = pay[k];
                if(pay[k]>pay[k+1])
                {
                    pay[k] = pay[k+1];
                    pay[k+1] = max;
                }
            }
        }
        for(int i = 0;i<pay.length;i++)
        {
            System.out.print(pay[i]+" ");
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] pay = {33,19,4,20,100};
        select(pay);
        bubble(pay);
    }
}
