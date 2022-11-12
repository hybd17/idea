package csa1;

import java.util.Arrays;
import java.util.Scanner;
//数组排序
public class ProgrammingQuestion05 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] numbers = new int[10];
        for(int i = 0;i<numbers.length;i++)
            numbers[i] = in.nextInt();
        Arrays.sort(numbers);
        int max = numbers[9];
        int min = numbers[0];
        int sum = max+min;
        System.out.println("打印两个最值之和:"+sum);
    }
}
