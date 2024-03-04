package LeetCodePracticeQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllPeopleWithSecret {
    public static void main(String[] args) {
        int n = 3;
        int[][] secret = {{1,2,5}, {2,3,8}, {1,5,10}};
        int firstPerson = 1;
        System.out.println(findSecrets(n, secret, firstPerson));
    }
    public static List<Integer> findSecrets(int n, int[][] meetings, int firstPerson) {
        int[] groups = new int[100000];
        List<Integer> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        for (int i = 0; i < n; ++i) groups[i] = i;
        groups[firstPerson] = 0;

        Arrays.sort(meetings, (a, b) -> Integer.compare(a[2], b[2]));

        int i = 0;
        while (i < meetings.length) {
            int currentTime = meetings[i][2];
            temp.clear();
            while (i < meetings.length && meetings[i][2] == currentTime) {
                int g1 = find(groups, meetings[i][0]);
                int g2 = find(groups, meetings[i][1]);
                groups[Math.max(g1, g2)] = Math.min(g1, g2);
                temp.add(meetings[i][0]);
                temp.add(meetings[i][1]);
                ++i;
            }
            for (Integer integer : temp) {
                if (find(groups, integer) != 0) {
                    groups[integer] = integer;
                }
            }
        }

        for (int j = 0; j < n; ++j) {
            if (find(groups, j) == 0) result.add(j);
        }

        return result;
    }

    private static int find(int[] groups, int index) {
        while (index != groups[index]) index = groups[index];
        return index;
    }
}