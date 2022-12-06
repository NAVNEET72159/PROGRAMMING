package com.company;

import java.util.Scanner;

public class B_KEYENCE {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int N, d = 0;
        N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            int S = scanner.nextInt();
            boolean Prediction = false;

            for (int a = 1; a < S/4; a++) {
                for (int b = 1; b < S/4; b++) {
                    if (S == (4*a*b)+(3*a)+(3*b)) {
                        Prediction = true;
                    }
                }
            }
            if (Prediction == false) {
                d++;
            }
        }
        System.out.println(d);
    }
}
