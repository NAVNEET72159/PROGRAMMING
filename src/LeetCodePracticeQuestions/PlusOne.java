package LeetCodePracticeQuestions;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {9,9,9};
        int[] ans = plusOne(digits);
        for(int i=0;i<ans.length;i++) {
            System.out.print(ans[i] + " ");
        }
    }
    public static int[] plusOne(int[] digits) {
        int carry = 1;
        for(int i=digits.length-1;i>=0;i--) {
            int sum = digits[i] + carry;
            digits[i] = sum % 10;
            carry = sum / 10;
        }
        if(carry == 0) {
            return digits;
        }
        int[] ans = new int[digits.length+1];
        ans[0] = carry;
        System.arraycopy(digits, 0, ans, 1, ans.length - 1);
        return ans;
    }
}
