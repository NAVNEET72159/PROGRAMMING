package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Pair {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int n = A.length;

        int ans = 0;
        for (int i = 0; i < n-1; i++) {
            int sum = A[i] + A[i+1];
            ans = Math.max(ans, 1 + getCount(i+2, sum, A));
        }

        return ans;
    }

    public int getCount(int idx, int sum, int[] arr) {
        int n = arr.length;
        if (idx >= n-1) {
            return 0;
        }

        int count = 0;
        if (arr[idx] + arr[idx+1] == sum)
            count = 1 + getCount(idx+2, sum, arr);


        return Math.max(count, getCount(idx+1, sum, arr));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A[] = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        Pair pair = new Pair();
        System.out.println(pair.solution(A));
    }
}
