package LeetCodePracticeQuestions;

import java.util.Arrays;

public class MinimumRoomIII {
    public static void main(String[] args) {
        int n = 2;
        int[][] meetings = {{0, 10}, {1, 5}, {2, 7}, {3, 4}};
        System.out.println(mostBooked(n, meetings));
    }
    public static int mostBooked(int n, int[][] meetings) {
        int[] ans = new int[n];
        long[] times = new long[n];
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0] , b[0]));
        for (int[] meeting : meetings) {
            int start = meeting[0], end = meeting[1];
            boolean flag = false;
            int minind = -1;
            long val = Long.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                if (times[j] < val) {
                    val = times[j];
                    minind = j;
                }
                if (times[j] <= start) {
                    flag = true;
                    ans[j]++;
                    times[j] = end;
                    break;
                }
            }
            if (!flag) {
                ans[minind]++;
                times[minind] += (end - start);
            }
        }
        int maxi = -1, id = -1;
        for (int j = 0; j < n; j++) {
            if (ans[j] > maxi) {
                maxi = ans[j];
                id = j;
            }
        }
        return id;
    }
}
