package LeetCodePracticeQuestions;

public class SumSubArrayMins {
    public static void main(String[] args) {
        int[] nums = {3,1,2,4};
        System.out.println(sumSubarrayMins(nums));
    }
    public static int sumSubarrayMins(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int[] stack = new int[nums.length];
        int top = -1;
        for(int i=0;i<nums.length;i++) {
            while(top != -1 && nums[stack[top]] >= nums[i]) {
                top--;
            }
            if(top == -1) {
                left[i] = -1;
            }
            else {
                left[i] = stack[top];
            }
            stack[++top] = i;
        }
        top = -1;
        for(int i=nums.length-1;i>=0;i--) {
            while(top != -1 && nums[stack[top]] > nums[i]) {
                top--;
            }
            if(top == -1) {
                right[i] = nums.length;
            }
            else {
                right[i] = stack[top];
            }
            stack[++top] = i;
        }
        int ans = 0;
        for(int i=0;i<nums.length;i++) {
            ans = (ans + nums[i] * (i-left[i]) * (right[i]-i)) % 1000000007;
        }
        return ans;
    }
}
