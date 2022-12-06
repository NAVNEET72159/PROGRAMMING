package com.company;

import java.util.Scanner;

public class Maximum_Borders {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        int t, n, m;

        t = scanner.nextInt();
        for (int v = 0; v < t; v++) {

            n = scanner.nextInt();
            m = scanner.nextInt();

            char[][] chars = new char[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    chars[i][j] = scanner.next().charAt(0);
                }
            }
            int temp = 0;
            for (int i = 0; i < n; i++) {
                int count = 0;
                for (int j = 0; j < m; j++) {
                    if (chars[i][j] == '#') {
                        count++;
                    }
                    if (temp < count) {
                        temp = count;
                    }
                }
            }
            System.out.println(temp);
        }
    }
}
