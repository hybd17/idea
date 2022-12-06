package csa04;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    //回溯算法，参考答案后独自完成;
    List<Integer> number = new ArrayList<Integer>();//子数组，重复创建
    List<List<Integer>> answer = new ArrayList<List<Integer>>();//输出
    public List<List<Integer>> select(int[] nums) {
        reback(0,nums);
        return answer;
    }
    public void reback(int m, int[] nums) {
        if (m == nums.length) {
            answer.add(new ArrayList<Integer>(number));
            return;
        }
        number.add(nums[m]);
        reback(m + 1, nums);
        number.remove(number.size() - 1);
        reback(m + 1, nums);
    }
}
