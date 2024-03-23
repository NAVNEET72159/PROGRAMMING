package LeetCodePracticeQuestions;

public class SumOfEncryptedInt {
    public static void main(String[] args) {
        int[] nums = {10,21,31};
        System.out.println(sumOfEncryptedInt(nums));
    }
    public static int sumOfEncryptedInt(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            int greatestDigit = 0;
            while(temp != 0) {
                greatestDigit = Math.max(greatestDigit, temp % 10);
                temp /= 10;
            }
            int newDigit = 0;
            temp = nums[i];
            while(temp != 0) {
                newDigit = newDigit * 10 + greatestDigit;
                temp /= 10;
            }
            nums[i] = newDigit;
        }
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }
}
