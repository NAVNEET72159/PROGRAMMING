package HackerRank;

import java.util.List;

public class ClimbingLeadboard {
    public static void main(String[] args) {
        List<Integer> ranked = List.of(100, 90, 90, 80, 75, 60);
        List<Integer> player = List.of(50, 65, 77, 90, 102);
        System.out.println(climbingLeaderboard(ranked, player));
    }
    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        int[] ranks = new int[ranked.size()];
        ranks[0] = 1;
        for(int i = 1; i < ranked.size(); i++) {
            if(ranked.get(i).equals(ranked.get(i - 1))) {
                ranks[i] = ranks[i-1];
            } else {
                ranks[i] = ranks[i-1] + 1;
            }
        }
        int i = ranked.size() - 1;
        int j = 0;
        List<Integer> result = new java.util.ArrayList<>();
        while(j < player.size()) {
            if(i == -1) {
                result.add(1);
                j++;
            } else if(player.get(j) < ranked.get(i)) {
                result.add(ranks[i] + 1);
                j++;
            } else if(player.get(j).equals(ranked.get(i))) {
                result.add(ranks[i]);
                j++;
            } else {
                i--;
            }
        }
        return result;
    }
}
