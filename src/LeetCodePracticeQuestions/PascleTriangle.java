package LeetCodePracticeQuestions;

import java.util.ArrayList;
import java.util.List;
public class PascleTriangle {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(generate(n));
    }
    public static List<List<Integer>> generate(int n) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>();
            for(int j = 0; j <= i; j++) {
                if(j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
                }
            }
            result.add(row);
        }
        return result;
    }
}
