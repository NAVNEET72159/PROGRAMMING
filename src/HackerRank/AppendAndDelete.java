package HackerRank;

public class AppendAndDelete {
    public static void main(String[] args) {
        System.out.println(appendAndDelete("hackerhappy", "hackerrank", 9));
    }
    public static String appendAndDelete(String s, String t, int k) {
        int commonLength = 0;
        for (int i = 0; i < Math.min(s.length(), t.length()); i++) {
            if (s.charAt(i) != t.charAt(i)) {
                break;
            }
            commonLength++;
        }
        int totalOperations = s.length() + t.length() - 2 * commonLength;
        if (totalOperations > k) {
            return "No";
        }
        if ((k - totalOperations) % 2 == 0 || (k - totalOperations) >= 2 * commonLength) {
            return "Yes";
        }
        return "No";
    }
}
