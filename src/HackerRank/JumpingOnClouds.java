package HackerRank;

import java.util.List;

public class JumpingOnClouds {
    public static void main(String[] args) {
        List<Integer> c = List.of(0, 0, 1, 0, 0, 1, 0);
        System.out.println(jumpingOnClouds(c));
    }
    public static int jumpingOnClouds(List<Integer> c) {
        int jumps = 0;
        for (int i = 0; i < c.size() - 1; i++) {
            if (i + 2 < c.size() && c.get(i + 2) == 0) {
                i++;
            }
            jumps++;
        }
        return jumps;
    }
}
