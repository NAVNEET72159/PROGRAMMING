package com.company;

import java.util.Scanner;

public class Between_Two_Sets {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int b[] = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = scanner.nextInt();
        }

        int count = 0;
        for (int i = 1; i <= 100; i++) {
            boolean check = true;

            for (int j = 0; j < n; j++) {
                if (i % a[j] != 0)
                    check = false;
            }
            for (int j = 0; j < m; j++) {
                if (b[j] % i != 0)
                    check = false;
            }
            if (check)
                count++;
        }
        System.out.println(count);
    }
}
