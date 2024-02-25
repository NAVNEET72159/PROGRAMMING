package LeetCodePracticeQuestions;

public class GreatestCommonDivisorTraversal {
    public static void main(String[] args) {
        int[] nums = {2,3,6};
        System.out.println(canTraverseAllPairs(nums));
    }
    public static boolean canTraverseAllPairs(int[] nums) {
        int gcd = nums[0];
        for(int i = 1; i < nums.length; i++) {
            gcd = findGCD(gcd, nums[i]);
            if(gcd == 1) {
                return true;
            }
        }
        return false;
    }
    public static int findGCD(int a, int b) {
        if(b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }
}