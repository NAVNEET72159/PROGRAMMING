package LeetCodePracticeQuestions;

public class CheapestFlightsWithinKStops {
    public static void main(String[] args) {
        int n = 3;
        int[][] flights = {{0, 1, 100}, {1, 2, 100}, {0, 2, 500}};
        int src = 0;
        int dst = 2;
        int k = 1;
        System.out.println(findCheapestPrice(n, flights, src, dst, k));
    }
    public static int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int[] cost = new int[n];
        for(int i = 0; i < n; i++) {
            cost[i] = Integer.MAX_VALUE;
        }
        cost[src] = 0;
        for(int i = 0; i <= k; i++) {
            int[] temp = cost.clone();
            for(int[] flight : flights) {
                int u = flight[0];
                int v = flight[1];
                int w = flight[2];
                if(cost[u] != Integer.MAX_VALUE && cost[u] + w < temp[v]) {
                    temp[v] = cost[u] + w;
                }
            }
            cost = temp;
        }
        return cost[dst] == Integer.MAX_VALUE ? -1 : cost[dst];
    }
}
