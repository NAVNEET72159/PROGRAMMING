package HackerRank;

public class RepeatedStrings {
    public static void main(String[] args) {
        System.out.println(repeatedString("aba", 10));
    }
    public static long repeatedString(String s, long n) {
        long count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                count++;
            }
        }
        long factor = n / s.length();
        long rem = n % s.length();
        count = factor * count;
        for (int i = 0; i < rem; i++) {
            if (s.charAt(i) == 'a') {
                count++;
            }
        }
        return count;
    }
}
