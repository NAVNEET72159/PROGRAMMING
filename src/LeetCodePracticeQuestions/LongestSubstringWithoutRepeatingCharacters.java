package LeetCodePracticeQuestions;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "abcabcbb";
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
            j++;
        }
        return ans;
    }
}
