package HackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CutTheSticks {
    public static void main(String[] args) {
        List<Integer> arr = List.of(5, 4, 4, 2, 2, 8);
        System.out.println(cutTheSticks(arr));
    }
    public static List<Integer> cutTheSticks(List<Integer> arr) {
        Collections.sort(arr);
        List<Integer> result = new ArrayList<>();
        while(!arr.isEmpty()) {
            result.add(arr.size());
            int min = arr.get(0);
            for (int i = 0; i < arr.size(); i++) {
                arr.set(i, arr.get(i) - min);
            }
            arr.removeIf(i -> i == 0);
        }
        return result;
    }
}
