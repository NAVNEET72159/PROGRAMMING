package LeetCodePracticeQuestions;

public class KWeakestRowInMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1, 1, 0, 0, 0},
                       {1, 1, 1, 1, 0},
                       {1, 0, 0, 0, 0},
                       {1, 1, 0, 0, 0},
                       {1, 1, 1, 1, 1}};
        int k = 3;
        int[] ans = kWeakestRows(mat, k);
        for(int i : ans)
            System.out.print(i + " ");
    }
    public static int[] kWeakestRows(int[][] mat, int k) {
        int[] ans = new int[k];
        int[] count = new int[mat.length];
        for(int i = 0; i < mat.length; i++) {
            int l = 0, r = mat[0].length - 1;
            while(l <= r) {
                int mid = l + (r - l) / 2;
                if(mat[i][mid] == 1)
                    l = mid + 1;
                else
                    r = mid - 1;
            }
            count[i] = l;
        }
        for(int i = 0; i < k; i++) {
            int min = Integer.MAX_VALUE;
            int index = -1;
            for(int j = 0; j < count.length; j++) {
                if(count[j] < min) {
                    min = count[j];
                    index = j;
                }
            }
            ans[i] = index;
            count[index] = Integer.MAX_VALUE;
        }
        return ans;
    }
}
