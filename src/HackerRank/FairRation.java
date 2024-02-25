package HackerRank;

import java.util.List;

public class FairRation {
    public static void main(String[] args) {
        List<Integer> arr = List.of(2, 3, 4, 5, 6);
        System.out.println(fairRations(arr));
    }
    public static String fairRations(List<Integer> arr) {
        int sum = 0;
        for(int i : arr) {
            sum += i;
        }
        if(sum % 2 != 0) {
            return "NO";
        }
        int count = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            if(arr.get(i) % 2 != 0) {
                arr.set(i, arr.get(i) + 1);
                arr.set(i + 1, arr.get(i + 1) + 1);
                count += 2;
            }
        }
        return String.valueOf(count);
    }
}
