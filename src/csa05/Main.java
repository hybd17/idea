package csa05;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        int[] num1 = {2,4};
        int[] num2 = {1,2,3,4};
        selectBiggerOne(num1,num2);
        System.out.println("------------------------------");
        int[] pushed = {1,2,3,4,5};
        int[] popped = {4,5,3,2,1};
        System.out.println(Judge(pushed,popped));
        System.out.println("------------------------------");
        int[] nums = {1,2,3,2};
        OutOnly(nums);
    }
    public static void selectBiggerOne(int[] num1,int[] num2){
        int[] numbers = new int[num1.length];
        for (int i = 0;i< num1.length;i++)
            {
                for(int k = 0;k<num2.length;k++)
                {
                    boolean isPrime = true;
                    if(num1[i]==num2[k])
                    {
                        for(int m = k+1;m< num2.length;m++)
                        {
                            if(num2[m]>num1[i])
                            {
                                isPrime = false;
                                numbers[i] = num2[m];
                                break;
                            }
                        }
                        if(isPrime)
                            numbers[i] = -1;
                        else
                            break;
                    }
                }
            }
        for(int i = 0;i< numbers.length;i++)
        {
            System.out.println(numbers[i]);
        }
    }
    public static boolean Judge(int[] pushed,int[] popped){
        if(pushed.length!= popped.length)
            return false;
        Deque<Integer> deque1 = new ArrayDeque<>();
        Deque<Integer> deque2 = new ArrayDeque<>();
        for (int i = 0;i< popped.length;i++)
        {
            deque2.push(popped[popped.length-i-1]);
        }
        for(int i = 0;i< pushed.length;i++)
        {
            deque1.push(pushed[i]);
            while (!deque1.isEmpty()&&deque1.peek().equals(deque2.peek()))
            {
                deque1.pop();
                deque2.pop();
            }
        }
        if(!deque1.isEmpty()){
            return false;
        }
        return true;
    }
    public static void OutOnly(int[] nums){
        int sum = 0;
        for(int i = 0;i< nums.length-1;i++)
        {
            int cnt = 1;
            for(int k = i+1;k< nums.length;k++)
            {
                if(nums[k] == nums[i])
                {
                    cnt++;
                }
            }
            if(cnt==1)
                sum += nums[i];
        }
        System.out.println(sum);
    }
}
