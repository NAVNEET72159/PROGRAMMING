package com.company;

import java.util.Scanner;

public class A_Last_Card {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int A = scanner.nextInt();
        while (K!=1) {
            K=K-1;
            if (A==N) {
                A=1;
            }
            else {
                A++;
            }
        }
        System.out.println(A);
    }
}
