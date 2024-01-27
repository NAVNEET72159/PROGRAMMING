package LeetCodePracticeQuestions;

public class KInversePair {
    public static void main(String[] args) {
        int n = 3, k = 1;
        System.out.println(kInversePairs(n, k));
    }

    public static int kInversePairs(int n, int k) {
        int[][] dp = new int[n+1][k+1];
        for(int i=0;i<=n;i++) {
            for(int j=0;j<=k;j++) {
                dp[i][j] = -1;
            }
        }
        return kInversePairsHelper(n, k, dp);
    }

    public static int kInversePairsHelper(int n, int k, int[][] dp) {
        if(n == 0) {
            return 0;
        }
        if(k == 0) {
            return 1;
        }
        if(dp[n][k] != -1) {
            return dp[n][k];
        }
        int count = 0;
        for(int i=0;i<=Math.min(k, n-1);i++) {
            count = (count + kInversePairsHelper(n-1, k-i, dp)) % 1000000007;
        }
        dp[n][k] = count;
        return count;
    }
}
