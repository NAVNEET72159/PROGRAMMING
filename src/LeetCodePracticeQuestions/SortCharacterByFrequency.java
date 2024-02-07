package LeetCodePracticeQuestions;

public class SortCharacterByFrequency {
    public static void main(String[] args) {
        String s = "tree";
        System.out.println(frequencySort(s));
    }
    public static String frequencySort(String s) {
        int[] count = new int[256];
        for(char c : s.toCharArray()) {
            count[c]++;
        }
        StringBuilder sb = new StringBuilder();
        while(sb.length() < s.length()) {
            int max = 0;
            int index = 0;
            for(int i=0;i<256;i++) {
                if(count[i] > max) {
                    max = count[i];
                    index = i;
                }
            }
            for(int i=0;i<max;i++) {
                sb.append((char)index);
            }
            count[index] = 0;
        }
        return sb.toString();
    }
}
