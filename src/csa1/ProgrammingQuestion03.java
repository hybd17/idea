package csa1;

import java.util.Scanner;

public class ProgrammingQuestion03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        isPalindrome(num);
    }
    public static void isPalindrome(int num) {
        int num02 = num;
        int num01 = 0;
        int temp = 0;
        while(num!=0)
        {
            temp = num%10;
            num /= 10;
            num01 = num01*10+temp;
        }
        if (num02 == num01) {
            System.out.println("是的");
        } else
            System.out.println("不是");
    }
}
