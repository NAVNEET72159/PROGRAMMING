package LeetCodePracticeQuestions;

public class RemoveKDigits {
    public static void main(String[] args) {
        String num = "1432219";
        int k = 3;
        System.out.println(removeKDigits(num, k));
    }
    public static String removeKDigits(String num, int k) {
        StringBuilder sb = new StringBuilder();
        for(char c : num.toCharArray()) {
            while(!sb.isEmpty() && sb.charAt(sb.length() - 1) > c && k > 0) {
                sb.deleteCharAt(sb.length() - 1);
                k--;
            }
            if(!sb.isEmpty() || c != '0') {
                sb.append(c);
            }
        }
        while(!sb.isEmpty() && k-- > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.isEmpty() ? "0" : sb.toString();
    }
}
