package csa1;

/*import java.util.Arrays;
import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ChoiceQuestion();
        //1
        int n = in.nextInt();
        showTriangle(n);
        //2
        String s = in.nextLine();
        reverseString(s);
        //3
        int num = in.nextInt();
        isPalindrome(num);
        //4
        ShuiXianHua();
        //5
        int[] numbers = new int[10];
        for(int i = 0;i<numbers.length;i++)
        {
            numbers[i] = in.nextInt();
        }
        arraysDemo(numbers);
    }

    public static void ChoiceQuestion() {
        System.out.println("1.A 2.B 3.D 4.D 5.D");
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
    public static void reverseString(String s) {

        char[] chars = s.toCharArray();
        char temp;
        for(int i = 0;i<chars.length/2;i++)
        {
            temp = chars[i];
            chars[i] = chars[chars.length-i-1];
            chars[chars.length-i-1] = temp;
        }
        String s1 = String.valueOf(chars);
        System.out.println(s1);
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
    public static void arraysDemo(int[] numbers){
        Arrays.sort(numbers);
        int max = numbers[9];
        int min = numbers[0];
        int sum = max+min;
        System.out.println("打印两个最值之和:"+sum);
    }
}*/
