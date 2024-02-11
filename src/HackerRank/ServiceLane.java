package HackerRank;

import java.util.ArrayList;
import java.util.List;

public class ServiceLane {
    public static void main(String[] args) {
        int n = 8;
        List<List<Integer>> cases = List.of(
                List.of(2, 3, 1, 2, 3, 4, 3, 2, 1),
                List.of(0, 3),
                List.of(4, 6),
                List.of(6, 7),
                List.of(3, 5),
                List.of(0, 7)
        );
        System.out.println(serviceLane(n, cases));
    }
    public static List<Integer> serviceLane(int n, List<List<Integer>> cases) {
        List<Integer> result = new ArrayList<>();
        for(List<Integer> c : cases) {
            int start = c.get(0);
            int end = c.get(1);
            int min = Integer.MAX_VALUE;
            for(int i = start; i <= end; i++) {
                min = Math.min(min, c.get(i));
            }
            result.add(min);
        }
        return result;
    }
}
