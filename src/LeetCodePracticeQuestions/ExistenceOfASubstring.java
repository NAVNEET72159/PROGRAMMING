package LeetCodePracticeQuestions;

public class ExistenceOfASubstring {
    public static void main(String[] args) {
        String s = "abcba";
        System.out.println(isSubsequence(s));
    }
    public static boolean isSubsequence(String s) {
        String rev = reverseString(s);
        for(int i = 0; i < s.length()-1; i++) {
            String find = s.substring(i, i+2);
            if(rev.contains(find)) {
                return true;
            }
        }
        return false;
    }
    public static String reverseString(String s) {
        StringBuilder rev = new StringBuilder();
        for(int i = s.length()-1; i>=0; i--) {
            rev.append(s.charAt(i));
        }
        return rev.toString();
    }
}
