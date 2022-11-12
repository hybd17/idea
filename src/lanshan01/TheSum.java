package lanshan01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TheSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[5];
        for(int i = 0;i<nums.length;i++)
        {
            nums[i] = in.nextInt();
        }
        int target = in.nextInt();
        for(int i = 0;i<nums.length;i++)
        {
            for(int k = 0;k<nums.length;k++)
            {
                if(nums[i]+nums[k]==target)
                {
                    System.out.println(nums[i]+" "+nums[k]);
                }
            }
        }
    }
}

