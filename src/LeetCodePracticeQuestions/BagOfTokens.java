package LeetCodePracticeQuestions;

import java.util.Arrays;

public class BagOfTokens {
    public static void main(String[] args) {
        int[] tokens = {100, 200, 300, 400};
        int power = 200;
        System.out.println(bagOfTokensScore(tokens, power));
    }
    public static int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int s = 0;
        int maxi = 0;
        int l = 0, r = tokens.length - 1;

        while (l <= r) {
            if (power >= tokens[l]) {
                power -= tokens[l];
                s++;
                l++;
                maxi = Math.max(maxi, s);
            } else if (s > 0) {
                power += tokens[r];
                s--;
                r--;
            } else {
                break;
            }
        }

        return maxi;
    }
}
