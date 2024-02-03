package LeetCodePracticeQuestions;

public class PartitionArrayForMaximumSum {
    public static void main(String[] args) {
        int[] nums = {1,15,7,9,2,5,10};
        int k = 3;
        System.out.println(maxSumAfterPartitioning(nums, k));
    }
    public static int maxSumAfterPartitioning(int[] arr, int k) {
        int n = arr.length;
        int[] dp = new int[n];
        for(int i=0;i<n;i++) {
            int max = 0;
            for(int j=1;j<=k && i-j+1>=0;j++) {
                max = Math.max(max, arr[i-j+1]);
                if(i-j >= 0) {
                    dp[i] = Math.max(dp[i], dp[i-j] + max*j);
                }
                else {
                    dp[i] = Math.max(dp[i], max*j);
                }
            }
        }
        return dp[n-1];
    }
}
