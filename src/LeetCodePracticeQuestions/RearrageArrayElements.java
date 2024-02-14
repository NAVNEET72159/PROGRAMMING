package LeetCodePracticeQuestions;

public class RearrageArrayElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] rearranged = rearrangeArray(arr);
        for(int i : rearranged)
            System.out.print(i + " ");
    }
    public static int[] rearrangeArray(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        int pos = 0, neg = 1;
        for (int j : arr) {
            if (j > 0) {
                ans[pos] = j;
                pos += 2;
            } else {
                ans[neg] = j;
                neg += 2;
            }
        }
        return ans;
    }
}
