package LeetCodePracticeQuestions;

public class MaximumLengthSubstringWithTwoOccurrences {
    public static void main(String[] args) {
        String s = "bcbbbcba";
        System.out.println(maxLengthSubstring(s));
    }
    public static int maxLengthSubstring(String s) {
        int n = s.length();
        int max = 0;
        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                String find = s.substring(i, j+1);
                if(find.length() % 2 == 0) {
                    int mid = find.length() / 2;
                    String first = find.substring(0, mid);
                    String second = find.substring(mid);
                    if(first.equals(second)) {
                        max = Math.max(max, find.length());
                    }
                    System.out.print(find + " " + first + " " + second + " " + max + " ");
                }
            }
            System.out.println();
        }
        return max;
    }
}
