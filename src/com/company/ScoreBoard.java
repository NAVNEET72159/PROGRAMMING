package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScoreBoard {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        while (T-->0) {

            ScoreBoard obj = new ScoreBoard();

            int N = Integer.parseInt(br.readLine());
            int Q = Integer.parseInt(br.readLine());

            int A[] = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = Integer.parseInt(br.readLine());
            }

            obj.Sort(A, N);

            int Result = 1;

            while (Q>0) {

                int L = Integer.parseInt(br.readLine());
                int R = Integer.parseInt(br.readLine());

                Result = obj.Update(A, N, L, R, Q);
                Q--;
            }
            System.out.println(++Result);
        }
    }

    public int[] Sort(int[] A, int N) {

        int temp;
        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                if (A[i]<A[j]) {
                    temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }
        return A;
    }

    public int Update(int A[], int N, int L, int R, int Q) {

        if (Q!=0) {
            A[L] = R;
            Sort(A, N);
        }
        int count = 1;

        for (int i = 0; i < N-1; i++) {
            if (A[i] != A[i+1]) {
                count++;
            }
        }
        return count;
    }
}