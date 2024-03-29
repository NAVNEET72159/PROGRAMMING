package LeetCodePracticeQuestions;

public class CountSubarraysWithMaxElements {
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 3, 3};
        System.out.println(countSubarrays(nums));
    }
    public static int countSubarrays(int[] nums) {
        int count = 0;
        int ans = 0;
        for(int i = 0; i < nums.length; i++) {
            count = 1;
            for(int j = i - 1; j >= 0 && nums[j] < nums[i]; j--) {
                count++;
            }
            for(int j = i + 1; j < nums.length && nums[j] <= nums[i]; j++) {
                count++;
            }
            ans += count;
        }
        return ans;
    }
}
