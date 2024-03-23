package LeetCodePracticeQuestions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class DistributeElementsIntoTwoArrays {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        int[] result = distributeElements(nums);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
    public static int[] distributeElements(int[] nums) {
        List<Integer> arr1 = new ArrayList<>(List.of(nums[0]));
        List<Integer> arr2 = new ArrayList<>(List.of(nums[1]));
        for (int i = 2; i < nums.length; i++) {
            if (arr1.get(arr1.size() - 1) > arr2.get(arr2.size() - 1)) {
                arr1.add(nums[i]);
            } else {
                arr2.add(nums[i]);
            }
        }

        int[] result = new int[nums.length];
        for (int i = 0; i < arr1.size(); i++) {
            result[i] = arr1.get(i);
        }
        for (int i = 0; i < arr2.size(); i++) {
            result[arr1.size() + i] = arr2.get(i);
        }
        return result;
    }
}
