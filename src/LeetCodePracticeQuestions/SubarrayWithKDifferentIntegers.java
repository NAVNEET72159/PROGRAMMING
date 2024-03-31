package LeetCodePracticeQuestions;

public class SubarrayWithKDifferentIntegers {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 2, 3};
        int k = 2;
        System.out.println(subarraysWithKDistinct(nums, k));
    }
    public static int subarraysWithKDistinct(int[] nums, int k) {
        return atMostKDistinct(nums, k) - atMostKDistinct(nums, k - 1);
    }
    public static int atMostKDistinct(int[] nums, int k) {
        int count = 0;
        int ans = 0;
        int[] freq = new int[nums.length + 1];
        int left = 0;
        for(int right = 0; right < nums.length; right++) {
            if(freq[nums[right]] == 0) {
                k--;
            }
            freq[nums[right]]++;
            while(k < 0) {
                freq[nums[left]]--;
                if(freq[nums[left]] == 0) {
                    k++;
                }
                left++;
            }
            ans += right - left + 1;
        }
        return ans;
    }
}
