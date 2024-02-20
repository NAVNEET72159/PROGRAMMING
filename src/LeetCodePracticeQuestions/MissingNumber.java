package LeetCodePracticeQuestions;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {3, 0, 1};
        System.out.println(missingNumber(arr));
    }
    public static int missingNumber(int[] arr) {
        int n = arr.length;
        int sum = n * (n + 1) / 2;
        for(int i : arr) {
            sum -= i;
        }
        return sum;
    }
}
