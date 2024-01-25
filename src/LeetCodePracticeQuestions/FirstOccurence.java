package LeetCodePracticeQuestions;

import java.util.Stack;

public class FirstOccurence {
    public static void main(String[] args) {
        String hayStack = "hello";
        String needle = "ll";
        System.out.println(strStr(hayStack, needle));
    }
    public static int strStr(String haystack, String needle) {

        /*Method 1

        if(needle.isEmpty() || haystack.isEmpty())
            return 0;
        int i = 0;
        int j = 0;
        int index = -1;
        while(i < haystack.length() && j < needle.length()) {
            System.out.println("i: "+i+" j: "+j+" index: "+index);
            if(haystack.charAt(i) == needle.charAt(j)) {
                if(index == -1)
                    index = i;
                j++;
            } else {
                if(index != -1) {
                    i = index;
                    index = -1;
                }
                j = 0;
            }
            i++;
        }
        if(j == needle.length())
            return index;
        return -1;*/

        //Method 2
        if(needle.isEmpty() || haystack.isEmpty())
            return 0;
        for(int i = 0; i <= haystack.length() - needle.length(); i++) {
            if(haystack.startsWith(needle, i))
                return i;
        }
        return -1;

    }
}
