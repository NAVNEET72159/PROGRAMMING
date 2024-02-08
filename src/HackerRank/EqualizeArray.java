package HackerRank;

import java.util.List;

public class EqualizeArray {
    public static void main(String[] args) {
        List<Integer> arr = List.of(3, 3, 2, 1, 3);
        System.out.println(equalizeArray(arr));
    }
    public static int equalizeArray(List<Integer> arr) {
        int[] freq = new int[101];
        for (Integer integer : arr) {
            freq[integer]++;
        }
        int max = 0;
        for (int j : freq) {
            if (j > max) {
                max = j;
            }
        }
        return arr.size() - max;
    }
}
