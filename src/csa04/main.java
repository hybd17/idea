package csa04;


import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int x = in.nextInt();
//        reserve(x);
//        int n = in.nextInt();
//        stairsNumber(n);
        Solution s = new Solution();
        int[] n = {1,2,3};
        System.out.println(s.select(n));
    }
    public static void reserve(int x){
        int x01 = Math.abs(x);
        int y = 0;
        while(x01 != 0){
            int temp = x01%10;
            x01 /= 10;
            y = y*10+temp;
        }
        if(x>=0){
            System.out.println(y);
        }
        else
            System.out.println(-y);
    }
    public static void stairsNumber(int n){
        //斐波那契
        int k = 0;
        int p = 0;
        int r = 1;
        for(int i = 1;i<=n;i++)
        {
            k = p;
            p = r;
            r = k+p;
        }
        System.out.println(r);
    }
}
