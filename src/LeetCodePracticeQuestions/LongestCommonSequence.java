package LeetCodePracticeQuestions;

public class LongestCommonSequence {
    public static void main(String[] args) {
        String text1 = "abcde";
        String text2 = "ace";
        System.out.println(longestCommonSubsequence(text1,text2));
    }

    public static int longestCommonSubsequence(String text1, String text2) {
        if(text1.equals(text2))
            return text1.length();
        char[] t1 = text1.toCharArray();
        char[] t2 = text2.toCharArray();

        if(t1.length > t2.length) {
            int[] dp = new int[t1.length+1];
            for (char c : t2) {
                int pc = 0, prc;
                for (int j = 0; j < t1.length; j++) {
                    prc = pc;
                    pc = dp[j + 1];
                    if (t1[j] == c) {
                        dp[j + 1] = prc + 1;
                    } else {
                        dp[j + 1] = Math.max(dp[j], dp[j + 1]);
                    }
                }
            }
            return dp[t1.length];
        } else {
            int[] dp = new int[t2.length+1];
            for (char c : t1) {
                int pc = 0, prc;
                for (int j = 0; j < t2.length; j++) {
                    prc = pc;
                    pc = dp[j + 1];
                    if (t2[j] == c) {
                        dp[j + 1] = prc + 1;
                    } else {
                        dp[j + 1] = Math.max(dp[j], dp[j + 1]);
                    }
                }
            }
            return dp[t2.length];
        }
    }
}
