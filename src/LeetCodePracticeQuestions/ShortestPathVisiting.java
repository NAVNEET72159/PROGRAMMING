package LeetCodePracticeQuestions;

public class ShortestPathVisiting {
    public static void main(String[] args) {
        int[][] graph = {{1,2,3},{0},{0},{0}};
        System.out.println(shortestPathLength(graph));
    }
    public static int shortestPathLength(int[][] graph) {
        int n = graph.length;
        int[][] dp = new int[n][1<<n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < (1<<n); j++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }
        for(int i = 0; i < n; i++) {
            dp[i][1<<i] = 0;
        }
        for(int mask = 0; mask < (1<<n); mask++) {
            boolean repeat = true;
            while(repeat) {
                repeat = false;
                for(int head = 0; head < n; head++) {
                    if((mask & (1<<head)) == 0) {
                        continue;
                    }
                    for(int next : graph[head]) {
                        int newMask = mask | (1<<next);
                        if(dp[next][newMask] > dp[head][mask] + 1) {
                            dp[next][newMask] = dp[head][mask] + 1;
                            if(newMask == (1<<n)-1) {
                                return dp[next][newMask];
                            }
                            repeat = true;
                        }
                    }
                }
            }
        }
        return -1;
    }
}
