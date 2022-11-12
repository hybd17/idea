package csa1;

import java.util.Scanner;

//打印三角
public class ProgrammingQuestion01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        showTriangle(n);
    }
    public static void showTriangle(int n){
        for(int i = 0;i<n;i++)
        {
            for(int m = i+1;m<n;m++)
            {
                System.out.print(" ");
            }
            for(int a = 0;a<(i+1)*2-1;a++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
