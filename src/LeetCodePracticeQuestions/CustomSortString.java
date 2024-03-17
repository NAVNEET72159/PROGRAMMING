package LeetCodePracticeQuestions;

public class CustomSortString {
    public static void main(String[] args) {
        String order = "cba";
        String s = "abcd";
        System.out.println(customSortString(order, s));
    }
    public static String customSortString(String order, String s) {
        int[] count = new int[26];
        for(char c : s.toCharArray()) {
            count[c-'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for(char c : order.toCharArray()) {
            while(count[c-'a']-- > 0) {
                sb.append(c);
            }
        }
        for(int i = 0; i < 26; i++) {
            while(count[i]-- > 0) {
                sb.append((char)(i+'a'));
            }
        }
        return sb.toString();
    }
}
