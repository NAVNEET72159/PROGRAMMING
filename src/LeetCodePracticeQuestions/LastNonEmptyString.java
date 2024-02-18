package LeetCodePracticeQuestions;

import java.util.*;

public class LastNonEmptyString {
    public static void main(String[] args) {
        String s = "aabcbbca";
        System.out.println(lastSubstring(s));
    }
    public static String lastSubstring(String s) {
        Set<String> set = new HashSet<>();
        for(int i = 0; i < s.length(); i++) {
            set.add(s.substring(i));
        }
        while (s.chars().distinct().count() != 0) {
            for (int i = 0; i < s.length(); i++) {
                if (set.contains(s.charAt(i))) {
                    s = s.replaceFirst(i+"", "");
                }
                System.out.println(s);
            }
        }
        return s;
    }
}
