package LeetCodePracticeQuestions;

public class NumberOfSubmatrices {
    public static void main(String[] args) {
        int[][] mat = {{1,0,1},{1,1,0},{1,1,0}};
        int target = 0;
        System.out.println(numSubmatrixSumTarget(mat, target));
    }
    public static int numSubmatrixSumTarget(int[][] matrix, int target) {
        int count = 0;
        int[][] prefixSum = new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[0].length;j++) {
                prefixSum[i][j] = matrix[i][j];
                if(i > 0) {
                    prefixSum[i][j] += prefixSum[i-1][j];
                }
                if(j > 0) {
                    prefixSum[i][j] += prefixSum[i][j-1];
                }
                if(i > 0 && j > 0) {
                    prefixSum[i][j] -= prefixSum[i-1][j-1];
                }
            }
        }
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[0].length;j++) {
                for(int k=i;k<matrix.length;k++) {
                    for(int l=j;l<matrix[0].length;l++) {
                        int sum = prefixSum[k][l];
                        if(i > 0) {
                            sum -= prefixSum[i-1][l];
                        }
                        if(j > 0) {
                            sum -= prefixSum[k][j-1];
                        }
                        if(i > 0 && j > 0) {
                            sum += prefixSum[i-1][j-1];
                        }
                        if(sum == target) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}
