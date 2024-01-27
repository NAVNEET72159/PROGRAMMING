package LeetCodePracticeQuestions;

public class LengthLastWord {
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s));
    }
    public static int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        if(words.length == 0) {
            return 0;
        }
        return words[words.length-1].length();
    }
}
