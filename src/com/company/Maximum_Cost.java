package com.company;

import java.util.Scanner;

public class Maximum_Cost {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        while (T--!=0) {
            int N = scanner.nextInt();
            int L = scanner.nextInt();
            int X = scanner.nextInt();

            if (L > N/2) {
                System.out.println((N-L)*X);
            }
            else {
                System.out.println(L*X);
            }
        }
        System.out.close();
    }
}