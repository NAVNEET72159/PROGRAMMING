package LeetCodePracticeQuestions;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int[] lastIndex = new int[256];
        int i = 0;
        int j = 0;
        int ans = 0;
        while(j < n) {
            i = Math.max(i, lastIndex[s.charAt(j)]);
            ans = Math.max(ans, j - i + 1);
            lastIndex[s.charAt(j)] = j + 1;
            System.out.println("i: " + i + " j: " + j + " ans: " + ans + " lastIndex: " + lastIndex[s.charAt(j)]+ " s.charAt(j): " + s.charAt(j));
            j++;
        }
        return ans;
    }
}
