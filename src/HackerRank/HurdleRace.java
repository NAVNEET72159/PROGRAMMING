package HackerRank;

import java.util.List;

public class HurdleRace {
    public static void main(String[] args) {
        int k = 4;
        List<Integer> height = List.of(1, 6, 3, 5, 2);
        System.out.println(hurdleRace(k, height));
    }
    public static int hurdleRace(int k, List<Integer> height) {
        int max = 0;
        for (Integer integer : height) {
            if (integer > max) {
                max = integer;
            }
        }
        return Math.max(0, max - k);
    }
}
