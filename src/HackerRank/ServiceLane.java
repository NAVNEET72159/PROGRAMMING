package HackerRank;

import java.util.ArrayList;
import java.util.List;

public class ServiceLane {
    public static void main(String[] args) {
        int n = 8;
        List<Integer> width = List.of(2, 3, 1, 2, 3, 2, 3, 3);
        List<List<Integer>> cases = List.of(List.of(0, 3), List.of(4, 6), List.of(6, 7), List.of(3, 5), List.of(0, 7));
        System.out.println(serviceLane(n, width, cases));
    }
    public static List<Integer> serviceLane(int n, List<Integer> width, List<List<Integer>> cases) {
        List<Integer> result = new ArrayList<>();
        for(List<Integer> c : cases) {
            int start = c.get(0);
            int end = c.get(1);
            int min = Integer.MAX_VALUE;
            for(int i = start; i<=end; i++) {
                min = Math.min(min, width.get(i));
            }
            result.add(min);
        }
        return result;
    }
}
