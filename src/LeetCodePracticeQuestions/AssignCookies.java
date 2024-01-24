package LeetCodePracticeQuestions;

import java.util.Arrays;

public class AssignCookies {
    public static void main(String[] args) {
        int[] greed = {10, 9, 8, 7};
        int[] size = {5, 6, 7, 8};
        System.out.println(findContentChildren(greed, size));
    }
    public static int findContentChildren(int[] greed, int[] size) {
        int count = 0;
        Arrays.sort(greed);
        Arrays.sort(size);
        int i = 0;
        int j = 0;
        while( i < greed.length && j < size.length){
            if(greed[i] <= size[j]){
                count++;
                i++;
                j++;
            }else{
                j++;
            }
        }
        return count;
    }
}
