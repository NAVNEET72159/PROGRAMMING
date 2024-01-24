package LeetCodePracticeQuestions;

import java.util.*;

public class Convert2DArray {
    public static void main(String[] args) {
        int[] matrix = {1,3,4,1,2,3,1};
        List<List<Integer>> result = findMatrix(matrix);
        System.out.println(result.size());
    }
    public static List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int count = 1, max = 1;
        int a = 0;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i-1]) {
                count++;
            } else {
                count = 1;
            }
            max = Math.max(max, count);
        }

        for (int i = 0; i < max; i++) {
            result.add(new ArrayList<>());
        }

        result.get(0).add(nums[0]);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums[i-1]) {
                a = a + 1;
            } else {
                a = 0;
            }
            if (i > 0) {
                result.get(a).add(nums[i]);
            }
        }
        return result;
    }
}