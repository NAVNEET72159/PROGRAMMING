package LeetCodePracticeQuestions;

import java.util.Stack;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        Stack<Integer> stack = new Stack<>();
        removeDuplicates(nums);
    }
    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for(int j=1;j<nums.length;j++) {
            if(nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}
