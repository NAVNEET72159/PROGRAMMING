package LeetCodePracticeQuestions;

public class ValidPalindrome {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(str));
    }
    public static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()) {
            if(Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }
        int left = 0;
        int right = sb.length() - 1;
        while(left < right) {
            if(sb.charAt(left) != sb.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
