package LeetCodePracticeQuestions;

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(minWindow(s, t));
    }
    public static String minWindow(String s, String t) {
        int[] map = new int[128];
        for(char c : t.toCharArray()) {
            map[c]++;
        }
        int start = 0, end = 0, minStart = 0, minLen = Integer.MAX_VALUE, counter = t.length();
        while(end < s.length()) {
            if(map[s.charAt(end)] > 0) {
                counter--;
            }
            map[s.charAt(end)]--;
            end++;
            while(counter == 0) {
                if(end - start < minLen) {
                    minStart = start;
                    minLen = end - start;
                }
                map[s.charAt(start)]++;
                if(map[s.charAt(start)] > 0) {
                    counter++;
                }
                start++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }
}
