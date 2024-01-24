package LeetCodePracticeQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMismatch {
    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        int[] ans = findErrorNums(nums);
        for (int an : ans) {
            System.out.println(an);
        }
    }
    public static int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        Arrays.sort(nums);
        Set<Integer> list = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            if(list.contains(nums[i])) {
                ans[0] = nums[i];
            } else {
                list.add(nums[i]);
            }
        }
        for(int i = 1; i <= nums.length; i++) {
            if(!list.contains(i))
                ans[1] = i;
        }
        return ans;
    }
}
