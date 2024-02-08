package HackerRank;

import java.util.ArrayList;
import java.util.List;

public class QueenAttack {
    public static void main(String[] args) {
        int n = 5;
        int k = 3;
        int r_q = 4;
        int c_q = 3;
        List<List<Integer>> obstacles = new ArrayList<>();
        obstacles.add(List.of(5, 5));
        obstacles.add(List.of(4, 2));
        obstacles.add(List.of(2, 3));
        System.out.println(queensAttack(n, k, r_q, c_q, obstacles));
    }
    public static int queensAttack(int n, int k, int r_q, int c_q, List<List<Integer>> obstacles) {
        int count = 0;
        int r = r_q;
        int c = c_q;
        while (r < n) {
            r++;
            if (obstacles.contains(List.of(r, c))) {
                break;
            }
            count++;
        }
        r = r_q;
        c = c_q;
        while (r > 1) {
            r--;
            if (obstacles.contains(List.of(r, c))) {
                break;
            }
            count++;
        }
        r = r_q;
        c = c_q;
        while (c < n) {
            c++;
            if (obstacles.contains(List.of(r, c))) {
                break;
            }
            count++;
        }
        r = r_q;
        c = c_q;
        while (c > 1) {
            c--;
            if (obstacles.contains(List.of(r, c))) {
                break;
            }
            count++;
        }
        r = r_q;
        c = c_q;
        while (r < n && c < n) {
            r++;
            c++;
            if (obstacles.contains(List.of(r, c))) {
                break;
            }
            count++;
        }
        r = r_q;
        c = c_q;
        while (r > 1 && c > 1) {
            r--;
            c--;
            if (obstacles.contains(List.of(r, c))) {
                break;
            }
            count++;
        }
        r = r_q;
        c = c_q;
        while (r < n && c > 1) {
            r++;
            c--;
            if (obstacles.contains(List.of(r, c))) {
                break;
            }
            count++;
        }
        r = r_q;
        c = c_q;
        while (r > 1 && c < n) {
            r--;
            c++;
            if (obstacles.contains(List.of(r, c))) {
                break;
            }
            count++;
        }
        return count;
    }
}
