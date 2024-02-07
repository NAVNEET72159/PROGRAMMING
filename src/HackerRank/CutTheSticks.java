package HackerRank;

import java.util.List;

public class CutTheSticks {
    public static void main(String[] args) {
        List<Integer> arr = List.of(5, 4, 4, 2, 2, 8);
        System.out.println(cutTheSticks(arr));
    }
    public static List<Integer> cutTheSticks(List<Integer> arr) {
        arr.sort(Integer::compareTo);
        int n = arr.size();
        int i = 0;
        while (i < n) {
            System.out.println(n - i);
            int min = arr.get(i);
            while (i < n && arr.get(i) == min) {
                i++;
            }
        }
        return arr;
    }
}
