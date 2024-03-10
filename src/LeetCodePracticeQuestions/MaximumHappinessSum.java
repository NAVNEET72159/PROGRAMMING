package LeetCodePracticeQuestions;

import java.util.Arrays;

public class MaximumHappinessSum {
    public static void main(String[] args) {
        int[] nums = {12, 1, 42};
        int k = 3;
        System.out.println(maxHappiness(nums, k));
    }
    public static long maxHappiness(int[] nums, int k) {
        int n = nums.length;
        long sum = 0;
        Arrays.sort(nums);
        int l = 1;
        for (int i = n-1; i >= 0 && k > 0; i--) {
            sum += nums[i];
            if (i != 0) {
                if (nums[i-1]-l >= 0) {
                    nums[i-1] -= l;
                }
                else {
                    nums[i-1] = 0;
                }
            }
            l++;
            n -= 1;
            k--;
        }
        return sum;
    }
}
