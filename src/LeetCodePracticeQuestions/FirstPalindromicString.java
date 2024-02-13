package LeetCodePracticeQuestions;

public class FirstPalindromicString {
    public static void main(String[] args) {
        String[] s = {"abc", "car", "ada", "racecar", "cool"};
        System.out.println(countSubstrings(s));
    }
    public static String countSubstrings(String[] s) {
        String str = "";
        for(String st : s) {
            if(isPalindrome(st)) {
                str = st;
                break;
            }
        }
        return str;
    }
    public static boolean isPalindrome(String s) {
        StringBuilder rev = new StringBuilder();
        for(int i = s.length() - 1; i >= 0; i--) {
            rev.append(s.charAt(i));
        }
        return s.contentEquals(rev);
    }
}
