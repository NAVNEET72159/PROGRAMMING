package LeetCodePracticeQuestions;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        int[] arr1 = {17};
        int[] arr2 = {16};
        System.out.println(longestCommonPrefix(arr1, arr2));
    }
    public static int longestCommonPrefix(int[] arr1, int[] arr2) {
        if (arr1 == null || arr1.length == 0 || arr2 == null || arr2.length == 0) {
            return 0;
        }
        String[] strArr1 = new String[arr1.length];
        String[] strArr2 = new String[arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            strArr1[i] = String.valueOf(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            strArr2[i] = String.valueOf(arr2[i]);
        }
        if (strArr1.length > strArr2.length) {
            return findLongestCommonPrefix(strArr2, strArr1);
        }
        else {
            return findLongestCommonPrefix(strArr1, strArr2);
        }
    }
    public static int findLongestCommonPrefix(String[] strArr1, String[] strArr2) {
        int count = 0;
        for (String s : strArr1) {
            for (String string : strArr2) {
                if(s.length() > string.length() && s.startsWith(string)) {
                    count++;
                }
                else if (string.startsWith(s)) {
                    count++;
                }
            }
        }
        return count;
    }
}
