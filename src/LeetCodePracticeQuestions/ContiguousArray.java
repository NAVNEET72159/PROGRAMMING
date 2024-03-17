package LeetCodePracticeQuestions;

import java.util.Arrays;

public class ContiguousArray {
    public static void main(String[] args) {
        int[] nums = {0,1,0};
        System.out.println(findMaxLength(nums));
    }
    public static int findMaxLength(int[] nums) {
        int n = nums.length;
        int[] count = new int[2*n+1];
        Arrays.fill(count, -2);
        count[n] = -1;
        int max = 0;
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += nums[i] == 0 ? -1 : 1;
            System.out.println(sum);
            if(count[sum+n] >= -1) {
                max = Math.max(max, i-count[sum+n]);
            }
            else {
                count[sum+n] = i;
            }
        }
        return max;
    }
}
