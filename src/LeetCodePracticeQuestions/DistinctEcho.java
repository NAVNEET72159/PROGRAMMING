package LeetCodePracticeQuestions;

public class DistinctEcho {
    public static void main(String[] args) {
        String text = "leetcodeleetcode";
        System.out.println(distinctEchoSubstrings(text));
    }
    public static int distinctEchoSubstrings(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            for (int j = i+1; j < text.length(); j+=2) {
                int len = j-i;
                if(j+len <= text.length()) {
                    String s1 = text.substring(i, i+len);
                    String s2 = text.substring(j, j+len);
                    if(s1.equals(s2)) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
