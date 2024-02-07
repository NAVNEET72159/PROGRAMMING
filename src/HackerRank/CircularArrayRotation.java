package HackerRank;

import java.util.List;

public class CircularArrayRotation {
    public static void main(String[] args) {
        List<Integer> a = List.of(1, 2, 3);
        int k = 2;
        List<Integer> queries = List.of(0, 1, 2);
        List<Integer> result = circularArrayRotation(a, k, queries);
        for (int i : result) {
            System.out.println(i);
        }
    }
    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
        int n = a.size();
        k = k % n;
        for (int i = 0; i < queries.size(); i++) {
            queries.set(i, a.get((n - k + queries.get(i)) % n));
        }
        return queries;
    }
}
