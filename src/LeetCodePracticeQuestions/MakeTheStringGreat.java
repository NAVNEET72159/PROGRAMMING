package LeetCodePracticeQuestions;

public class MakeTheStringGreat {
    public static void main(String[] args) {
        String s = "leEeetcode";
        System.out.println(makeGood(s));
    }
    public static boolean makeGood(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()) {
            if(!sb.isEmpty() && Math.abs(sb.charAt(sb.length() - 1) - c) == 32) {
                sb.deleteCharAt(sb.length() - 1);
            } else {
                sb.append(c);
            }
        }
        return sb.isEmpty();
    }
}
