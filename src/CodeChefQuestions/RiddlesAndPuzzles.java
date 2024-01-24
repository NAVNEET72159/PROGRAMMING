package CodeChefQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class RiddlesAndPuzzles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solve(N, arr));
    }
    static int solve(int N, int arr[]) {
        int count = 0;
        Arrays.sort(arr);
        for (int i = 0; i < N; i++) {
            int K = arr[i];
            for (int j = 0; j < N-1; j++) {
                if (arr[j]<K && arr[j]+arr[j+1] == K) {
                    count++;
                }
            }
        }
        return count;
    }
}
