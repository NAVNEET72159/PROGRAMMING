package LeetCodePracticeQuestions;

import java.util.Arrays;

public class PolygonWithLargestParameter {
    public static void main(String[] args) {
        int[] arr = {1, 12, 1, 2, 5, 50, 3};
        System.out.println(largestPerimeter(arr));
    }
    public static int largestPerimeter(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
        for(int num : nums) {
            sum += num;
        }
        for(int i = nums.length - 1; i >= 2; i--) {
            sum -= nums[i];
            if(sum > nums[i])
                return sum + nums[i];
        }
        return -1;
    }
}
