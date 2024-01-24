package CodeChefQuestions;

import java.util.Arrays;
import java.util.Scanner;
public class asymmetricSwap {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0) {
            int N = sc.nextInt();
            int A[] = new int[N];
            int B[] = new int[N];
            for (int i=0; i<N; i++) {
                A[i] = sc.nextInt();
            }
            for (int i = 0; i < N; i++) {
                B[i] = sc.nextInt();
            }

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (A[i] > B[j]) {
                        int temp = A[i];
                        A[i] = B[j];
                    }
                }
            }

            int max = Arrays.stream(A).max().getAsInt();
            int min = Arrays.stream(A).min().getAsInt();

            int difference = max - min;
            System.out.println();
            System.out.println(min+" "+max);
            for (int i=0; i<N; i++) {
                System.out.print(A[i]+", ");
            }
            System.out.println();
            System.out.println(difference);
        }
    }
}
