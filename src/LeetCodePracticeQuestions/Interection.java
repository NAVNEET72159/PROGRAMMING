package LeetCodePracticeQuestions;

import java.util.HashSet;

public class Interection {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] result = intersection(nums1, nums2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        int k = 0;
        for (int value : nums1) {
            for (int i : nums2) {
                if (value == i && !set.contains(value)) {
                    set.add(value);
                    k++;
                    break;
                }
            }
        }
        return set.stream().mapToInt(Integer::intValue).toArray();
    }
}
