package LeetCodePracticeQuestions;

public class OutOfBoundary {
    public static void main(String[] args) {
        int m = 2, n = 2, maxMove = 2, startRow = 0, startColumn = 0;
        System.out.println(findPath(m, n, maxMove, startRow, startColumn));
    }
    public static int findPath(int m, int n, int maxMove, int startRow, int startColumn) {
        int[][][] dp = new int[m][n][maxMove+1];
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                for(int k=0;k<=maxMove;k++) {
                    dp[i][j][k] = -1;
                }
            }
        }
        return findPathHelper(m, n, maxMove, startRow, startColumn, dp);
    }
    public static int findPathHelper(int m, int n, int maxMove, int startRow, int startColumn, int[][][] dp) {
        if(startRow < 0 || startRow >= m || startColumn < 0 || startColumn >= n) {
            return 1;
        }
        if(maxMove == 0) {
            return 0;
        }
        if(dp[startRow][startColumn][maxMove] != -1) {
            return dp[startRow][startColumn][maxMove];
        }
        int count = 0;
        count = (count + findPathHelper(m, n, maxMove-1, startRow-1, startColumn, dp)) % 1000000007;
        count = (count + findPathHelper(m, n, maxMove-1, startRow+1, startColumn, dp)) % 1000000007;
        count = (count + findPathHelper(m, n, maxMove-1, startRow, startColumn-1, dp)) % 1000000007;
        count = (count + findPathHelper(m, n, maxMove-1, startRow, startColumn+1, dp)) % 1000000007;
        dp[startRow][startColumn][maxMove] = count;
        return count;
    }
}
