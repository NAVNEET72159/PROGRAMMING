package HackerRank;

import java.util.List;

public class LisaWorkbook {
    public static void main(String[] args) {
        List<Integer> arr = List.of(4, 2, 6, 1, 10);
        int k = 3;
        System.out.println(workbook(arr, k));
    }
    public static int workbook(List<Integer> arr, int k) {
        int specialProblem = 0;
        int page = 1;
        for (Integer integer : arr) {
            for (int j = 1; j <= integer; j++) {
                if (j == page) {
                    specialProblem++;
                }
                if (j == integer || j % k == 0) {
                    page++;
                }
            }
        }
        return specialProblem;
    }
}
