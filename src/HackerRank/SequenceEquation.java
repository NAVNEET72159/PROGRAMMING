package HackerRank;

import java.util.ArrayList;
import java.util.List;

public class SequenceEquation {
    public static void main(String[] args) {
        int n = 5;
        List<Integer> p = List.of(4, 3, 5, 1, 2);
        List<Integer> result = permutationEquation(p);
    }
    public static List<Integer> permutationEquation(List<Integer> p) {
        int n = p.size();
        int[] arr = new int[n + 1];
        for (int i = 0; i < n; i++) {
            arr[p.get(i)] = i + 1;
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            result.add(arr[arr[i]]);
        }
        return result;
    }
}
