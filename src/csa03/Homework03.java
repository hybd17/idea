package csa03;

import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("请输入n的值：");
            int n = in.nextInt();
            if(n<0)
            {
                throw new IllegalArgumentException();
            }
            int temp = 0;
            double sum = 0.0;
            for(int i = 0;i<n;i++)
            {
                try {
                    temp = in.nextInt();
                    if(temp<0){
                        throw new IllegalArgumentException();
                    }
                }catch (IllegalArgumentException e){
                    System.out.println("请输入大于等于0的值");
                    i--;
                }
                sum += temp;
            }
            System.out.println("平均数是"+sum/n);
        }catch (IllegalArgumentException e){
            System.out.println("请输入大于等于0的值");
            e.printStackTrace();
        }
    }
}
