package com.company;

import java.util.*;

public class kiskStart2022SampleProblem {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int k = 0;
        while (T-->0) {

            int N = sc.nextInt();
            int M = sc.nextInt();

            int C[] = new int[N];
            int sum = 0;
            for(int i = 0; i<N;i++) {
                C[i] = sc.nextInt();
                sum += C[i];
            }

            int candiesLeft = sum%M;

            System.out.println(++k+" "+candiesLeft);
        }
    }
}
