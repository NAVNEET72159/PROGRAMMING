package LeetCodePracticeQuestions;

public class LengthOfLongestSubarrayWithKFrequency {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 2, 3};
        int k = 2;
        System.out.println(maxSubarrayLength(nums, k));
    }
    public static int maxSubarrayLength(int[] nums, int k) {
        int count = 0;
        int ans = 0;
        for(int i = 0; i < nums.length; i++) {
            count = 0;
            for(int j = i; j < nums.length; j++) {
                if(nums[j] == k) {
                    count++;
                }
                if(count == k) {
                    ans = Math.max(ans, j - i + 1);
                }
            }
        }
        return ans;
    }
}
