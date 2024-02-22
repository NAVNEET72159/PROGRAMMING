package HackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MinimumDistance {
    public static void main(String[] args) {
        List<Integer> a = List.of(7, 1, 3, 4, 1, 7);
        System.out.println(minimumDistances(a));
    }
    public static int minimumDistances(List<Integer> a) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < a.size(); i++) {
            for(int j = i + 1; j < a.size(); j++) {
                if(Objects.equals(a.get(i), a.get(j))) {
                    min = Math.min(min, j - i);
                }
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}
