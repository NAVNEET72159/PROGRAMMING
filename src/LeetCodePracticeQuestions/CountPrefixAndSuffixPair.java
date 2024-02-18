package LeetCodePracticeQuestions;

public class CountPrefixAndSuffixPair {
    public static void main(String[] args) {
        String[] words = {"abab", "ab"};
        System.out.println(countPrefixAndSuffixPair(words));
    }
    public static int countPrefixAndSuffixPair(String[] words) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i+1; j < words.length; j++) {
                if (i != j) {
                    if (isPrefixAndSuffix(words[i], words[j])) {
                        count++;
                    }
                }
                System.out.println(words[i] + " " + words[j] + " " + count);
            }
        }
        return count;
    }
    public static boolean isPrefixAndSuffix(String prefix, String word) {
        int n = word.length();
        int m = prefix.length();
        if (n < m) {
            return false;
        }
        System.out.println(word.substring(0, m) + " " + word.substring(n - m));
        return word.substring(0, m).equals(prefix) && word.substring(n - m).equals(prefix);
    }
}
