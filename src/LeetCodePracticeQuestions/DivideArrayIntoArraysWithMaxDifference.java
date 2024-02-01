package LeetCodePracticeQuestions;

import java.util.Arrays;

public class DivideArrayIntoArraysWithMaxDifference {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int maxOperations = 2;
        minimumSize(nums, maxOperations);
    }
    public static int[][] minimumSize(int[] nums, int k) {
        Arrays.sort(nums);
        int[][] result = new int[0][0];
        for (int i = 0; i + 2 < nums.length; ++i) {
            if (i % 3 == 0) {
                if (nums[i + 2] - nums[i] <= k) {
                    int[] triplet = {nums[i], nums[i + 1], nums[i + 2]};
                    result = Arrays.copyOf(result, result.length + 1);
                    result[result.length - 1] = triplet;
                } else {
                    return new int[0][0];
                }
            }
        }
        return result;
    }
}
