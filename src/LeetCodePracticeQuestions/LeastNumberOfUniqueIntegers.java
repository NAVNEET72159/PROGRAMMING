package LeetCodePracticeQuestions;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class LeastNumberOfUniqueIntegers {
    public static void main(String[] args) {
        int[] arr = {5, 5, 4};
        System.out.println(findLeastNumOfUniqueInts(arr, 1));
    }

    public static int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.sort(arr);
        for(int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int[] freq = new int[map.size()];
        int index = 0;
        for(int i : map.values()) {
            freq[index++] = i;
        }
        Arrays.sort(freq);
        for(int i : freq) {
            if(k >= i) {
                k -= i;
                index--;
            }
            else
                break;
        }
        return index;
    }
}
