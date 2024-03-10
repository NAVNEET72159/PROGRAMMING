package LeetCodePracticeQuestions;

import java.util.Arrays;

public class AppleRedistributionIntoBoxes {
    public static void main(String[] args) {
        int[] apples = {9,8,8,2,3,1,6};
        int[] capacity = {10,1,4,10,8,5};
        System.out.println(minimumBoxes(apples, capacity));
    }
    public static int minimumBoxes(int[] apples, int[] capacity) {
        int sumApples = 0;
        int sumCapacity = 0;
        int count = 0;
        for (int apple : apples) {
            sumApples += apple;
        }
        System.out.println(sumApples);
        Arrays.sort(capacity);
        for (int i = capacity.length-1; i >= 0; i--) {
            if(sumApples >= sumCapacity) {
                sumCapacity += capacity[i];
                count++;
            }
        }
        return count;
    }
}
